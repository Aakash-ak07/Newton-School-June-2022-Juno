// Given a string S. You need to sort the string in decreasing order based on the frequency of the characters. If two characters have equal frequency, first print the character which is lexicographically larger.
// Input
// First line contains the string S.

// Constraints:
// 1 <= |S| <= 10^5
// Output
// Print the sorted array according to the above rules.
// Example
// Sample Input 1:
// tree

// Output
// eetr

// Explanation:
// 'e' has frequency of 2, which is highest. 'r' and 't' have same frequency, so first print t and then r.

// Sample Input 2:
// cccaaa

// Output
// cccaaa

// Explanation
// 'c' and 'a' have same frequency, so first print 'c' and then 'a'.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework


class Pair implements Comparable<Pair>{
    char c;
    int freq;
    public Pair(char c, int freq)
    {
        this.c = c;
        this.freq = freq;
    }
    @Override
    public int compareTo(Pair obj)
    {
        if(this.freq > obj.freq) return -1;
        else if(this.freq < obj.freq) return 1;
        else{
            if(this.c > obj.c)  return -1;
            else if(this.c < obj.c)  return 1;
        }
        return 1;
    }
}
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++)
        {
            if(!map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i), 1);
            }
            else
            {
                int idx = map.get(str.charAt(i));
                map.put(str.charAt(i), idx + 1);
            }
        }
        Pair arr[] = new Pair[map.size()];
        int j = 0;
        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
            arr[j++] = new Pair(entry.getKey(),entry.getValue());
        }
        Arrays.sort(arr);
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < arr.length; i++)
        {
            for(int k = 0; k < arr[i].freq; k++)
            {
                ans.append(arr[i].c);
            }
        }
        System.out.print(ans.toString());
    }
}
