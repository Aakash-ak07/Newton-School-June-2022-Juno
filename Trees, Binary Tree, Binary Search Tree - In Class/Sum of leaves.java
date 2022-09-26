//Given a Binary Tree, your task is to compute the sum of all leaf nodes in the tree.
//Note :- All the nodes in the tree are distinct 

/*
 class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

public static int sumOfLeaf(Node root)
{
    int sum = 0;
    if(root == null)
        return 0;
    
    if(root.left == null && root.right == null)
        sum += root.data;
    
    sum += sumOfLeaf (root.left);
    sum += sumOfLeaf (root.right);
    return sum;
}


// Sample Input:
// 2
// 3
// 10 8 34
// 2
// 48 36

// Sample Output:
// 42
// 36
