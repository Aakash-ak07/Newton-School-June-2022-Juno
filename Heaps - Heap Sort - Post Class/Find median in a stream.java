// Given an input stream of N integers. The task is to insert these numbers into a new stream and find the median of the stream formed by each insertion of X to the new stream.

// Note: Median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value. So the median is the mean of the two middle values.
// Input
// User Task:
// Since this will be a functional problem, you don't have to take input. You just have to complete the function
// getMedian() that takes X as parameter.

// Constraints:
// 1 <= N <= 10^5
// 1 <= X <= 10^5
// Output
// You need to return the median.
// Example
// Sample Input:
// 4
// 5
// 15
// 1
// 3

// Sample Output:
// 5.0
// 10.0
// 5.0
// 4.0

// Explanation:
// Testcase 1:
// Flow in stream : 5, 15, 1, 3
// 5 goes to stream --> median 5.0 (5)
// 15 goes to stream --> median 10.0 (5, 15)
// 1 goes to stream --> median 5.0 (5, 15, 1)
// 3 goes to stream --> median 4.0 (5, 15, 1, 3)

static PriorityQueue<Integer> minHeap = new PriorityQueue<>();
static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

public static double getMedian(int X)
{
     if(maxHeap.size() == 0 || maxHeap.peek() >= X)
        maxHeap.add(X);

     else
        minHeap.add(X);

     if(maxHeap.size() - minHeap.size() > 1)
        minHeap.add(maxHeap.remove());

     else if(minHeap.size() - maxHeap.size() > 1)
        maxHeap.add(minHeap.remove());

     if(maxHeap.size() > minHeap.size())
        return maxHeap.peek();

     else if(minHeap.size() > maxHeap.size())
        return minHeap.peek();

     return (maxHeap.peek() + minHeap.peek()) / 2.0;
}
