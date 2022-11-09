// You are playing a number game where you will receive a number every day for the next N days. Game goes as follows : Every day you get a number, you include it into your list. You take the maximum number in the list, half it and put it back into the list. Initially the list is empty.

// You play the game for N days, what is the maximum number in your list after N days?
// Input
// First line contains a single integer N.
// Next line contains N space separated integers.

// Constraints
// 1 <= N <= 105
// 1 <= numbers <= 109
// Output
// A single integer denoting the answer.
// Example
// Input:
// 4
// 12 10 4 9

// Output:
// 5

// Explanation:
// first day => 12 => list = {12} => maximum is 12 so list = {6}
// second day => 10 => list = {6, 10} => maximum is 10 so list = {6, 5}
// third day => 4 => list = {6, 5, 4} => maximum is 6 so list = {3, 5, 4}
// fourth day => 9 => list = { 3, 5, 4, 9} => maximum is 9 so list = {3, 5, 4, 4}

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < n; i++)
        {
            pq.add(arr[i]);
            int val = pq.remove();
            int half = val / 2;
            pq.add(half);
        }
        System.out.println(pq.peek());
    }
}
