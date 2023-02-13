// Given an integer Q representing the number of queries and an integer K. There are two types of queries:
// (i) 1 x : Add the number x to the stream
// (ii) 2 : Print the sum of last K numbers of the stream. If there are less than K numbers in the stream, print the sum of current stream.
// Process all the queries.
// Input
// First line contains two integers Q and K.
// Next Q lines contains the queries.

// Constraints
// 1 <= Q <= 10^5
// 1 <= x <= 10^5
// 1 <= K <= Q
// There is atleast one query of 2nd type.
// Output
// For each query of type 2, print the sum of last K numbers of the stream on a new line.
// Example
// Sample Input 1:
// 5 2
// 1 4
// 2
// 1 1
// 1 3
// 2

// Output
// 4
// 4

// Explanation:
// Initial Stream = {}
// Add 4. Stream = {4}
// Sum of last two elements = 4
// Add 1. Stream = {4, 1}
// Add 3. Stream = {4, 1, 3}
// Sum of last two elements = 4

// Sample Input 2:
// 3 1
// 1 1
// 2
// 2

// Output
// 1
// 1

// Explanation
// Initial Stream = {}
// Add 1. Stream = {1}
// Sum of last element = 1
// Sum of last element = 1

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[k];

        int sum = 0, start = 0, totalCount = 0;

        for(int i = 0; i < q; i++)
        {
            String queries = sc.next();
            if(queries.equals("1"))
            {
                int x = sc.nextInt();
                if(totalCount < k)
                {
                    arr[totalCount++] = x;
                    sum += x;
                }
                else
                {
                    sum = sum -arr[start % k] + x;
                    arr[start++ % k] = x;
                }
            }
            else if(queries.equals("2"))
            {
                System.out.println(sum);
            }
        }
    }
}
