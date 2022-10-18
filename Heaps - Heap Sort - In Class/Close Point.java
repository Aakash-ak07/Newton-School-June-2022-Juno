// Given two arrays X and Y of size N each. These represent the coordinates of the points where the ith point is given by (X[i], Y[i]). You need to find K points that are closest to origin. The distance between two points is given by the Manhattan distance formula i. e. D = |x1- x2|+|y1- y2|

// If there are more than two points with same distance and you need to choose among them, choose the one which appears earlier in the array.
// Print all the K points.
// Note: All the coordinates are integers.
// Input
// First line contains two integers N and K.
// Next line contains N space separated integers denoting elements of array X.
// Next line contains N space separated integers denoting elements of array Y.

// Constraints
// 1 <= K <= N <= 10^5
// 1 <= Xi<= 10^5
// 1 <= Yi<= 10^5
// Output
// Print K lines where each line contains two space separated integers denoting the x and y coordinate of points arranged in the order of their distance in decreasing order. If two points have same distance, print the point which has higher index before printing point with same distance of lower index.
// Example
// Sample Input 1:
// 3 1
// 1 2 3
// 5 6 7

// Output
// 1 5

// Explanation:
// Distance of Point 1 : (1+5) = 6
// Distance of Point 2 : (2+6) = 8
// Distance of Point 3 : (3+7) = 10
// Print the first point as it is closest to origin.

// Sample Input 2:
// 5 3
// 3 6 6 9 1
// 1 1 1 1 1

// Output
// 6 1
// 3 1
// 1 1

// Explanation
// Distance of Point 1 : (3+1) = 4
// Distance of Point 2 : (6+1) = 7
// Distance of Point 3 : (6+1) = 7
// Distance of Point 4 : (9+1) = 10
// Distance of Point 5 : (1+1) = 2
// Print the points 2, 1 and 5 as they are closest to origin.
// Point 2 and 3 have same distance but we choose the point which occur earlier.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Pair1 {
    int a;
    int b;
    public Pair1 (int a, int b)
    {
        this.a = a;
        this.b = b;
    }
}
class Pair implements Comparable <Pair>
{
    int x;
    int y;
    int gap;
    int idx;

    public Pair(int x, int y, int gap, int idx)
    {
        this.x = x;
        this.y = y;
        this.gap = gap;
        this.idx = idx;
    }
    @Override
    public int compareTo(Pair obj)
    {
        if(this.gap != obj.gap)
            return this.gap - obj.gap;
        else
            return this.idx - obj.idx;
    }
}
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arrX = new int[n];
        int[] arrY = new int[n];
        for(int i = 0; i < n; i++)
            arrX[i] = sc.nextInt();
    
        for(int i = 0; i < n; i++)
            arrY[i] = sc.nextInt();
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int i = 0; i < n; i++)
        {
            pq.add(new Pair (arrX[i], arrY[i], arrX[i] + arrY[i], i));
        }
        ArrayList<Pair1> list = new ArrayList<>();
        for(int i = 0; i < k; i++)
        {
            Pair p = pq.remove();
            Pair1 z = new Pair1(p.x, p.y);
            list.add(z);
        }
        for(int i = list.size() - 1; i >= 0; i--)
        {
            System.out.println(list.get(i).a + " " + list.get(i).b);
        }
    }
}
