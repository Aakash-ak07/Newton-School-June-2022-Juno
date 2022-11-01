// Binary Tree - Print Top View of Binary Tree
/*
          1
        /   \
       2     3
        \   / \
         4 5   6
          / \
         7   8
         
 */        

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;



class Node {
    int data;
    int height;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Pair {
    int hd;
    Node root;

    public Pair(int hd, Node root) {
        this.root = root;
        this.hd = hd;
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
      
        topView(root);
        System.out.println("");
    }

    

    public static void topView(Node root) {
        if (root == null)
            return;

        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();

        Queue<Node> qu = new LinkedList<Node>();
        qu.add(root);

        while (!qu.isEmpty()) {
            Node temp = qu.remove();
            int hd = temp.height;

            if (map.get(hd) == null) {
                map.put(hd, temp.data);
            }
            if (temp.left != null) {
                temp.left.height = hd - 1;
                qu.add(temp.left);
            }
            if (temp.right != null) {
                temp.right.height = hd + 1;
                qu.add(temp.right);
            }
        }
        System.out.println(map.values());
    }
}
