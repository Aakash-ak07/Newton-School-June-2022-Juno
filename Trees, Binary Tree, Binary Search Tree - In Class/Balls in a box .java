// There are N boxes with balls inside them. Given an array A of N integer where A[i] denote the number of balls in ith box. In one move you can choose any box and remove exactly ceil(A[i]/2) elements. You can perform atmost K operations. You need to minimize the sum of balls in all the boxes.
// Input
// First line contains integers N and K.
// Next line contains N space separated integers denoting elements of array.

// Constraints
// 1 <= N <= 10^4
// 1 <= K <= 10^5
// 0 <= Ai<= 10^5
// Output
// Print the minimum sum of number of balls in all the boxes.
// Example
// Sample Input 1:
// 3 2
// 1 2 3

// Output
// 3

// Explanation:
// Move 1: We choose the ball at index 2. Array = {1, 2, 1}
// Move 2: We choose the ball at index 1. Array = {1, 1, 1}
// So total 3 balls remain after 2 moves and this is the minimum possible.

// Sample Input 2:
// 4 4
// 3 6 9 3

// Output
// 9

// Explanation
// Move 1: We choose the ball at index 2. Array = {3, 6, 4, 3}
// Move 2: We choose the ball at index 1. Array = {3, 3, 4, 3}
// Move 3: We choose the ball at index 2. Array = {3, 3, 2, 3}
// Move 4: We choose the ball at index 3. Array = {3, 3, 2, 1}
// So total 9 balls remain after 4 moves and this is the minimum possible.


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ; i < N ; i++)
        {
            pq.add(sc.nextInt());
        }
        for(int i = 0 ; i < K ; i++)
        {
            pq.add(pq.poll()/2);
        }
        int sum = 0;
        for(int i = 0 ; i < N ; i++)
        {
            sum += pq.poll();
        }
        System.out.println(sum);
    }
}
