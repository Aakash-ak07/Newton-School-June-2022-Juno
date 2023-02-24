// Given a string S. You can rearrange its letters in any way you want. You have to the find the maximum number of substrings in S which are equal to "abcda" after rearrangement.
// Input
// First line of input contains a single string S.

// Constraints:
// 1 <= |S| <= 100000
// String contains lowercase english letters.
// Output
// Output a single integer which is the maximum number of substrings in S which are equal to "abcda" after rearrangement.
  
// Example
// Sample Input
// cbdaaabcda

// Sample Output
// 2
// Explanation : we can rearrange the given string as abcdaabcda

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner inputTaker = new Scanner(System.in);
        String str = inputTaker.next();
        int a = 0, b = 0, c = 0, d = 0;
        for (int i = 0; i < str.length(); i++) 
        {
            if (str.charAt(i) == 'a') 
            {
                a++;
            } 
            else if (str.charAt(i) == 'b') 
            {
                b++;
            }
            else if (str.charAt(i) == 'c') 
            {
                c++;
            }
            else if (str.charAt(i) == 'd') 
            {
                d++;
            }
        }
        int minBCD = Math.min(b, c);
        int res = 0;
        minBCD = Math.min(minBCD, d);
        if (a > minBCD) 
        {
            res = minBCD;
        }
        else 
        {
            while (minBCD >= a && minBCD > 0) 
            {
                minBCD--;
            }
            res = minBCD;
        }
        System.out.print(res);
    }
}
