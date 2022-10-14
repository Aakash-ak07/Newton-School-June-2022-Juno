// Given two integer array A and B of size N and an integer K. You need to perform N operations, where in the ith operation you append the integer B[i] to array A. Find the kth largest element after each operation.
// Note: The kth largest element is the kth element in the sorted order, not the kth distinct element.
// Input
// First line contains two integers N and K.
// Next line contains N space separated integers denoting elements of array A.
// Next line contains N space separated integers denoting elements of array B.

// Constraints
// 1 <= N <= 10^5
// 1 <= Ai<= 10^5
// 1 <= K <= N
// Output
// Print N space separated integers denoting the kth largest element after each operation.
// Example
// Sample Input 1:
// 4 3
// 4 5 8 2
// 3 5 10 9

// Output
// 4 5 5 8

// Explanation:
// Initially, Array = {4, 5, 8, 2}
// Insert 3. Array = {4, 5, 8, 2, 3} 3rd largest element = 4
// Insert 5. Array = {4, 5, 8, 2, 3, 5} 3rd largest element = 5
// Insert 10. Array = {4, 5, 8, 2, 3, 5, 10} 3rd largest element = 5
// Insert 9. Array = {4, 5, 8, 2, 3, 5, 10, 9} 3rd largest element = 8

// Sample Input 2:
// 3 2
// 4 5 6
// 1 2 3

// Output
// 5 5 5

// Explanation
// Initially, Array = {4, 5, 6}
// Insert 1. Array = {4, 5, 6, 1} 2nd largest element = 5
// Insert 2. Array = {4, 5, 6, 1, 2} 2nd largest element = 5
// Insert 3. Array = {4, 5, 6, 1, 2, 3} 2nd largest element = 5
----------------------

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
                      // Your code here
        FastReader sc = new FastReader();
        int n = sc.nextInt(); 
        int k = sc.nextInt(); 
        ArrayList<Integer> List = new ArrayList<Integer>();
        for(int i = 0; i < n; i++)
        {
            int num = sc.nextInt();
            List.add(num); 
        }
        ArrayList<Integer> List2 = new ArrayList<Integer>();
        for(int i = 0; i < n; i++)
        {
            int num2 = sc.nextInt();
            List2.add(num2); 
        }
        for(int i = 0; i < n; i++)
        {
            int large = kThLargestElement(List, List2, i, k);
            System.out.print(large + " ");
        }
    }

    public static int kThLargestElement(ArrayList<Integer> List, ArrayList<Integer> List2, int a, int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        // PriorityQueue<Integer> pq = new PriorityQueue<>((x,y)->Integer.compare(y,x));     // we can also use this
        List.add(List2.get(a));
        for(int i = 0; i < List.size(); i++)
        {
            pq.add(List.get(i));
        }
        for(int i = 1; i < k; i++)
        {
            pq.poll();
        }
        return pq.peek();
    }
    
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next()
        {
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

        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }

        String nextLine()
        {
            String str = "";
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
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
    
----------------------
//2nd Solution
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int k = sc.nextInt(); 
        int idx = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();  //min heap
        for(int i = 0; i < k; i++)
        {
            int a = sc.nextInt();
            pq.add(a);
            idx++;
        }
        for(int i = 0; i < 2 * n-k; i++)
        {
            int b = sc.nextInt();
            idx++;
            if(b > pq.peek())   
            {
                pq.remove();    // remove 
                pq.add(b);
            }
            if(idx > n)
            {
                System.out.print(pq.peek() + " ");
            }
        }
    }
}
