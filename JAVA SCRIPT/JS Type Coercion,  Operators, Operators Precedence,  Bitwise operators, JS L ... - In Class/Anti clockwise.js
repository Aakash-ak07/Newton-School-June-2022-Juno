// Given an N*N matrix. Print the elements of the matrix in anticlockwise order (see the sample for better understanding).
// Input
// First line contains N.
// N lines follow each containing N space seperated integers.

// Constraints:-
// 2 <= N <= 500
// 1 <= Mat[i][j] <= 1000
// Output
// Output N*N integers in a single line separated by spaces, which are the elements of the matrix in anti-clockwise order.
// Example
// Sample Input
// 4
// 1 2 3 4
// 5 6 7 8
// 9 10 11 12
// 13 14 15 16

// Sample output
// 1 5 9 13 14 15 16 12 8 4 3 2 6 10 11 7

// Sample Input
// 3
// 1 2 3
// 4 5 6
// 7 8 9

// Sample output
// 1 4 7 8 9 6 3 2 5


// You need to print the matrix Anticlock wise
// mat: contains the input matrix
function printAntiClockWise(mat)
{
    ans = '';
    let x = 0;
    let y = 0;
    let i;
    let m = mat.length;
    let n = mat.length;

    while(x < m && y < n)
    {
        for(i = x; i < m; i++)
        {
            ans += mat[i][y];
            ans += ' '; 
        }
        y++;
        for(i = y; i < n; i++)
        {
            ans += mat[m-1][i];
            ans += ' ';
        }
        m--;
        if(y < n)
        {
            for(i = m - 1; i >= x; i--)
            {
                ans += mat[i][n - 1];
                ans += ' ';
            }
            n--;
        }
        if(x < m)
        {
            for(i = n - 1; i > x; i--)
            {
                ans += mat[x][i];
                ans += ' ';
            }
            x++;
        }
    }
    console.log(ans);
}
