function clearScreen() {
    document.getElementById("input").value = "";
}

function remove(){
    let x = document.getElementById("input").value;
    let e = x.slice(0, -1);
    document.getElementById("input").value = e;
}
 
function display(value) {
    document.getElementById("input").value += value;
}

function calculate() {
    let x = document.getElementById("input").value;
    let e = eval(x);
    document.getElementById("input").value = e;
}
