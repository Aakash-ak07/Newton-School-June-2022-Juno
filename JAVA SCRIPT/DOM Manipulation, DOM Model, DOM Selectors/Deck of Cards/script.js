// 1. Display the 52 cards in a standard playing cards deck ‘scattered’ on the screen on the page.
// 2. At the bottom of the screen, have four ‘cardholders’ - each labeled after a house of cards - spade, diamond, clubs, hearts.
// 3. The user can ‘clean up’ space by dragging a card and dropping it into the right cardholder.

// On the second login, the game should start from where they left off.

// Notes: You can only place a card in the correct cardholder. spades in spades, hearts in hearts, etc. If all cards are put into the right cardholder, show a “restart” button. If clicked, the cards should be again shuffled in the space above.

// sample

// Acceptance Criteria
// If user put card in the right cardholder then card should no longer exist in the DOM

// All 52 cards should have id ('0' to '51')

// Do not change the order of cards as given in the javascript code. Basically ID should be indexes of the given array

// All 4 cardholder should have id ('100', '101', '102', '103') respectively.

// Restart button should have id restart-button

// You Won should be rendered after winning the game

// Do not refresh when clicked on Restart button, just only reset the game

// Note: You can find all these necessary images here


const cardNames = [
    '2C', '2D', '2H', '2S', 
    '3C', '3D', '3H', '3S', 
    '4C', '4D', '4H', '4S', 
    '5C', '5D', '5H', '5S', 
    '6C', '6D', '6H', '6S', 
    '7C', '7D', '7H', '7S', 
    '8C', '8D', '8H', '8S', 
    '9C', '9D', '9H', '9S', 
    '10C', '10D', '10H', '10S',
    'AC', 'AD', 'AH', 'AS',
    'JC', 'JD', 'JH', 'JS', 
    'KC', 'KD', 'KH', 'KS',
    'QC', 'QD', 'QH', 'QS'
];

var dumped = [];
var cardNumbers = [];

for (let i = 0; i < 52; i++) {
    cardNumbers.push(i);
    dumped.push(false);
}

function shuffle(array) {
    var currentIndex = array.length,
    temporaryValue,
    randomIndex;

    // While there remain elements to shuffle...
    while (0 !== currentIndex) {
    // Pick a remaining element...
        randomIndex = Math.floor(Math.random() * currentIndex);
        currentIndex -= 1;

        // And swap it with the current element.
        temporaryValue = array[currentIndex];
        array[currentIndex] = array[randomIndex];
        array[randomIndex] = temporaryValue;
    }
    return array;
}

cardNumbers = shuffle(cardNumbers);

// select the board and append all 52 cards
for (let i = 0; i < cardNames.length; i++) {
    let eDivEle = document.createElement("div");
    eDivEle.className += " empty";
    if (!dumped[i]) {
        let fDivEle = document.createElement("div");
        fDivEle.className += " fill";
        fDivEle.id = `${cardNumbers[i]}`;
        fDivEle.setAttribute("pos", `${i}`);
        fDivEle.setAttribute("draggable", "true");
        fDivEle.style.backgroundImage = `url('https://raw.githubusercontent.com/Newton-School/Deck_of_Cards/main/JPEG/${
            cardNames[cardNumbers[i]]
        }.jpg')`;
        eDivEle.appendChild(fDivEle);
    }
    var node = document.querySelector(".cards");
    node.appendChild(eDivEle);
}

let fill = document.querySelectorAll(".fill");
const empties = document.querySelectorAll(".empty");

// Fill listners
for (let i = 0; i < fill.length; i++) {
    fill[i].addEventListener("dragstart", dragStart);
    fill[i].addEventListener("dragend", dragEnd);
}

// Loop through empties and call drag events
for (const empty of empties) {
    empty.addEventListener("dragover", dragOver);
    empty.addEventListener("dragenter", dragEnter);
    empty.addEventListener("dragleave", dragLeave);
    empty.addEventListener("drop", dragDrop);
}
var counter = 0;
var cardNo = 0;
var idNo = 0;
// Drag functions
function dragStart() {
    this.className += " hold";
    cardNo = parseInt(this.getAttribute("pos"));
    idNo = parseInt(this.id);
    setTimeout(() => {
        this.className = "invisible";
    }, 0);
}

function dragEnd() {
    this.className = "fill";
}
function dragOver(e) {
    e.preventDefault();
}
function dragEnter(e) {
    e.preventDefault();
    this.className += " hovered";
}
function dragLeave() {
    this.className = "empty";
}

const finalMessage = document.querySelector(".final-message");
const restartButton = document.querySelector("#restart-button");

// add an event-listner
restartButton.addEventListener("click", () => {
    finalMessage.style.display = "none";
    dumped.forEach((el, i) => {
        dumped[i] = false;
    });
    cardNumbers = shuffle(cardNumbers);
    const allCards = document.querySelector(".cards");
    allCards.innerHTML = "";
    for (let i = 0; i < cardNames.length; i++) {
        let eDivEle = document.createElement("div");
        eDivEle.className += " empty";
        if (!dumped[i]) {
            let fDivEle = document.createElement("div");
            fDivEle.className += " fill";
            fDivEle.id = `${cardNumbers[i]}`;
            fDivEle.setAttribute("pos", `${i}`);
            fDivEle.setAttribute("draggable", "true");
            fDivEle.style.backgroundImage = `url('https://raw.githubusercontent.com/Newton-School/Deck_of_Cards/main/JPEG/${
                cardNames[cardNumbers[i]]
            }.jpg')`;
            eDivEle.appendChild(fDivEle);
        }
        var node = document.querySelector(".cards");
        node.appendChild(eDivEle);
    }
    fill = document.querySelectorAll(".fill");
    // Fill listners
    for (let i = 0; i < fill.length; i++) {
        fill[i].addEventListener("dragstart", dragStart);
        fill[i].addEventListener("dragend", dragEnd);
    }
    counter = 0;
    cardNo = 0;
    idNo = 0;
});

function dragDrop() {
    this.className = "empty";
        if (idNo % 4 == parseInt(this.id) % 100) {
            fill[cardNo].remove();
            dumped[cardNo] = true;
            counte
            r++;
            if (counter == 52) {
                finalMessage.style.display = "block";
        }
    }
}
