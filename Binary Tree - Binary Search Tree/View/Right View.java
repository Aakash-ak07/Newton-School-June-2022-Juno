// Given a Binary Tree, print Right view of it. Right view of a Binary Tree is set of nodes visible when tree is viewed from right side.

// Right view of following tree is 1 3 7 8.

// 1
// / \
// 2 3
// / \ / \
// 4 5 6 7
// \
// 8


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

class BinarytreeView 
{
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);
 
        rightView(root);
    }
  
    public static void rightView(Node root)
    {
        rightViewHelper(root, 1, 0);
    }
  
    public static int rightViewHelper(Node root, int level, int max) {
        if(root == null)    return max;
        if(max < level)
        {
            System.out.print(root.data+ " ");
            max = level;
        }
        max = rightViewHelper(root.right, level+1, max);
        max = rightViewHelper(root.left, level+1, max);

        return max;
    }
}
