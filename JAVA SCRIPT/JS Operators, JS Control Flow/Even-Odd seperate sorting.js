// Given an array A of positive integers. Your task is to sort them in such a way that the first part of the array contains odd numbers sorted in descending order, rest portion contains even numbers sorted in ascending order.


// You need to return sorted array, not string
// arr: input array
// arrSize: size of array
function sortEvenOdd(arr, arrSize)
{
    let even = [];
    let odd = [];
    for(let i = 0; i < arrSize; i++)
    {
        if(arr[i] % 2 == 0)
            even.push(arr[i]);
        else    
            odd.push(arr[i]);
    }
    odd.sort(function(a, b){ return b - a; });
    even.sort(function(a, b){ return a - b; });
  
    return odd.concat(even);
}

//2nd solution

function sortEvenOdd(arr, arrSize)
{
  const even = arr.filter(n => Number(n % 2 === 0))
  const odd = arr.filter(n => n % 2 !== 0)
  
  even.sort(function(a, b){ return a - b; })
  odd.sort(function(a, b){ return b - a; })

  const res = odd.concat(even)
  return res
}
