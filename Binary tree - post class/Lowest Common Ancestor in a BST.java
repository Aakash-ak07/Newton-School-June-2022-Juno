// Given a Binary Search Tree and 2 node value n1 and n2, your task is to find the lowest common ancestor(LCA) of the two nodes given.
// It may happen that values n1 and n2 may or may be not present.

// Note: Duplicates are not inserted in the BST.

/*
// Information about the class Node
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

static Node LCA(Node root, int n1, int n2) 
{
    if(root == null)    return null;
    // if n1 and n2 both are smaller then root data return left LCA
    if(root.data > n1 && root.data > n2)
        return LCA (root.left, n1, n2);
    // if n1 and n2 both are grater then root data return right LCA
    if(root.data < n1 && root.data < n2)
        return LCA (root.right, n1, n2);
    
    return root;
}

// Sample Input
// 2
// 5 4 6 3 N N 7 N N N 8
// 7 8
// 2 1 3
// 1 3

// Sample Output
// 7
// 2

// Explanation:
// Testcase1:
// The BST in above test case will look like
// 5
// / \
// 4 6
// / \
// 3 7
// \
// 8
// Here the LCA of 7 and 8 is 7.
