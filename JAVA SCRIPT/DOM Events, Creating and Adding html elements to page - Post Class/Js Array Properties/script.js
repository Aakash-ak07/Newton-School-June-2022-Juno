const input = document.getElementById('input');
const addBtn = document.getElementById('add');
const display = document.getElementById('display');
const even = document.getElementById('even');
const odd = document.getElementById('odd');
const join = document.getElementById('join');
const error = document.getElementById('error')
const inputArray = [];

addBtn.addEventListener('click', () => {
    let num = input.value.split(",");
    display.innerHTML=`[${num}]`
})

even.addEventListener('click', () => {
   let a = input.value.split(",");
   let even = a.filter(function(element){
       return element % 2 === 0;
   })
   display.innerHTML = `[${even}]`
})

odd.addEventListener('click', () => {
    let a = input.value.split(",");
    let odd = a.filter(function(element){
       return element % 2 !== 0;
    })
    display.innerHTML = `[${odd}]`
})

join.addEventListener('click', () => {
    let j = input.value.split(',').join("")
    let combine = j;
    display.innerHTML = `${combine}`
})
