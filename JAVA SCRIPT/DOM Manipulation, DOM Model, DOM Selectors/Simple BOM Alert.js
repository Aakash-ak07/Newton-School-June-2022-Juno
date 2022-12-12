// Implement the Browser Alert as following:
// 1)If the given text field with id#word is empty and the button with id #click is clicked then alert some text
// 2)If the given text field is not empty then alert the text typed in the text field on button click

// html part

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <label for="word">Text:</label>
    <input type="text" id="word">
    <button id="click">Alert</button>
    <script src="script.js"></script>
</body>
</html>

// ---------
// js part

const text = document.getElementById("word");
const btn = document.getElementById("click");

btn.addEventListener("click", () => {
    if(text.value === ''){
        alert("This is an alert box");
    }
        
    else{   
        alert(text.value);
    }
});
