// javascript code goes here
function reset(){
    const allWalls = document.querySelectorAll(".wall-container div");
    // console.log(allWalls);

    for(let a=0;a<allWalls.length;a++){
        allWalls[a].style.background="transparent";
    }
}

function apply(){
    const wallId = document.getElementById("wall_id").value;
    const selectedColor = document.getElementById("wall_color").value;

    console.log(wallId);
    console.log(selectedColor);
    
    if(wallId>0 && wallId<10){
        const wall = document.getElementById(wallId);
        wall.style.background = selectedColor;
    }
}
