// Given a string S of digits. Your task is to generate all possible IP addresses from the given string.

// Note:- A valid IP address consists of exactly four integers, each integer is between 0 and 255, separated by single dots and cannot have leading zeros. For example, "0.1.2.201" and "192.168.1.1" are valid IP addresses and "0.011.255.245", "192.168.1.312" and "192.168@1.1" are invalid IP addresses.
// Input
// Input contains a single string S.

// Constraints:-
// 4 <= |S| <= 12
// S will contain digits from 1 to 9.
// Output
// Print all the IP addresses in sorted order.

// Note:- It is guaranteed that at least one ans will exist.
// Example
// Sample Input:-
// 12345

// Sample Output:-
// 1.2.3.45
// 1.2.34.5
// 1.23.4.5
// 12.3.4.5

// Sample Input:-
// 1111

// Sample Output:-
// 1.1.1.1

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int lnth = str.length();
        TreeMap<String, Integer> map = new TreeMap<>();
        for(int i = 1; i < 4 && i < lnth-2; i++)
        {
            for(int j = i + 1; j < i + 4 && j < lnth-1; j++)
            {
                for(int k = j + 1; k < j + 4 && k < lnth; k++)
                {
                    if(ipAddress(str.substring(0, i)) && ipAddress(str.substring(i, j)) && ipAddress(str.substring(j, k)) && ipAddress(str.substring(k, lnth)) )
                    {
                        String ans = str.substring(0, i) + "." + str.substring(i, j) + "." + str.substring(j, k) + "." + str.substring(k, lnth); 
                        if(!map.containsKey(ans));
                            map.put(ans, 1);
                    }
                }
            }
        }
        for(String ans : map.keySet())
        {
            System.out.println(ans);
        }
        sc.close();
    }

    public static boolean ipAddress(String str){
        if(str.length() == 0 || str.length() > 3 || Integer.parseInt(str) > 255 || str.charAt(0) == '0' && str.length() > 1)
            return false;
        else
            return true;
    }
}
