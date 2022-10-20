// Level Order Traversal Using Recursive ans Itrative 

// package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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

public class Traversal {
    public static int getHeight(Node root) {
        if (root == null)
            return -1;
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }

    // using recursion [O(n^2)]
    public static void levelOrder(Node root) {
        if (root == null)
            return;
        int height = getHeight(root);
        for (int i = 0; i <= height; i++) {
            printAtGivenLevel(root, i + 1);
            System.out.println();
        }
    }

    public static void printAtGivenLevel(Node root, int level) {
        if (root == null)
            return;
        if (level == 1) {
            System.out.print(root.data + " ");
        }
        printAtGivenLevel(root.left, level - 1);
        printAtGivenLevel(root.right, level - 1);
    }

    public static void main(String[] args) {
        Traversal tree = new Traversal(); // if use this remove static function ...

        Node root = new Node(2);
        root.left = new Node(7);
        root.right = new Node(5);
        root.left.left = new Node(2);
        root.left.right = new Node(6);
        root.right.right = new Node(9);
        root.right.right.left = new Node(4);
        root.left.right.left = new Node(5);
        root.left.right.right = new Node(11);

        Traversal.levelOrder(root);
        Traversal.levelOrderUsingQueue(root);
    }
  
  // without recursion Using Queue -- ItrativeMethod
    public static void levelOrderUsingQueue(Node root) {
        if (root == null)
            return;

        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        while (q.size() > 0) {
            Node top = q.remove();
            System.out.print(top.data + " ");

            if (top.left != null)
                q.add(top.left);

            if (top.right != null)
                q.add(top.right);
        }
    }
}


// Input Tree:
// 2
// / \
// 7 5
// / \ \
// 2 6 9
// / \ /
// 5 11 4

// OutPut:
// Recursion:
// 2
// 7 5
// 2 6 9
// 5 11 4

// Itrative:
// 2 7 5 2 6 9 5 11 4 5 11 4

