// Being told that an unsorted array contains (n - 1) of n consecutive numbers (where the bounds are defined),
// find the missing number in O(n) time
// Input
// An array containing n-1 numbers, the lower bound and upper bound.
// ex:- [1, 4, 3] 1 4
// Output
// The missing number
// Example
// Sample Input:-
// [1, 4, 3] 1 4

// Sample Output:-
// 2

// Explanation:-
// From numbers 1 to 4, only 2 is missing from the array


function findMissingNumber(arrayOfIntegers, upperBound, lowerBound) {
    let sumOfInt = 0;
    for(let i = 0; i < arrayOfIntegers.length; i++)
    {
        sumOfInt +=arrayOfIntegers[i];
    }
    let upperLimit = (upperBound * (upperBound + 1))/2;
    let lowerLimit = (lowerBound * (lowerBound - 1))/2;

    let sum = upperLimit - lowerLimit;
    console.log(sum - sumOfInt);
    return sum - sumOfInt;
}
