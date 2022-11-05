class Node {
    int data;
    // int height;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public static int getHeight(Node root) {
    if (root == null)
        return -1;
    return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
}
