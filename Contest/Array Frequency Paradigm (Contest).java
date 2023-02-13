// You are given an array A of size N. For each of the indices i (1 <= i <= N), find the the smallest index j such that i < j and the frequency of Ai is lesser than or equal to that of Aj in the array.
// Input
// The first line of the input contains a single integer N.
// The second line of the input contains N space seperated integers.

// Constraints:
// 1 <= N <= 105
// 1 <= Ai <= 105
// Output
// For each of the indices i (1 <= i <= N), print the the smallest index j such that i < j and the frequency of Ai is lesser than or equal to that of Aj in the array. If there is no such index j, print -1 for that particular index i.
// Example
// Sample Input:
// 7
// 1 2 3 3 3 1 1

// Sample Output:
// 3 3 4 5 6 7 -1

// Explaination:
// For,
// i = 1, j = 3
// i = 2, j = 3
// i = 3, j = 4
// i = 4, j = 5
// i = 5, j = 6
// i = 6, j = 7
// i = 7, no such j exists


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else
            {
                map.put(arr[i], 1);
            }
        }  
        int f[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            f[i] = -1;
            for(int j = i + 1; j < n; j++)
            {
                if(map.get(arr[i]) <= map.get(arr[j] ))
                {
                    f[i] = j + 1;
                    break;
                }
            }
        }
        f[n -1] = -1;
        for(int i = 0; i < n; i++)
        {
            System.out.print(f[i] + " ");
        }
    }
}
