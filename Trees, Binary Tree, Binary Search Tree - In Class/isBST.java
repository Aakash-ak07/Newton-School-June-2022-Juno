// Given a binary tree with n nodes (numbered from 1 to n) having weight wi and left and right children (li, ri), find whether the given tree is BST or not.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Node {
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
class Main {
    public static boolean isBST (Node root, int min, int max)
    {
        if(root == null)
            return true;
        
        if(root.data < min)
            return false;
        else if (root.data > max)
            return false;
        
        return isBST(root.left, min, root.data-1) && isBST(root.right, root.data+1, max);
    }

    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node[] tree = new Node[n];
        for(int i = 0; i < n; i++)
        {
            int val = sc.nextInt();
            tree[i] = new Node(val);
        }
        int rootNode = sc.nextInt(); // denoting the position of rootNode from start index of array 
        for(int i = 0; i < n; i++)
        {
            int left = sc.nextInt();
            int right = sc.nextInt();
            if(left != 0)
                tree[i].left = tree[left-1];
            if(right != 0)
                tree[i].right = tree[right-1];
        }

        // tree[rootNode-1] -> denotes the root of the tree
        // as each node data can be greater than 0 and lesser than the Integer max value so min can be 0 and max can Integer.MAX_VALUE
        if(isBST(tree[rootNode-1], 0, Integer.MAX_VALUE))
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}


//2nd solution
----------------
class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
	}
}

class Main {

	public static boolean isBST(Node tree, int min, int max){
    	if(tree == null)
			return true;
		if(tree.data < min || tree.data > max)
			return false;
		return isBST(tree.left, min, tree.data - 1) && isBST(tree.right, tree.data + 1, max);
	}

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node[] tree = new Node[n];
		for(int i = 0; i < n; i++){
			int value = sc.nextInt();
			tree[i] = new Node(value);
		}
		int root = sc.nextInt();
		 for(int i = 0; i < n; i++){
			int left = sc.nextInt();
			int right = sc.nextInt();
			if(left != 0)
				tree[i].left = tree[left - 1];
			if(right != 0)
				tree[i].right = tree[right - 1];
		}

		if(isBST(tree[root-1], Integer.MIN_VALUE, Integer.MAX_VALUE)){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
}

// Sample Input
// 5
// 10 3 9 2 1
// 4
// 3 0
// 0 0
// 2 0
// 5 1
// 0 0

// Sample Output
// YES
