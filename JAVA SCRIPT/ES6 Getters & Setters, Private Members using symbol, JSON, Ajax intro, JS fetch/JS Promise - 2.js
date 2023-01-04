// Complete the function checkCanIVote
// Takes 2 arguments:
// 1st argument time, which is the number of milliseconds after the function will resolve or reject
// Second argument is the age upon (also a number) which you will use to return the string based on logic mentioned below
// Resolves to "You can vote" after x milliseconds if age is greater than or equal to 18
// Rejects with "You can not vote" after x milliseconds if age less than 18

// Note:- You only have to implement the function, in the example it
// shows how your implemented question will be ran.
// Input
// Function will take two arguments

// 1) 1st argument will be a number which tells after how much milliseconds promise will be resolved or rejected.
// 2) 2nd argument will be a number (age)
// Output
// Function returns a promise which resolves to "You can vote" or rejects to "You can not vote".
// If age >= 18 resolves to "You can vote" else rejects to "You can not vote".
// Example
// checkCanIVote(200, 70). then(data=>{
// console. log(data) // prints 'You can vote'
// }).catch((err)=>{
// console.log(err) // does not do anything
// })
// checkCanIVote(200, 16). then(data=>{
// console. log(data) // does not do anything
// }).catch((err)=>{
// console.log(err) // prints 'You can not vote'
// })

function checkCanIVote(time, age) {
    return new Promise((resolve, reject)=>{
        setTimeout(()=>{
            if(age >= 18){
                resolve("You can vote")
            }
            else{
                reject("You can not vote")
            }
        },1000)
    });
}
