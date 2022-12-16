// You will be given an array of several arrays that each contain integers and your goal is to write a function that
// will sum up all the numbers in all the arrays. For example, if the input is [[3, 2], [1], [4, 12]] then your
// program should output 22 because 3 + 2 + 1 + 4 + 12 = 22
// Input
// An array containing arrays which can contain any number of elements.
// Output
// Sum of all the elements in all of the arrays.
// Example
// Sample input:-
// [[3, 2], [1], [4, 12]]

// Sample output:-
// 22

// Explanation:-
// 3 + 2 + 1 + 4 + 12 = 22


//-------1st solution------

function sum_array(arr) {
    // use console.log for displaying the output
    let sum = 0;
    for(let i = 0; i < arr.length; i++)
    {
        let res = arr[i];
        for(let j = 0; j < res.length; j++)
        {
            sum += res[j];
        }
    }
    console.log(sum);
}

//-----2nd solution------

function sum_array(arr) {
    let sum = 0;
    for(let i = 0; i < arr.length; i++)
    {
        for(let j = 0; j < arr[i].length; j++)
        {
            sum += arr[i][j];
        }
    }
    console.log(sum);
}
