// There are N participants in a programming contest. You are given an integer array A of size N. The ith element of the array A denotes the score of the ith participant. Find the rank of all the participants. 1st place participant has the highest score, the 2nd place participant has the 2nd highest score, and so on. If two participants have same score, the participant with higher index will be placed above the participant with lower index in rank list.
// Input
// First line contains an integer N.
// Next line contains N space separated integers denoting elements of array.

// Constraints
// 1 <= N <= 10^5
// 1 <= Ai<= 10^5
// Output
// Print N space separated integers where the ith integer is the rank of the ith participant.
// Example
// Sample Input 1:
// 3
// 3 2 1

// Output
// 1 2 3

// Explanation:
// Participant 1 has highest score, so his rank is 1.
// Participant 2 has second highest score, so his rank is 2.
// Participant 3 has lowest score, so his rank is 3.

// Sample Input 2:
// 4
// 7 7 7 7

// Output
// 4 3 2 1

// Explanation
// As all participants have same score, the participant with higher index will be placed above in rank list.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Pair implements Comparable<Pair>
{
    int num, idx;
    public Pair(int num, int idx)
    {
        this.num = num;
        this.idx = idx;
    }
    public int compareTo(Pair obj)
    {
        if(this.num > obj.num) return -1;
        else if(this.num < obj.num) return 1;
        else{
            if(this.idx > obj.idx) return -1;
            else return 1;
        }
    }
}
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pair[] arr = new Pair[n];
        for(int i = 0; i < n; i++)
        {
            int ele = sc.nextInt();
            Pair temp = new Pair(ele, i);
            arr[i] = temp;
        }
        Arrays.sort(arr);
        for(int i = 0; i < n; i++)
        {
            arr[arr[i]. idx].num = i + 1;
        }
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i].num + " ");
        }
    }
}
