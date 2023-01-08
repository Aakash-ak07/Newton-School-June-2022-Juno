// Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

// A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
// Input
// There are two space separated strings s and t are given as input.

// 0 <= s.length <= 100
// 0 <= t.length <= 10^4
// s and t consist only of lowercase English letters.
// Output
// return true if s is a subsequence of t, or false otherwise.

// Example

// Sample Input:
// abc ahbgdc
// Sample Output:
// true
// Explanation: abc is a subsequence of ahbgdc.


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String t = sc.next();
        
        boolean isSubsequence = isSubsequence(str, t);
        System.out.println(isSubsequence);
    }

    public static boolean isSubsequence(String str, String t){
        int i = 0, j = 0;
        while(i < str.length() && j < t.length())
        {
            if(str.charAt(i) == t.charAt(j))
            {
                i++;
            }
            j++;
        }  
        return i == str.length();
    }
}
