// Given a binary tree, count the number of leaves in it. A node having no child node is called a leaf.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int left = 0, right = 0, count = 0;
        for(int i = 0; i < n; i++)
        {
            left = sc.nextInt();
            right = sc.nextInt();
            if(left == -1 && right == -1)
                count++;
        }
        System.out.print(count);
    }
// }

// Sample Input 1:
// 7
// 2 4
// 5 3
// -1 -1
// -1 7
// 6 -1
// -1 -1
// -1 -1

// Sample output 1:
// 3

// Explanation: Given binary tree
// 1
// / \
// 2 4
// / \ \
// 5 3 7
// /
// 6
// Node 3, 6, 7 are the leaves here
