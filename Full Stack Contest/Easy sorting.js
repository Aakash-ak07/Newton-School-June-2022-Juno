// An array of 5 string is given where each string contains 2 characters, Now you have to sort these strings, like in a dictionary.
// Input
// Input contains 5 strings of length 2 separated by spaces.
// String contains only uppercase English letters.
// Output
// Print the sorted array.
// Example
// INPUT :
// AS KF ER DD JK

// OUTPUT :
// AS DD ER JK KF

//1st solution
function easySorting(arr)
{
    return arr.sort();
}
// ---------------------
// 2nd solution
function easySorting(arr)
{
    let n = arr.length;
    for(let i = 1; i < n; i++)
    {
        let x = arr[i];
        let j = i - 1;
        while((j > -1) && (x < arr[j]))
        {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = x;
    }
    return arr;
}
