// Given the root of a binary tree, return the sum of values of all leaf nodes.
// A leaf is node with no children.

// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode() {}
//     TreeNode(int val) { this.val = val; }
//     TreeNode(int val, TreeNode left, TreeNode right) {
//         this.val = val;
//         this.left = left;
//         this.right = right;
//     }
// }

class Solution { 
    static int sum = 0;
    public void sumOfLeaf(TreeNode root)
    {
        if(root == null)  return;
        if(root.left == null && root.right == null)   
            sum += root.val;
        
        sumOfLeaf(root.left);
        sumOfLeaf(root.right);
    }
    public int leafSum(TreeNode root){
        sum = 0;
        sumOfLeaf(root);
        return sum;
    }
}

  /* 2nd solution */
---------------------
// class Solution { 
//     static int sum = 0;
//     public int leafSum(TreeNode root){
//         if(root == null)
//             return 0;
        
//         if(root.left == null && root.right == null)
//             sum += root.val;
        
//         leafSum(root.left);
//         leafSum(root.right);
//         return sum;
//     }
// }
  
  
//   Input:
// 3 5 4 null 7

// output:
// 11

// Explanation:
// 3
// / \
// 5 7
// \
// 4
// 4 and 7 are the leaves .
