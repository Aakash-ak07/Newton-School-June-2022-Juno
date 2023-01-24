// Most of us have played the game Minesweeper on our computers. Let's try to replicate it to some extent.

// The rules for the game are simple:

// You have a 9*9 grid which makes a total of 81 boxes.

// Out of these 81 boxes, 10 boxes contain bombs and other boxes are safe.

// If a safe box is clicked, the user is awarded a point

// If a user clicks on a box containing a bomb, the game gets over and you need to give an option to the user to start a fresh game.



// This is how you may proceed:

// Create an array of random numbers having 10 numbers where each number lies between 1 to 81.

// Every number in the array should be unique.

// The numbers in the array are nothing but indices where the bomb is planted.

// If a bomb is clicked you need to highlight all the boxes that contained the bomb with red color.

// You need to distinguish the boxes which have been clicked and which have
// not been clicked. (As a standard you may color-clicked boxes with green color
// and boxes which have not been clicked should remain white).

// As soon as a box containing a bomb is clicked you need to color that box red, also include the bombs' background image

// If the user makes 71 guesses and still has not clicked on a bomb you need
// to notify the user with a message.

// If the user completes the game or clicks the bomb box, he should be able
// to start a new game.



// You may want to use a grid structure of bootstrap
// The choice of data structure while working on the grid may lead you to a more accessible algorithm for the game or you may get stuck in the loop if you choose a data
// structure that is not appropriate for the game. CHOOSE WISELY!

// Below given is an example of such a grid


// Acceptance Criteria-:
// 0. Each of 81 grid cells must have id attribute cell_{i}, where is i = {1, 2, 3, . . . , 81}.
// 1. Create a window. random variable inside which 10 unique random numbers will be there showing the location of the bomb.
// 2. Use "https://img.icons8.com/emoji/48/000000/bomb-emoji.png" this as a bomb image after clicking on the bomb all the bombs will be shown as the background image. Note: background-image css-style property.
// 3. Player who selects all 71 grids without bombs will be the winner.
// 4. Create an element with the id "resultDisplay" inside which the text result will be shown as "win" for the winner and "game over" for the loser. Change text-content of "resultDispaly" to final-message. Note: In case of no-result of the game, make it empty(no-content inside it).
// 5. Create an element with the id "gameScore" inside which text points will be incremented after every successful click in which the bomb is not clicked
// 6. Create a reset button with id resetButton after which the game should restart
// 7. Reset button should be visible all the time.


// javascript code goes here
window.onload = loadGrid();
var bomb;
var score = 0;
function loadGrid() {
    const container = document.getElementById("container");
    const gameScore = document.getElementById("gameScore");
    const resultDisplay = document.getElementById("resultDisplay");
    gameScore.innerHTML = "0";
    resultDisplay.innerHTML = "";

    container.innerHTML = "";
    for (let i = 1; i <= 81; i++) {
        const cell = document.createElement("div");
        cell.id = `cell_${i}`;
        cell.classList.add("cell");
        cell.addEventListener("click", updateGame);
        container.append(cell);
    }

    score = 0;
    window.random = [];
    while (window.random.length < 10) {
        var r = Math.floor(Math.random() * 81) + 1;
        if (window.random.indexOf(r) === -1) window.random.push(r);
    }

    for (let b of window.random) {
        const cell = document.getElementById(`cell_${b}`);
        cell.classList.add("bomb");
    }
}

function revealBombs(cell_id) {
    document.getElementById(cell_id).classList.add("containBomb");
    document.getElementById("resultDisplay").innerText = "game over";

    for (let b of window.random) {
        document.getElementById(`cell_${b}`).style.backgroundImage =
        "url(https://img.icons8.com/emoji/48/000000/bomb-emoji.png)";
    }

    for (let i = 1; i <= 81; i++) {
        document
        .getElementById(`cell_${i}`)
        .removeEventListener("click", updateGame);
    }
}

function allSafeSelected() {
    const safeElements = document.getElementsByClassName("safe");
    return safeElements.length >= 70 ? true : false;
}

function loadSafe(cell_id) {
    if (allSafeSelected()) {
        document.getElementById("resultDisplay").innerText = "win";
        for (let b of window.random) {
        document
            .getElementById(`cell_${b}`)
            .removeEventListener("click", updateGame);
        }
    }
    document.getElementById(cell_id).classList.add("safe");
    document.getElementById(cell_id).removeEventListener("click", updateGame);
    score += 1;
    document.getElementById("gameScore").innerText = score;
}

function updateGame() {
    if (this.classList.contains("bomb")) {
        revealBombs(this.id);
    } 
    else {
        loadSafe(this.id);
    }
}

function resetGrid() {
  loadGrid();
}
