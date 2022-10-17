// You have N buckets of apples, ith bucket has bucket[i] apples.
// You plan to eat apples for the next M days. On jth day you take the bucket with maximum apples and eat day[j] apples from the bucket. if there is not enough apple in the bucket then you eat all the apples from that bucket.

// After M days, what is the maximum number of apples in any bucket?
// Input
// First line contains a single integer N.
// Next line contains n space separated integers.
// Third line contains M.
// Next line contains M space separated integers.

// Constraints
// 1 <= N, M<= 105
// 1 <= bucket[i], day[i] <= 109
// Output
// A single integer denoting required answer.
// Example
// Input:
// 3
// 12 17 10
// 4
// 10 8 6 9

// Output:
// 4

// Explanation:
// day1 =10 => buckets = {12, 17, 10 } => {12, 7, 10}
// day2 = 8 => buckets = {12, 7, 10 } => {4, 7, 10}
// day3 = 6 => buckets = {4, 7, 10} => { 4, 7, 4 }
// day4 = 9 => buckets = {4, 7, 4} => { 4, 0, 4 }
// on day4 we needed 9 apples, but the maximum in a bucket was only 7.

class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int apple[] = new int [n];
        for(int i = 0; i < n; i++)
        {
            apple[i] = sc.nextInt();
        }
        int m = sc.nextInt(); 
        ArrayList<Integer> day = new ArrayList<>();
        while(sc.hasNextInt())
        {
            int i = sc.nextInt();
            day.add(i);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(Integer b : apple)
        {
            pq.add(b);
        }
        while(!day.isEmpty())
        {
            if(day.get(0) > pq.peek())
            {
                pq.remove();
                pq.add(0);
                day.remove(0);
            }
            else
            {
                int leftApple = pq.peek() - day.get(0);
                pq.remove();
                day.remove(0);
                pq.add(leftApple);
            }
        }
        System.out.println(pq.peek()+ " ");
    }
}
