window.onload = function () {
  init();
};

var arr = [];
for (let i = 0; i < 10; i++) {
  arr.push(Math.floor(Math.random() * 100));
}

function init(params) {
  var ele = document.getElementById('array');
  console.log(arr);
  ele.innerText = arr;
}

function arrSort(){
  arr.sort(function(a, b){return a - b});
  let element = document.getElementById('array');
  element.innerText = arr;
}

function reverseSort(){
  arr.sort(function(a, b){return a - b});
  arr.reverse();
  let element = document.getElementById('array');
  element.innerText = arr;
}

function firstFive(){
  alert(arr.slice(0, 5).toString());
  let element = document.getElementById('array');
}

function lastFive(){
  alert(arr.slice(-5).toString())
}

function getAvg(){
  let sum = 0;
  for(let i = 0; i < arr.length; i++)
    sum += arr[i];
  
  alert(sum/arr.length);
}
