// You are given the code of some text inputs and a button.

// Write a JS code for adding object properties and values by clicking the add button
// The object should be updated in the div with id #obj by using JSON.stringify()

// If there is an empty field then it should display some error message in div with id #error

//---------------- html part--------------------

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./styles.css">
    <title>Document</title>
</head>
<body>
    <h3>Add properties to Objects</h3>
    <div class="field">
        <label for="key">Key:</label>
        <input type="text" id="key">
    </div>
    <div id="field">
        <label for="val">Value:</label>
        <input type="text" id="val">
    </div>
    <button id="add">Add</button>
    <div id="error" class="error"></div>
    <div id="obj"></div>
    <script src="./script.js"></script>
</body>
</html>


// ---------------Js part-----------------

const key = document.getElementById('key');
const val = document.getElementById('val');
const display = document.getElementById('obj');
const button = document.getElementById('add');
const error = document.getElementById('error');

const obj = {
    
}

button.addEventListener('click', () => {
    if(key.value == " " || val.value == "")
    {
        error.innerHTML = "key cannot be empty";
    }
    else{
        let key1 =`${key.value}`
        obj[key1] = val.value;
    }
    display.innerHTML = JSON.stringify(obj)
})
