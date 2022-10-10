// Given an array of integers whose all elements are distinct and two numbers a
// and b. Find the sum of all elements between ath and bth smallest element
// (exclusive of a and b).
 
// Expected Time Complexity: O(N + b log(N))
// Input
//   First line contains an integer N - the size of array
//   Next line contains N space separated integers denoting elements of array.
//   Next line contains two space separated integer a and b.
  
//   Constraints
//   1 <=a < b <= N <= 10^5
//   1 <= Ai<= 10^5
//   Output
//   Print a single integer - the sum of all elements between ath and bth smallest
//   element (exclusive of a and b).
//   Example
//   Sample Input 1:
//   7
//   20 8 22 4 12 10 14
//   3 6
  
//   Output
//   26
  
//   Explanation:
//   3rd smallest element is 10. 6th smallest element is 20. Sum of all element
//   between 6 & 20 is 12 + 14 = 26
  
//   Sample Input 2:
//   3
//   3 2 1
//   1 2
  
//   Output
//   0
  
//   Explanation
//   1st smallest is 1 and 2nd smallest is 2. There are no elements between 1 and
//   2. So sum = 0.
 
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(sumBetweenAandBsmallest(arr, n, a, b));
    }

    public static int sumBetweenAandBsmallest(int arr[], int n, int a, int b) {
        Arrays.sort(arr);
        int sum = 0;
        for (int i = a; i < b - 1; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
