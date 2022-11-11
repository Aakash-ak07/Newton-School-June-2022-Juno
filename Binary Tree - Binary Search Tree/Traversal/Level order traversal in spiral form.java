// Complete the function to find spiral order traversal of a tree. For below tree, function should return 1, 2, 3, 4, 5, 6, 7.
// Example 1:

//     Input:
//           1
//         /   \
//        3     2
//     Output:1 3 2

//     Example 2:

//     Input:
//                10
//              /     \
//             20     30
//           /    \
//         40     60
//     Output: 10 20 30 60 40 

// Your Task:
// The task is to complete the function findSpiral() which takes root node as input parameter and returns the elements in spiral form of level order traversal as a list. The newline is automatically appended by the driver code.


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
    
    static Node buildTree(String str){
        
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
    void inOrder(Node node) 
    {
        if (node == null) 
            return;
          
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }
    
    public static void main (String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-- > 0)
        {
            String s = br.readLine();
            Node root = buildTree(s);
            Spiral g = new Spiral();
            ArrayList<Integer> result = g.findSpiral(root);
            for(int value : result)
            System.out.print(value + " ");
            System.out.println();
        }
    }
}

class Spiral
{
    ArrayList<Integer> findSpiral(Node root) 
    {
        ArrayList<Node> list = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
        int level = 0;
        
        if(root == null)
            return res;
        
        st.add(root);
        while(!st.isEmpty())
        {
            int size = st.size();
            for(int i = 0; i < size; i++)
            {
                Node temp = st.pop();
                res.add(temp.data);
                if(level % 2 == 0)
                {
                    if(temp.right != null)
                    {
                        list.add(temp.right);
                    }
                    if(temp.left != null)
                    {
                        list.add(temp.left);
                    }
                }
                else
                {
                    if(temp.left != null)
                    {
                        list.add(temp.left);
                    }
                    if(temp.right != null)
                    {
                        list.add(temp.right);
                    }
                }
            }
            for(Node i : list)
            {
                st.add(i);
            }
            list.clear();
            level++;
        }
        return res;
    }
}
