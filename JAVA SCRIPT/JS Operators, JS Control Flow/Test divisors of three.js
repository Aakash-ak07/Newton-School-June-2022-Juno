// You will be given 2 parameters: a low and high number. Your goal is to print all numbers between low and high,
// and for each of these numbers print whether or not the number is divisible by 3. If the number is divisible by 3,
// print the word "div3" directly after the number.
// Input
// 2 numbers, one will be low and other high.

// 0<=low<=high<=10000
// Output
// If the number is divisible by 3, print the word "div3" directly after the number.
// Example
// Sample input:-
// 1 6

// Sample output:-
// 1 2 3 div3 4 5 6 div3


function test_divisors(low, high) {
    let ans = '';
    for(let i = low; i <= high; i++)
    {
        ans += (i + ' ');
        if(i % 3 === 0)
        {
            ans +='div3 ';
        }
    }
    console.log(ans);
}
