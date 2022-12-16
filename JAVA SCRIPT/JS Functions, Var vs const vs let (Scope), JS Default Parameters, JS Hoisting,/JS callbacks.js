// Complete the function callThisFnBack
// Such that it takes a number as first arguement and a function (callback function) as an
// argument and returns the result of the callback function with its argument as the first argument
// // to the callThisFnBack.
// Example
// Ex:-
// const result = callThisFnBack(5, (num)=>{
// return num+6
// })
// console. log(result) // prints 11 because 5+6

function callThisFnBack(n, num) {
    return num(n);
}

function num(n){
    return(n + n);
}
