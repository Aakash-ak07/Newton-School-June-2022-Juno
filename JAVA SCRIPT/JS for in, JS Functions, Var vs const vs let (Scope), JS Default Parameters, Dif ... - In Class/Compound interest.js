// Write a program to find the compound interest for given principal amount P, time Tm(in years), and interest rate R.
// Note: Compound interest is the interest you earn on interest.
// This can be illustrated by using basic math: if you have $100 and it earns 5% interest each year, you'll have $105 at the end of the first year. At the end of the second year, you'll have $110.25

// Input
// The input contains three integers P, R, and Tm.

// Constraints:-
// 1 < = P < = 10^3
// 1 < = R < = 100
// 1 < = Tm < = 20
// Output
// Print the compound interest by 2 decimal places .
// Example
// Sample Input:
// 100 1 2

// Sample Output:-
// 2.01

// Sample Input:
// 1 99 2

// Sample Output:-
// 2.96


// You need to return Compound Interest
// P: principal value
// T: rate of interest
// T: time in years 
function calculateCI(P, R, T)
{
    return (P * (Math.pow((1 + R/ 100), T)) - P).toFixed(2)
}
