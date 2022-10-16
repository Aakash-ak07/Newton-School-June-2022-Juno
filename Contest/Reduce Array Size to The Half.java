// Given an integer array A of size N. You can choose a set of integers and remove all the occurrences of these integers in the array. Find the minimum size of the set so that at least half of the integers of the array are removed.
// Input
// First line contains an integer N.
// Next line contains N space separated integers denoting elements of array.

// Constraints
// 1 <= N <= 10^5
// N is even.
// 1 <= Ai<= 10^5
// Output
// Print a single integer - the minimum size of the set.
// Example
// Sample Input 1:
// 4
// 7 7 7 7

// Output
// 1

// Explanation:
// The only possible set you can choose is {7}. This will make the new array empty.

// Sample Input 2:
// 8
// 3 3 3 5 5 2 2 7

// Output
// 2

// Explanation
// Choosing {3, 7} will make the new array [5, 5, 5, 2, 2] which has size 5 (i. e equal to half of the size of the old array).

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

class Pair implements Comparable<Pair>
{
    int key;
    int value;
    Pair(int key, int value)
    {
        this.key = key;
        this.value = value;
    }
    public int compareTo(Pair obj)
    {
        return obj.value - this.value;
    }
}
class Main {
    public static int reduceArraySize(int arr[], int n)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++)
        {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        PriorityQueue <Pair> pq = new PriorityQueue<>();
        for(Map.Entry<Integer, Integer> set : map.entrySet())
        {
            pq.add(new Pair(set.getKey(), set.getValue()));
        }
        int req = 0;
        int count = 0;
        for(int i = 0; i < pq.size(); i++)
        {
            Pair p = pq.remove();
            req = req + p.value;
            count++;

            if(req >= arr.length / 2)
                break;
        }
        return count;
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print(reduceArraySize(arr, n));
    }
}
