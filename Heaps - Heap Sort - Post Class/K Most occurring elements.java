// Given an array arr[] of N integers in which elements may be repeating several times. Also, a positive number K is given and the task is to find sum of total frequencies of K most occurring elements

// Note: The value of K is guaranteed to be less than or equal to the number of distinct elements in arr.
// Input
// First line of input contains number of testcases T. For each testcase, first line of input contains the size of array N, and next line contains N positive integers. The last line contains K.

// Constraints:
// 1 <= T <= 100
// 1 <= K <= N
// 1 <= N <= 10^4
// 1 <= arr[i] <= 10^6
// Output
// For each testcase, print the sum of total frequencies of K most occurring elements in the given array.
// Example
// Sample Input:
// 2
// 8
// 3 1 4 4 5 2 6 1
// 2
// 8
// 3 3 3 4 1 1 6 1
// 2

// Sample Output:
// 4
// 6

// Explanation:
// Testcase 1: Since, 4 and 1 are 2 most occurring elements in the array with their frequencies as 2, 2. So total frequency is 2 + 2 = 4.

// Testcase 2: Since, 3 and 1 are most occurring elements in the array with frequencies 3, 3 respectively. So, total frequency is 6.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Pair implements Comparable<Pair>
{
    int num, count;
    public Pair(int num, int count){
        this.num = num;
        this.count = count;
    }
    @Override
    public int compareTo(Pair obj)
    {
        return obj.count - this.count;
    }
}
class Main {
    public static void main (String[] args) {
                      // Your code here
        FastReader  sc = new FastReader();
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) 
            {
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            System.out.println(kMostOccurence(arr, n, k));
        }
    }

    public static int kMostOccurence(int arr[], int n, int k)
    {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(Integer x : arr) 
        {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> newMap : map.entrySet()) 
        {
            Pair p = new Pair(newMap.getKey(), newMap.getValue());
            pq.add(p);
        }
        int sum = 0;
        for(int i = 0; i < k; i++)
        {
            sum += pq.remove().count;
        }
        return sum;
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } 
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                if (st.hasMoreTokens()) {
                    str = st.nextToken("\n");
                } else {

                    str = br.readLine();
                }
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
