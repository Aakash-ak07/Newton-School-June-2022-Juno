// John has N candies. He want to crush all of them. He feels that it would be boring to crush the candies randomly, so he devices a method to crush them. He divides these candies in minimum number of groups such than no group contains more than 3 candy. He crushes one candy from each group. 
//If there are G groups in a single step, then the cost incurred in crushing a single candy for that step is G dollars. After candy from each group is crushed, he takes all the remaining candies and repeats the process until he has no candies left. He hasn't started crushing yet, but he wants to know how much total cost would be incurred. Can you help him?
// Input
// 1 <= N <= 10^9
// Output
// return the cost from the function
// Example
// Sample Input 1:
// 4

// Explanation:
// Query 1: First step John divides the candies in two groups of 3 and 1 candy respectively. Crushing one- one candy from both group would cost him 2x2 = 4 dollars. He is now left with 2 candies. He divides it into one group. He crushes one candy for 1 dollar. Now, he is left with 1 candy. He crushes the last candy for 1 dollar.
//So, the total cost incurred is 4+1+1 = 6 dollars.


// n is the number (number of candies) as  provided in input
// write code here
// do not console.log the answer
// return answer as a number

function findCost(n) {
    let totalCost = 0;
    while(n > 0){
        const candy = Math.ceil(n / 3);
        totalCost += candy * candy;
        n -= candy;     
    }
    return totalCost;
}
