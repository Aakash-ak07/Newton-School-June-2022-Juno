// There are n rectangles of the same size: w in width and h in length. It is required to find a square of the smallest size into which these rectangles can be packed. Rectangles cannot be rotated.
// Input
// The first line of the input contains three space-separated integers w, h and n.

// Constraints
// 1 ≤ w, h, n ≤ 109
// Output
// Output the minimum length of a side of a square, into which the given rectangles can be packed.
// Example
// Sample Input :
// 2 3 10
// Sample Output:
// 9

// Explanation:
// 9 is the minimum size of the square in which all these rectangles can fit.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long width = sc.nextLong();
        long height = sc.nextLong();
        long n = sc.nextLong();

        long left = 1;
        long right = (long)(10e18) * 1l;
        long res = -1;

        while(left <= right)
        {
            long mid = left + (right - left) / 2;
            long sqr = mid;
            long y = sqr / width;
            long z = sqr / height;

            if(((z > 0 && y >= ((n - 1) / z + 1)) || (y > 0 && z >= ((n - 1) / y + 1))))
            {
                res = sqr;
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }
        }
        System.out.print(res);
    }
}
