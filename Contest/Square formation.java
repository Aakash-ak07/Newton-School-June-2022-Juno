// You are given an integer array matchsticks where matchsticks[i] is the length of the ith matchstick. You want to use all the matchsticks to make one square. You should not break any stick, but you can link them up, and each matchstick must be used exactly one time.

// print true if you can make this square and false otherwise.
// Input
// First line contain a single integer N.
// Next line contain N space separated integers denoting length of each matchstick.

// Constraints:
// 1 <= matchsticks. length <= 15
// 1 <= matchsticks[i] <= 10^8
// Output
// print true if we can form using all available matchstick.
// Example
// Sample Input 1:
// 5
// 1 1 2 2 2
// Sample Output 1:
// true

// Explanations:
// You can form a square with length 2, one side of the square came two sticks with length 1

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static boolean squareFormation(int[] arr)
    {
        int total = 0;
        for(int i : arr)
        {
            total += i;
        }
        if(total % 4 != 0)
            return false;
        Arrays.sort(arr);
        return helper(arr, arr.length-1, 0, 0, 0, 0, total/4);
    }

    public static boolean helper(int arr[], int idx, int top, int bottom, int left, int right, int target)
    {
        if(top == target && bottom == target && left == target && right == target)
            return true;
        if(top > target || bottom > target || left > target || right > target)
            return false;
        
        int value = arr[idx];

        boolean temp = helper(arr, idx-1, top + value, bottom, left, right, target);
            if(temp)    return true;
        boolean temp2 = helper(arr, idx-1, top, bottom + value, left, right, target);
            if(temp2)   return true;
        boolean temp3 = helper(arr, idx-1, top, bottom, left + value, right, target);
            if(temp3)   return true;
        boolean temp4 = helper(arr, idx-1, top, bottom, left, right + value, target);
            if(temp4)   return true;
        
        return false;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        boolean res = squareFormation(arr);
        if(res == false)
            System.out.print("false");
        else
            System.out.print("true");
    }
}


----------------
 //2nd solution
----------------
  
class Main {
    public static boolean helper(int arr[],int i,int sides[])
    {
        if(i == arr.length)
        {
            return (sides[0] == 0 && sides[1] ==0 && sides[2] == 0 && sides[3] ==0);
        }
        for(int j=0;j<4;j++)
        {
            if(arr[i]>sides[j]) continue;
            sides[j] -= arr[i];
            if(helper(arr,i+1,sides)) return true;
            sides[j] += arr[i];
        }
        return false;
    }
  
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = in.nextInt();
        }
        if(arr.length<4){
            System.out.println(false);
            return;
        } 
        int perimeter = 0;
        for(int i=0;i<arr.length;i++)
        {
            perimeter += arr[i];
        }  
        if(perimeter%4 != 0)
        {
            System.out.println(false);
            return;
        } 
        else
        {
            int side = perimeter/4;
            int sides[] = {side,side,side,side};
            boolean ans = helper(arr,0,sides);
            System.out.println(ans);
        }              
    }
}
  
  
  
