// Given an array A of size n, and an integer k. Find the maximum force by involving only k elements. Force of an element is the square of its value.

// Note: Elements are not needed to be continuous.
// Input
// The first line of the input contains two integers denoting n and k.
// Next line contains n integers denoting elements of the array.

// Constraints:
// 1 < = k < = n < = 1000
// -10^7 <= A[i] <= 10^7

// Functional problem, so implement the predefined function
// Output
// Output the maximum force.
// Example
// Sample Input:
// 4 4
// 1 2 3 4

// Output:
// 30

// Explanation:
// Force = 1*1 + 2*2 + 3*3 + 4*4 = 30

// Sample Input:
// 2 1
// 1 10

// Sample Output:
// 100


// arr is unsorted array of powers
// n is the number of elements in the array
// k is required number of elements

// write code here
// do not console.log the answer
// return the answer

function maxPower(arr, n, k) {
    if(k > n)
        return 0;
    arr.sort((a, b) => Math.abs(b) - Math.abs(a));

    let maxForce = 0;
    for(let i = 0; i < k; i++)
    {
        maxForce += arr[i]**2;
    }
    return maxForce;
}
