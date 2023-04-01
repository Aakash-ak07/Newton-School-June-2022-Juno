// A parentheses string is valid if and only if:

// 1. It is the empty string,
// 2. It can be written as AB (A concatenated with B), where A and B are valid strings, or
// 3. It can be written as (A), where A is a valid string.

// You are given a parentheses string s. In one move, you can insert a parenthesis at any position of the
// string.

// For example, if s = "()))", you can insert an opening parenthesis to be "(()))" or a closing parenthesis to be "())))".
// Return the minimum number of moves required to make s valid.
// Input
// User Task:
// Since this will be a functional problem, you don't have to take input. You just have to complete the function minAddToMakeValid() that takes string "s" as parameters.

// Constraints:
// 1 ≤ s.length ≤ 1000
// s[i] is either '(' or ')'.
// Output
// Return the minimum number of moves required to make s valid.
// Example
// Sample 1:
// Input: s = "())"
// Output: 1

// Sample 2:
// Input: s = "((("
// Output: 3

class Solution {
    public int minAddToMakeValid(String s) {
        int count = 0;
        int balCount = 0;

        for(char ch : s.toCharArray())
        {
            if(ch == '(')
                count++;
            else if(count > 0)
                count --;
            else    
                balCount++;
        }
        return count + balCount;
    }
}
