// You have N coins with either an integer (between 0-9) written on one side and an english letter (a- z) written on the other side.

// The following statement must be true for all coins:
// If the coin has a vowel on one side, then it must have an even integer on other side.

// For example coin having 'b' and '3' is valid (since 'b' is not a vowel, other side can be anything), coin having 'a' and '4' is valid, but coin having 'a' and '5' is invalid.

// Now you're given just one side of each coin, find the minimum number of coins you need to flip to check the authenticity of the statement.
// Input
// The first and only line of input contains a string S, where each character in S depicts a side of the coin.


// Constraints:
// 1 ≤ |S| ≤ 50
// Output
// Output a single integer, the minimum number of coins you need to flip.
// Example
// Sample Input
// ee

// Sample Output
// 2

// Explanation: You need to flip both the coins to make sure an even integer is there on the other side of coin.

// Sample Input
// 0ay1

// Sample Output
// 2

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String coins = sc.next();
        int sum = 0;

        for(int i = 0; i < coins.length(); i++)
        {
            char c = coins.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' ||c == 'u') 
                sum++;
            else if(c >= '0' && c <= '9')
            {
                int num  = c - '0';
                if(num % 2 == 1)
                    sum++;
            }
        }
        System.out.println(sum);
    }
}
