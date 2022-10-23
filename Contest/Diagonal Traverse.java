// Given a 2D integer array nums, output all elements of nums in diagonal order as shown in the below images.
//     1 2 3
//     4 5 6
//     7 8 9
//   For this array output will be 1 4 2 7 5 3 8 6 9
//   Input
// First line will contains an integer 'row' represents number of rows, and next 'row' line contains 'row' arrays, each row contains an integer 'col' and col elements of rowth row.

// Constraints:
// 1<= col,row <= 100000
// 1<= total number of elements <= 100000
// 1<= nums[i][j] <= 100000
// Output
// Output all elements of nums in diagonal order.
// Example
// Sample Input:
//   5
//   5 1 2 3 4 5
//   2 6 7
//   1 8
//   3 9 10 11
//   5 12 13 14 15 16

// Sample Output:
// 1 6 2 8 7 3 9 4 12 10 5 13 11 14 15 16
// Explanation:
//   1 2 3 4 5 
//   6 7
//   8
//   9 10 11
//   12 13 14 15 16



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> nums = new ArrayList<>();
        int row = sc.nextInt();
        for(int i = 0; i < row; i++){
            int col = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j < col; j++)
            {    
                int in = sc.nextInt();
                list.add(in);
            }
            nums.add(list);
        }
        findDiagonal(nums);
    }

    public static void findDiagonal(List<List<Integer>> nums)
    {
        int n=0, i=0, maxKey=0;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int r=nums.size()-1; r>=0; r--){
            for(int c = 0; c < nums.get(r).size(); c++)
            {
                map.putIfAbsent(r + c, new ArrayList<>());
                map.get(r + c).add(nums.get(r).get(c));
                maxKey = Math.max(maxKey, r+c);
                n++;
            }
        }
    
        for(int key = 0; key <= maxKey; key++){
            List<Integer>value = map.get(key);
            if(value == null)
              continue;
            for(int v:value)
            {
                System.out.print(v+" ");
            }
        }
    }
}
