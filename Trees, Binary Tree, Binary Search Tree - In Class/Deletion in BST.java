// Given a Binary Search Tree (BST) and a node x, your task is to delete the node 'x' from the BST.
// If no node with value x exists then, do not make any changes

/*
// Information about the class
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
public static Node deleteInBST(Node root, int value) 
{
    if(root == null)
        return root;
    
    if(value < root.data)
        root.left = deleteInBST(root.left, value);
    
    else if(value > root.data)
        root.right = deleteInBST(root.right, value);
    
    else
    {
        if(root.left == null)
            return root.right;
        else if(root.right == null)
            return root.left;
        
        root.data = minValue(root.right);
        root.right = deleteInBST(root.right, root.data);
    }
    return root;
}

public static int minValue(Node root)
{
    int mVal = root.data;
    while(root.left != null)
    {
        mVal = root.left.data;
        root = root.left;
    } 
    return mVal;
}


// Input:
// 2
// 3
// 2 1 3 N N N N
// 2
// 9
// 1 N 2 N 8 5 11 4 7 9 12
// 9

// Output:
// 1 3
// 1 2 4 5 7 8 11 12

// Explanation:-
// Fortest1:-
// before deletion:-
// 2
// / \
// 1 3

// after deletion:-
// 1
// \
// 3
