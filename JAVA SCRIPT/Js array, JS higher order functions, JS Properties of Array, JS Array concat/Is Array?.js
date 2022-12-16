// Complete the function isArray which takes an input which can be any data type and returns true
// if it's an array else false.
// Input
// Could be any datatype string number object or an array
// Output
// true or false
// Example
// Sample Input:-
// 1
// [2, 3]
// Sample Output
// false
// true

function isArray(input){
    if(Array.isArray(input))
        console.log("true");
    else    
        console.log("false");
}
