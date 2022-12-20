// How would you add your own method to the Array object so
// the following code would work?
// const arr = [1, 2, 3]
// console. log(arr.average())
// // 2
// Input
// input will be an array, run like this
// const anyArray = [5,6...]
// anyArray.average should return average of the arrays
// Output
// Average of the given array
// Example
// const myArray = [1,2,3,4,5]
// console.log(myArray.average())
// // 3


Array.prototype.average = function(){
    let sum = 0;
    for(let i = 0; i < this.length; i++)
    {
        sum += parseInt(this[i]);
    }
    return sum / this.length;
};
