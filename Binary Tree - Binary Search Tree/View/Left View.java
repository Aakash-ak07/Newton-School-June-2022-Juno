// Print left view of a binary tree

// For example, the left view of the following binary tree is 1, 2, 4, 7

class Node{
    int data;
    Node left, right;

    public Node (int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinarytreeView {
    public static void main(String[] args) {
      Node root = new Node(1);
      root.left = new Node(2);
      root.right = new Node(3);
      root.left.right = new Node(4);
      root.right.left = new Node(5);
      root.right.right = new Node(6);
      root.right.left.left = new Node(7);
      root.right.left.right = new Node(8);

      leftView(root);
    }
  
    public static void leftView (Node root)
    {
        leftViewHelper(root, 1, 0);
    }
    public static int leftViewHelper(Node root, int level, int last) 
    {
      if(root == null)
          return last;

      if(last < level)
      {
          System.out.print(root.data + " ");
          last = level;
      }
      last = leftViewHelper(root.left, level+1, last);
      last = leftViewHelper(root.right, level+1, last);
      return last;
    }
}
