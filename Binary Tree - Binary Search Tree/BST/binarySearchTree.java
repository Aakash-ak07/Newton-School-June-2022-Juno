
public class BinarySearchTree {
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        }
        if (root.data < val) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data > key) {
            return (search(root.left, key));
        } else if (root.data == key) {
            return true;
        } else {
            return (search(root.right, key));
        }
    }

    // search and return its subTree
    public Node searchAndReturnItsSubTree(Node root, int key) {
        if (root == null) {
            return null;
        }
        if (root.data > key) {
            return (searchAndReturnItsSubTree(root.left, key));
        } else if (root.data == key) {
            return root;
        } else {
            return (searchAndReturnItsSubTree(root.right, key));
        }
    }

    public Node deleNodeBST(Node root, int val) {
        if(root==null){
            return root;
        }
        if (root.data > val) {
            root.left = deleNodeBST(root.left, val);
        } else if (root.data < val) {
            root.right = deleNodeBST(root.right, val);
        } else {// if(root.data==val)
                // case 1
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2 when have 1 child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case 3 when to delete having two childs so fing inorder succesor
            Node ISuccesor = inOrderSucessor(root.right);
            root.data = ISuccesor.data;
            root.right=deleNodeBST(root.right, ISuccesor.data);

        }
        return root;

    }

    private Node inOrderSucessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public void printBST(Node root) {
        if (root == null) {
            return;
        }
        printBST(root.left);
        System.out.print(root.data + " ");
        printBST(root.right);
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = tree.insert(root, values[i]);
        }
        tree.printBST(root);
        // tree.search(root, 4);
        System.out.println();
        System.out.println(tree.search(root, 10));
        System.out.println();
        // display the subtree of the search one
        tree.printBST(tree.searchAndReturnItsSubTree(root, 4));
        System.out.println();
       //tree.printBST((tree.deleNodeBST(root, 5)));
       tree.deleNodeBST(root, 5);
       tree.printBST(root);

    }
