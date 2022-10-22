// Given an array arr[] and a number K where K is not greater than the size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.

// Note: Do Not Use sort() STL function, Use heap data structure.
// Input
// The input line contains T, denoting the number of testcases. Each test case consists of two lines. The first line of each test case contains two integers N and K. Second-line contains N space-separated integer denoting elements of the array.

// Constraints:
// 1 <= T <= 50
// 1 <= N <= 10000
// 1 <= K <= N
// 1 <= arr[i] <= 1000000
// Output
// Corresponding to each test case, print the kth smallest element in a new line.
// Example
// Sample Input
// 1
// 6 3
// 7 10 4 3 20 15

// Sample Output
// 7

// Explanation:
// Sorted array: 3 4 7 10 15 20, 7 is the third element


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            for(int i = 1; i <= n; i++)
            {
                pq.add(sc.nextInt());
            }
            for(int i = 1; i < k; i++)
            {
                pq.remove();
            }
            System.out.println(pq.peek());
            pq.clear();
        }
    }

    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader()
        {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next()
        {
            while(st == null || !st.hasMoreElements())
            {
                try{
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt()
        {
            return Integer.parseInt(next());
        }
        long nextLong()
        {
            return Long.parseLong(next());
        }
        String nextLine()
        {
            String str = "";
            try{
                if(st.hasMoreTokens())
                {
                    str = st.nextToken("\n");
                }
                else
                {
                    str = br.readLine();
                }
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}
