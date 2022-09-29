// Given a root node reference of a BST and a key, delete the node with the given key in the BST. Return the root node reference (possibly updated) of the BST.
// Basically, the deletion can be divided into two stages:
// 1. Search for a node to remove.
// 2. If the node is found, delete the node.

/*
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
*/

public static TreeNode deleteNode(TreeNode root, int key) {
    if(root == null)
        return root;
    
    if(key < root.val)
        root.left = deleteNode(root.left, key);
    
    else if(key > root.val)
        root.right = deleteNode(root.right, key);
    
    else
    {
        if(root.left == null)
            return root.right;
        else if(root.right == null)
            return root.left;
        
        root.val = minValue(root.right);
        root.right = deleteNode(root.right, root.val);
    }
    return root;
}

public static int minValue(TreeNode root)
{
    int mVal = root.val;
    while(root.left != null)
    {
        mVal = root.left.val;
        root = root.left;
    } 
    return mVal;
}


// Sample Input:
// 5 3 6 2 4 null 7
// 3
// Sample Output
// 5 4 6 2 null null 7

// Explanation:
// Given key to delete is 3. So we find the node with value 3 and delete it.

// 5 5
// / \ / \
// 3 6 ------> 4 6
// / \ \ / \
// 2 4 7 2 7
