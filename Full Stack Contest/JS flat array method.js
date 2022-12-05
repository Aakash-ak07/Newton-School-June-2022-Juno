// You have to complete a function that takes two parameters
// First parameter: an array which contains sub array in it at multi level
// Second parameter: an integer [depth]
// Now your task is to return a new array that have its sub array concatenated into it upto the given specified depth given in the parameter.
// Input
// the function findTheString(array, depth) take two parameters
// First Parameter: array which contains sub arrays
// Second parameter: depth which is an integer specifying till which depth we want to concatenate sub array elements
// Output
// the output will be an array with all sub array elements concatenated into it recursively up to the specified depth
// Example
// const array=[2,[3,[4]]]
// let depth=1
// const answer= findTheString(array,depth) //returns an array with 1 nested subarray concatenated
// console.log(answer) //[2,3,[4]]

// depth = 2
// const answer2 = findTheString(array,depth) // returns an array with 2 nested array concatenated
// console.log(answer2) // [2,3,4]


function findTheString(array,depth) {
    const flatNum = array.flat(depth);
  
    return flatNum;
}
