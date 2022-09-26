// Given a BST and some keys, the task is to insert the keys in the given BST. Duplicates are not inserted. (If a test case contains duplicate keys, you need to consider the first occurrence and ignore duplicates).
// User Task:
// Since this will be a functional problem. You don't have to take input. You just have to complete the function insertInBST() that takes "root" node and value to be inserted as parameter. The printing is done by the driver code.

/*
// Information about the Node class
class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}
*/

static Node insertInBST(Node root,int key)
{
    if(root == null)
        return new Node(key);

    else if(key == root.data)
        return root;

    else if(key < root.data)
        root.left = insertInBST(root.left, key);
    
    else
        root.right = insertInBST(root.right, key);

    return root;
}


// Input:
// 2
// 3
// 2 1 3
// 4
// 8
// 2 1 3 N N N 6 4
// 1

// Output:
// 1 2 3 4
// 1 2 3 4 6

// Explanation:
// Testcase 1: After inserting the node 4 the tree will be
// 2
// / \
// 1 3
// \
// 4
// Inorder traversal will be 1 2 3 4.
// Testcase 2: After inserting the node 1 the tree will be
// 2
// / \
// 1 3
// / \ / \
// N N N 6
// /
// 4
// Inorder traversal of the above tree will be 1 2 3 4 6.
