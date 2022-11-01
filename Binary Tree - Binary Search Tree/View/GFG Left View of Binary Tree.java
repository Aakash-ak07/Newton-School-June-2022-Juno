// Given a Binary Tree, print Left view of it. Left view of a Binary Tree is set of nodes visible when tree is visited from Left side. The task is to complete the function leftView(), which accepts root of the tree as argument.
// Left view of following tree is 1 2 4 8.

//               1
//            /     \
//          2        3
//        /     \    /    \
//       4     5   6    7
//        \
//          8   

//     Example 1:

//     Input:
//        1
//      /  \
//     3    2
//     Output: 1 3


//GFG FULL CODE
//{ Driver Code Starts
import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

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

class GfG {
    
    public static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    public static void printInorder(Node root)
    {
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        printInorder(root.right);
    }
    
	 public static void main (String[] args) throws IOException
   {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-- > 0)
        {
            String s = br.readLine();
            Node root = buildTree(s);
            Tree g = new Tree();
            ArrayList<Integer> result = g.leftView(root);
            for(int value : result)
            {
              System.out.print(value + " ");
            }
            System.out.println();     
        }
   }
}


//1st solution
class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
        ArrayList<Integer> list = new ArrayList<>();
        helper(root, list, 0);
        return list;
    }
    
    public void helper(Node root, ArrayList<Integer>aL, int level)
    {
        if(root == null)
            return;
        
        if(aL.size() == level)
            aL.add(root.data);
        
        helper(root.left, aL, level+1);
        helper(root.right, aL, level+1);
    }
}



//2nd solution using Queue

ArrayList<Integer> leftView(Node root)
{
    ArrayList<Integer> list = new ArrayList<Integer>();
    Queue<Node> queue = new LinkedList<Node>();
    if(root == null){
        return list;
    }

    queue.offer(root);
    while(!queue.isEmpty())
    {
        int size=queue.size();
        ArrayList<Integer> temp=new ArrayList<Integer>();
        for(int i = 0; i < size; i++)
        {
            Node node = queue.poll();
            temp.add(node.data);
            if(node.left != null)
            {
                queue.offer(node.left);
            }
            if(node.right != null)
            {
                queue.offer(node.right);
            }
        }
        list.add(temp.get(0));
    }
    return list;
}
