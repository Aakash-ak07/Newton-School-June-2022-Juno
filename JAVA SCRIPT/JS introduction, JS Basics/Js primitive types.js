// You are given a function reverseString(), which takes in a string as a parameter. Your task is to complete the function such that it returns the reverse of the string.(hello changes to olleh)

// // Complete the reverseString function
// function reverseString(n) {
//     //Write Code Here
// }
// Input
// A string n
// Output
// Returns the reverse of n
// Example
// const n = 'hello'

// reverseString(n) //displays 'olleh' in console



// Complete the reverseString function 
function reverseString(n) {
    let revStr ="";
    for(let i = n.length-1; i >= 0; i--)
    {
        let currentChar = n.charAt(i);
        revStr += currentChar;
    }
    return revStr;
}
