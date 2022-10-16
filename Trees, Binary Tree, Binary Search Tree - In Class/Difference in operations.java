// Given the root of a binary search tree. Calculate the difference between the product and sum of minimum and maximum elements of the binary search tree.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> tree = new TreeSet<>();

        int n = sc.nextInt();  
        for(int i = 0; i < n; i++) 
        {
            tree.add(sc.nextInt());
        }    
        int product = tree.first() * tree.last();
        int sum = tree.first() + tree.last();
        int diff = product - sum;

        System.out.println(diff);
    }
}

// Sample Input 1:
// root = 4 2 6 1 3

// Sample Output 1:
// -1
// Explanation: Product of maximum and minimum element is 6 and their sum is 7 so difference between these two is -1.
