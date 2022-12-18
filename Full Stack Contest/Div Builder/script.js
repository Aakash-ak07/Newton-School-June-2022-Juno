// javascript code goes here
function createDivAndAppend(){
    let divId = document.getElementById("div-id-input").value;
    let divContent = document.getElementById("div-content-input").value;
    let divHeight = document.getElementById("div-height-input").value;
    let divWidth = document.getElementById("div-width-input").value;

    let div = document.createElement("div");
    div.id = divId;
    div.classList.add("my-div");
    div.innerHTML = divContent;
    div.style.height = divHeight+"px";
    div.style.width = divWidth+"px";
    let divHolder = document.getElementById("div-holder");
    divHolder.appendChild(div);
    return false;
}
