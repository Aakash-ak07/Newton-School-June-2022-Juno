// Monk is standing at the door of his classroom. There are currently N students in the class, i'th student got Ai candies.
// There are still M more students to come. At every instant, a student enters the class and wishes to be seated with a student who has exactly the same number of candies. For each student, Monk shouts YES if such a student is found, NO otherwise.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Node
{
    long data;
    Node left, right;

    public Node(long data)
    {
        this.data = data;
    }
}
class Main {
    public static Node insertNode(Node root, long value) 
    {
        if(root == null)
        {
            root = new Node(value);
            return root;
        }
        if(value > root.data)
            root.right = insertNode(root.right, value);   
        else
            root.left = insertNode(root.left, value);   
        
        return root;
    }

    public static boolean search(Node root, long value)
    {
        if(root == null)    return false;
        if(root.data == value)  return true;

        if(root.data > value)   
            return search(root.left, value);
        else
            return search(root.right, value);
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long arr[] = new long[n + m];
        Node root = null;
        for(int i = 0; i < arr.length; i++)
            arr[i] = sc.nextLong();
        
        for(int i = 0; i < n; i++)
            root = insertNode(root, arr[i]);
        
        for(int i = n; i < n+m; i++)
        {
            boolean flag = search (root, arr[i]);
            if(flag)
                System.out.println("YES");
            
            else
                System.out.println("NO");

            root = insertNode(root, arr[i]);
        }
    }
}


// Sample Input 1:
// 2 3
// 3 2 9 11 2

// Sample Output 1:
// NO
// NO
// YES

// Explanations:
// Initially students with 3 and 2 candies are in the class.
// A student with 9 candies enters, No student with 9 candies in class. Hence, "NO"
// A student with 11 candies enters, No student with 11 candies in class. Hence, "NO"
// A student with 2 candies enters, Student with 2 candies found in class. Hence, "YES"
