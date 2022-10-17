// There are N water taps, arranged in binary tree like structure such that the horizontal distance between any two adjacent tap is 1 unit. Every water tap releases certain units of water everyday.
// All water taps are open simultaneously and water flows vertically down. You are storing water in infinite size buckets. Buckets have been placed on every unit distance such that no water falls on ground.

// You are given the uppermost water tap, return the maximum water stored in any bucket in a single day.
// Input
// You don't have to input anything.

// Constraints:
// 1 <= Number of taps <= 10^5
// 0 <= water units released by tap <= 10^9
// Output
// You don't have to output anything. You just need to implement the function and return the value.
// Example
// Input:
// 3 5 8 null 7 null 2

// output:
// 10

//       Explanation:
//       3
//       / \
//       5 8
//       \ \
//       7 2

// water stored in buckets : [ ... 0 , 0 , 5 , 10 ,8 , 2 , 0 , .... ]



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
   static HashMap<Integer, Integer> map = new HashMap<>();
   public Integer maxWaterInBucket(TreeNode root){
      helper(root, 0);
      ArrayList<Integer> list = new ArrayList<>();
      for(int val : map.values())
         list.add(val);
      
      Collections.sort(list, Collections.reverseOrder());
      return list.get(0);
   }

   public void helper(TreeNode root, int level)
   {
      if(root == null)
         return;
      
      if(map.containsKey(level))
      {
         int val = map.get(level);
         map.put(level, val+ root.val);
      }
      else
      {
         map.put(level, root.val);
      }
      helper(root.left, level - 1);
      helper(root.right, level + 1);
   }
}
