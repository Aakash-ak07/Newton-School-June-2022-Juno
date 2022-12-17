// Get two Numbers(num1 and num2). Calculate their sum (num1 + num2) when the button clicks.
// Two input boxes with id num1 and num2 respectively.
// Button should have id as mybtn
// Show sum in input box with id result make it disabled


// html part
<div style='margin-left: 10%;'>
    <h3>Add Two Numbers</h3>
    <input type="number" id="num1" placeholder="Enter First Number"><br>
    <input type="number" id="num2" placeholder="Enter Second Number"><br>
    <button id="mybtn" onclick="">Add</button><br>
    <input type="number" id="result" placeholder="Result" disabled>
</div>



// Js Part

document.getElementById("mybtn"),addEventListener("click", ()=>{
    let num1 = document.getElementById('num1').value;
    let num2 = document.getElementById('num2').value;
    let res = parseFloat(num1) + parseFloat(num2);

    document.getElementById('result').value=res;
})
