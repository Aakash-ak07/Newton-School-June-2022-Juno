// There are N wedding events that you need to attend. But there is a constraint. You can attend only one event per day. You are given two arrays X and Y of size N each. The ith event starts at day X[i] and ends at day Y[i]. You can attend an event i at any day d where X[i] <= d <= Y[i].
// Find the maximum number of events you can attend.
// Input
// First line contains an integer N.
// Next line contains N space separated integers denoting elements of array X.
// Next line contains N space separated integers denoting elements of array Y.

// Constraints
// 1 <= N <= 10^5
// 1 <= X[i] <= Y[i] <= 10^5
// Output
// Print the maximum number of events you can attend.
// Example
// Sample Input 1:
// 3
// 1 2 3
// 5 6 7

// Output
// 3

// Explanation:
// Attend event 1 at day 1, event 2 at day 2 and event 3 at day 3. So, you can attend all events.

// Sample Input 2:
// 4
// 1 2 3 1
// 2 3 4 2

// Output
// 4

// Explanation
// Attend event 1 at day 1,event 4 at day 2, event 2 at day 3 and event 3 at day 4. So, you can attend all events.


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Pair implements Comparable<Pair>
{
    int startDay;
    int endDay;
    public Pair(int startDay, int endDay)
    {
        this.startDay = startDay;
        this.endDay = endDay;
    }
    public int compareTo(Pair obj)
    {
        if(this.startDay == obj.startDay)
            return this.endDay - obj.endDay;
        else
            return this.startDay - obj.startDay;
    }
}
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int aX[] = new int[n];
        for(int i = 0; i < n; i++)
            aX[i] = sc.nextInt();

        int aY[] = new int[n];   
        for(int i = 0; i < n; i++)
            aY[i] = sc.nextInt();    
                
        int ans = weddingEvent(aX, aY, n);
        System.out.print(ans);
    }

    public static int weddingEvent(int[] startDay, int[] endDay, int n)
    {
        Pair[] p = new Pair[n];
        for(int i = 0; i < n; i++)
        {
            Pair day = new Pair(startDay[i], endDay[i]);
            p[i] = day;
        }
        Arrays.sort(p);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int idx = 0, count = 0;
        for(int i = 1; i < 100000; i++)
        {
            while(idx < n && p[idx].startDay == i)
            {
                pq.add(p[idx].endDay);
                idx++;
            }
            while(!pq.isEmpty() && pq.peek() < i)
            {
                pq.remove();
            }
            if(!pq.isEmpty())
            {
                pq.remove();
                count++;
            }
        }
        return count;
    }
}
