
import java.util.ArrayList;

public class nodeToPath {
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

    static int idx = -1;

    public Node buildTree(int nodes[]) {
        idx++;
        // -1 represents null
        if (nodes[idx] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }

    // return true or false as data present or not
    public boolean findNode(Node root, int data) {
        if (root == null) {
            return false;
        }
        if (root.data == data) {
            return true;
        }
        boolean leftFind = findNode(root.left, data);
        if (leftFind) {
            return true;
        }
        boolean rightFind = findNode(root.right, data);
        if (rightFind) {
            return true;
        }

        return false;
    }

    // node to root path
    public static ArrayList<Integer> nodeToRootPath(Node root, int data) {
        if (root == null) {
            return new ArrayList<>();
        }
        if (root.data == data) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(root.data);
            return list;
        }
        ArrayList<Integer> llist = nodeToRootPath(root.left, data);
        if (!llist.isEmpty()) {
            // if(llist!=null)
            llist.add(root.data);
            return llist;
        }
        ArrayList<Integer> rlist = nodeToRootPath(root.right, data);
        if (!rlist.isEmpty()) {
            rlist.add(root.data);
            return rlist;
        }
        return new ArrayList<>();
    }

    // Node to root path with true and false.
    static ArrayList<Integer> pathnew;

    public boolean findNodeandPrintPath(Node root, int data) {
        if (root == null) {
            return false;
        }
        if (root.data == data) {
            pathnew.add(root.data);
            return true;
        }
        boolean leftFind = findNodeandPrintPath(root.left, data);
        if (leftFind) {
            pathnew.add(root.data);
            return true;
        }
        boolean rightFind = findNodeandPrintPath(root.right, data);
        if (rightFind) {
            pathnew.add(root.data);
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nodes = { 50, 25, 12, -1, -1, 37, -1, -1, 75, 62, -1, -1, 18, -1, -1 };
        nodeToPath tree = new nodeToPath();
        // build tree
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        // find the node and return true or false
        System.out.println(tree.findNode(root, 100));

        // return path
        // ArrayList<Integer> path= nodeToRootPath(root,62);
        // System.out.println(path);

        pathnew = new ArrayList<>();
        System.out.println(tree.findNodeandPrintPath(root, 18));
        if (pathnew.isEmpty()) {
            System.out.println("not found ");
        } else {
            System.out.println(pathnew);
        }

    }
}
