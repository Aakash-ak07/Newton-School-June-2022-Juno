// Write a JavaScript function with function name first to return the first n elements of an array.
// The function takes two arguments array and number n
// Passing a parameter 'n' will return the first 'n' elements of the array.
// The function will be tested as follows first(array, n)
// Input
// First line contains the elements of array.
// Second line contains the n numbers of element to return.
// Output
// Return the array of first n numbers of array.
// Example
// Input -
// 1 2 3 4
// 2

// Output -
// [1,2]


function first(array, n){
    let arr2 = [];
    for(let i = 0; i < n; i++)
    {
        arr2[i] = array[i];
    }
    return arr2;
}
