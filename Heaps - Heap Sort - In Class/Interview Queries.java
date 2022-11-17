// An interviewer is asking you questions in form of queries. For your assistance, he has provided you with an empty array. Queries are of 4 types:-
// (1 X) Add given element X to end of the array
// (2 X) Delete the first instance of given element X from the array(if element is not present print -1)
// (3) Return maximum element of the array.
// (4) Return minimum element of the array.
// See example for more clarification

// Input
// The first line contains an integer Q.
// The next Q lines will each contain a query as mentioned above:-

// Constraints:
// 1 <= Q <= 100000
// 1 <= X <= 100000
// Output
// For queries 3 and 4, print the answer in a new line. If the array is empty for query 2, 3 or 4, then print "-1" without the quotes.
// Example
// Sample Input:-
// 6
// 1 5
// 1 9
// 1 1
// 3
// 2 1
// 2 1

// Sample Output:-
// 9
// -1

// There are 5 queries.
// Query 1 -> 5 is added to the array.
// Query 2 -> 9 is added to the array.
// Query 3 -> 1 is added to the array.
// Query 4 -> The maximum element in the array is 9.
// Query 5 -> The element 1 is deleted from the array.
// Query 6 -> Since there is no element in the array with value 1, so the output is -1.



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int q = sc.nextInt();
            if(q == 1)
            {
                int val = sc.nextInt();
                minHeap.add(val);
                maxHeap.add(val);
            }
            else if(q == 2)
            {
                int val = sc.nextInt();
                boolean minPresent = minHeap.remove(val);
                boolean maxPresent = maxHeap.remove(val);
                if(!minPresent && !maxPresent)
                {
                    System.out.println(-1);
                }
            }
            else if(q == 3)
            {
                if(maxHeap.size() == 0)
                {
                    System.out.println(-1);
                }
                else{
                    System.out.println(maxHeap.peek());
                }
            }
            else{
                if(minHeap.size() == 0)
                {
                    System.out.println(-1);
                }
                else{
                    System.out.println(minHeap.peek());
                }
            }
        }
    }
}
