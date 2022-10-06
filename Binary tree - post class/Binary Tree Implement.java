// Binary Tree in Java

// Node creation
class Node {
    int key;
    Node left, right;

    public Node(int item) {
    key = item;
    left = right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree(int key) 
    {
      root = new Node(key);
    }

    BinaryTree() 
    {
      root = null;
    }

    // Traverse Inorder
    public void traverseInOrder(Node node) {
        if (node != null) 
        {
          traverseInOrder(node.left);
          System.out.print(" " + node.key);
          traverseInOrder(node.right);
        }
    }

    // Traverse Postorder
    public void traversePostOrder(Node node) {
      if (node != null) 
      {
        traversePostOrder(node.left);
        traversePostOrder(node.right);
        System.out.print(" " + node.key);
      }
    }

  // Traverse Preorder
    public void traversePreOrder(Node node) {
      if (node != null) 
      {
        System.out.print(" " + node.key);
        traversePreOrder(node.left);
        traversePreOrder(node.right);
      }
    }

   public static void main(String[] args) {
      BinaryTree tree = new BinaryTree();

      tree.root = new Node(1);
      tree.root.left = new Node(2);
      tree.root.right = new Node(3);
      tree.root.left.left = new Node(4);

      System.out.print("Pre order Traversal: ");
      tree.traversePreOrder(tree.root);
      System.out.print("\nIn order Traversal: ");
      tree.traverseInOrder(tree.root);
      System.out.print("\nPost order Traversal: ");
      tree.traversePostOrder(tree.root);
    }
}


------------------------------------
  
// Checking if a binary tree is a complete binary tree in Java

// Node creation
class Node {
  int data;
  Node left, right;

  Node(int item) {
    data = item;
    left = right = null;
  }
}

class BinaryTree {
  Node root;

  // Count the number of nodes
  int countNumNodes(Node root) {
    if (root == null)
      return (0);
    return (1 + countNumNodes(root.left) + countNumNodes(root.right));
  }

  // Check for complete binary tree
  boolean checkComplete(Node root, int index, int numberNodes) {

    // Check if the tree is empty
    if (root == null)
      return true;

    if (index >= numberNodes)
      return false;

    return (checkComplete(root.left, 2 * index + 1, numberNodes)
        && checkComplete(root.right, 2 * index + 2, numberNodes));
  }

  public static void main(String args[]) {
    BinaryTree tree = new BinaryTree();

    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.right = new Node(5);
    tree.root.left.left = new Node(4);
    tree.root.right.left = new Node(6);

    int node_count = tree.countNumNodes(tree.root);
    int index = 0;

    if (tree.checkComplete(tree.root, index, node_count))
      System.out.println("The tree is a complete binary tree");
    else
      System.out.println("The tree is not a complete binary tree");
  }
}




// Left child of 1 (index 0)
// = element in (2*0+1) index 
// = element in 1 index 
// = 12


// Right child of 1
// = element in (2*0+2) index
// = element in 2 index 
// = 9

// Similarly,
// Left child of 12 (index 1)
// = element in (2*1+1) index
// = element in 3 index
// = 5

// Right child of 12
// = element in (2*1+2) index
// = element in 4 index
// = 6
