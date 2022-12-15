// Print unique values from an array containing only numbers.
// Complete the given function such that it returns unique numbers from the array given as input.
// Input
// `arrOfNum` is an array of numbers only
// Output
// The function should return an array containing only the unique numbers from the input array
// Example

// const inputArr = [1,2,2,4,5,6,6];
// uniqueNumber(inputArr) // returns an array [1,2,4,5,6] , while the input array contained 2 duplicates

function uniqueNumber(arrOfNum){
    return Array.from (new Set(arrOfNum));
}
