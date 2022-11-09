// You are given an array with all distinct elements which include all elements of a binary search tree in an increasing order manner (in-order traversal). But 2 element swapped their position. we have to print the sum of two swapped nodes.
// Input
// The first line contains a single integer N.
// The second line contains N space-separated integer A[i].
// Output
// Print sum of exchanged node value.
// Example
// Sample Input 1:
// 1 2 3 4 5 7 6

// Sample Output 1:
// 13


// Explanations:
// if we draw a BST from given array than we can observe that element 6 and 7 had swapped their position.
// So sum of these 2 is equal to 13.


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int [n]; 
        int[] arr2 = new int [n]; 
        for(int i = 0; i < n; i++)
        {
            arr1[i] = sc.nextInt();
            arr2[i] = arr1[i];
        }
        Arrays.sort(arr2);
        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            if(arr1[i] != arr2[i])
            {
                sum = arr1[i] + arr2[i];
                break;
            }
        }
        System.out.println(sum);
    }
}
