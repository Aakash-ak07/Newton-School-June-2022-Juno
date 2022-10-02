// Given the root of binary tree of binary values i. e value of all nodes are either 0 or 1.
// A node X is said to be high node if xor of values of all nodes in subtree rooted at x is 1.

// Count the number of High Nodes in the tree.

// class TreeNode{
//    public int val;
//    public TreeNode left;
//    public TreeNode right;

//    public TreeNode(int val)
//    {
//       this.val = val;
//       this.left = null;
//       this.right = null;
//    }
// }


class Solution {
   static int ans;
   static int ans(TreeNode root)
   {
      if(root == null) return 0;

      int Xr = root.val;
      Xr ^= ans(root.left);
      Xr ^= ans(root.right);

      if(Xr == 1)
         ans++;
      
      return Xr;
   }
   public int countHighNode(TreeNode root){
      ans = 0;
      ans(root);

      return ans;
   }
}


// Input:
// 0 1 0 null 0 1

// Output:
// 3

// Explanation :
// 0 (1)
// / \
// (2) 1 0 (3)
// \ \
// (3) 0 1 (5)

// Subtrees rooted at node 5, 2, 3 are high.
