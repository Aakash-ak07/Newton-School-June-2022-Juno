// Given two binary trees, the task is to check if each of their levels are anagrams of each other or not. 

// Example 1:
//     https://practice.geeksforgeeks.org/problems/check-if-all-levels-of-two-trees-are-anagrams-or-not/1
// Input:

// Output: 1
// Explanation: 
// Tree 1:
// Level 0 : 1
// Level 1 : 3, 2
// Level 2 : 5, 4

// Tree 2:
// Level 0 : 1
// Level 1 : 2, 3
// Level 2 : 4, 5

// As we can clearly see all the levels of above two binary trees 
// are anagrams of each other, hence return true.

// Example 2:

// Input:

// Output: 0
// Explanation: 
// Tree 1:
// Level 0 : 1
// Level 1 : 2, 3 
// Level 2 : 5, 4 

// Tree 2: 
// Level 0 : 1 
// Level 1 : 2, 4 
// Level 2 : 5, 3 

// As we can clearly see that level 1 and leve 2 are not anagrams of each other, hence return false.


class Solution {
    public static boolean areAnagrams(Node node1, Node node2) {
        if(node1 == null && node2 == null)  return true;
        if(node1 == null || node2 == null)
            return false;
        
        if(node1.data != node2.data)
            return false;
            
        if(node1.data != node2.data)
            return false;
        
        return levelOrder(node1, node2);
    }
    
    public static boolean levelOrder(Node root1, Node root2)
    {
        // if(root == null)    return;
        
        Queue<Node> q1 = new LinkedList<>();
        Queue<Node> q2 = new LinkedList<>();
        q1.add(root1);
        q2.add(root2);
        
        while(true)
        {
            int num1 = q1.size();
            int num2 = q2.size();
            
            if(num1 != num2)    return false;
            if(num1 == 0) break;
            
            ArrayList<Integer> temp1 = new ArrayList<Integer>();
            ArrayList<Integer> temp2 = new ArrayList<Integer>();
            
            while(num1 > 0)
            {
                if(q1.peek().left != null) q1.add(q1.peek().left);
                if(q1.peek().right != null) q1.add(q1.peek().right);
                
                temp1.add(q1.poll().data);
                num1--;
                
                if(q2.peek().left != null) q2.add(q2.peek().left);
                if(q2.peek().right != null) q2.add(q2.peek().right);
                
                temp2.add(q2.poll().data);
            }
            Collections.sort(temp1);
            Collections.sort(temp2);
            
            if(!temp1.equals(temp2))
                return false;
        }
        return true;
    }
}
