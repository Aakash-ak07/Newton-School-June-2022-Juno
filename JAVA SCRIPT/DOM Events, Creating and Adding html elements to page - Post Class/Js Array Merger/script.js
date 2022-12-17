const arr1 = document.getElementById('1');
const arr2 = document.getElementById('2');
const btn1 = document.getElementById('add-1');
const btn2 = document.getElementById('add-2');

const firstArray = [];
const secondArray = [];

btn1.addEventListener('click', () => {
    const one = arr1.value.split(",");
    let flag = 1;
    for(let i = 0; i < one.length; i++)
    {
        if(!isNaN(one[i]))
        {
            firstArray.push(one[i]);
        }
        else
        {
            const db = document.querySelector(".d-none");
            db.style.display = "block";
            flag = 0;
            break;
        }
    }
    if(flag === 1){
        const x = document.getElementById("disp-1");
        x.innerText = `[${firstArray}]`
    }
})

btn2.addEventListener('click', () => {
    const two = arr2.value.split(",");
    let flag = 1;
    for(let i = 0; i < two.length; i++)
    {
        if(!isNaN(two[i]))
        {
            secondArray.push(two[i]);
        }
        else
        {
            const db = document.querySelector(".d-none");
            db.style.display = "block";
            flag = 0;
            break;
        }
    }
    if(flag === 1){
        const y = document.getElementById("disp-2");
        y.innerText = `[${secondArray}]`
    }
})

document.getElementById('merge').addEventListener('click', () => {
    const res = firstArray.concat(secondArray);
    const afterMerge = document.getElementById("result");
    afterMerge.innerText = `[${res}]`;
})
