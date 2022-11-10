// Given an array of N Books B[], where B[i] denotes the number of pages P in i'th book. Now you need to find the maximum number of distinct books (having a different number of pages) after removing K books from the array.
// Input
// The input line contains T, denoting the number of testcases. Each testcase contains two lines. First line contains N, number of books and K, number of books you need to remove. Second line contains N positive integers denoting the number of pages in ith book.

// Constraints:
// 1 <= T <= 100
// 1 <= N <= 10^4
// 1 <= K <= N
// // 1 <= B[i] <= 10^4
// Output
// You need to print the maximum number of distinct books.
// Example
// Sample Input:
// 2
// 7 3
// 5 7 5 5 1 2 2
// 6 4
// 1 2 3 4 5 6

// Sample Output:
// 4
// 2

// Explanation:
// Testcase 1:
// Remove 2 occurrences of books having 5 pages and 1 occurrence of book having 2 pages.

class Main {
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0)
        {
            HashSet<Integer> set = new HashSet<>();
            String str = br.readLine();
            String[] arr = str.split("");

            int n = Integer.parseInt(arr[0]);
            int k = Integer.parseInt(arr[1]);

            String page = br.readLine();
            String pagearr[] = page.split("");

            for(int i = 0; i < n; i++)
            {
                int element = Integer.parseInt(pagearr[i]);
                if(set.contains(element) && k > 0)
                    k--;
                else
                    set.add(element);
            }
            System.out.println(set.size() - k);
        }
    }
}
