// Given a string S, find the longest palindromic substring in S. Substring of string S: S[ i . . . . j ] where 0 ≤ i ≤ j < len(S). Palindrome string: A string which reads the same backwards. More formally, S is palindrome if reverse(S) = S. If there are multiple such substrings, return the substring which occurs first (with the least starting index).

// NOTE: Required Time Complexity O(n^2).
// Input
// Input consist of a single line containing the string S

// 1 <= length of S <= 100
// Output
// Print the longest palindrome of the string given .
// Example
// Input:
// aaaabbaa

// Output:
// aabbaa

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static String longestPlaindromString(String str)
    {
        int max = 0;
        int start = 0;

        for(int i = 0; i < str.length(); i++)
        {
            int current = Math.max(stringLength(str, i , i), stringLength(str, i, i + 1));
            if(current > max){
                max = current;
                start = i - (current - 1) / 2;
            }
        }
        return str.substring(start, start + max);
    }
    public static int stringLength(String str,int l, int r)
    {
        while(l >= 0 && r <= str.length()-1 && str.charAt(l) == str.charAt(r))
        {
            l--;
            r++;
        }
        return r - l - 1;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(longestPlaindromString(str));
    }
}
