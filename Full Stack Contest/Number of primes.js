// Given a number n find the number of prime numbers less than equal to that number.
// Input
// There is only one integer containing value of n.

// Constraints:-
// 1 <= n <= 10000000
// Output
// Return number of primes less than or equal to n
// Example
// Sample Input
// 5

// Sample Output
// 3

// Explanation:-
// 2 3 and 5 are the required primes.

// Sample Input
// 5000

// Sample Output
// 669

// You need to return the count of Primes less than equal to N
// N: input number


function numberOfPrimes(N)
{
    let count = 0;
    const isPrime = Array(N).fill(true);
    for(let i = 2; i < N; i++)
    {
        if(isPrime[i])
        {
            count++;
            for(let j = i; j < N; j += i)
            {
                  isPrime[j] = false;
            }
        }
    }
    return count++;
}
