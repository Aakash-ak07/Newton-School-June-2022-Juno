// javascript code goes here
const RANDOM_QUOTE_API_URL = "http://api.quotable.io/random";
const container = document.getElementById("container");
const quoteDisplayElement = document.getElementById("quoteDisplay");
const timerElement = document.getElementById("timer");
const wpmElement = document.getElementById("wpm");

let timerID;
let isTimerStated = false;
let quote;
let currentIdx = 0;
let strokes;

window.addEventListener("click", (e) => {
    if (document.getElementById("container").contains(e.target)) {
        if (!isTimerStated) {
            container.classList.add("container-focus");
            startTimer();
        }
    } 
    else {
        container.classList.remove("container-focus");
        timerElement.innerText = 0;
        stopTimer();
        currentIdx = 0;
        quoteDisplayElement.childNodes.forEach((node) => {
            node.classList.remove("correct");
            node.classList.remove("incorrect");
        });
    }
});

function calcualtewpm() {
    if (getTimerTime() > 0) {
        wpmElement.innerText = Math.round(
        parseFloat(correctStrokes()) / 5.0 / (parseFloat(getTimerTime()) / 60.0)
        );
    }
}


window.addEventListener("keydown", (e) => {
    if (isTimerStated) {
        let charCode = e.keyCode;
        if (
        (charCode > 64 && charCode < 91) ||
        (charCode > 96 && charCode < 123) ||
        charCode === 32 ||
        charCode === 188 ||
        charCode === 186 ||
        charCode === 222 ||
        charCode === 190 ||
        charCode === 191 ||
        charCode === 49 ||
        charCode === 189
        )
        {
            if (quote[currentIdx] == e.key) {
                quoteDisplayElement.childNodes[currentIdx].classList.add("correct");
                quoteDisplayElement.childNodes[currentIdx].classList.remove("incorrect");

                strokes[currentIdx] = 1;
            } 
            else{
                quoteDisplayElement.childNodes[currentIdx].classList.add("incorrect");
                quoteDisplayElement.childNodes[currentIdx].classList.remove("correct");

                strokes[currentIdx] = 0;
            }
            calcualtewpm();
            currentIdx++;
            if (currentIdx === quote.length) {
                currentIdx = 0;
                renderNewQuote();
            }
        } 
        else if (charCode === 8) {
            if (currentIdx === 0) return;
            currentIdx--;
            quoteDisplayElement.childNodes[currentIdx].classList.remove("correct");
            quoteDisplayElement.childNodes[currentIdx].classList.remove("incorrect");
        } 
        else {
            console.log("not a key");
        }
    }
});

const getRandomQuote = () => {
  return fetch(RANDOM_QUOTE_API_URL)
    .then((response) => response.json())
    .then((data) => data.content);
};

function correctStrokes() {
    let count = 0;
    strokes.forEach((stroke) => {
        if (stroke) count++;
    });
    return count;
}

const renderNewQuote = async () => {
    quote = await getRandomQuote();
    if (isTimerStated) {
        stopTimer();
        startTimer();
    }
    currentIdx = 0;
    strokes = new Array(quote.length);
    strokes.fill(0);
    quoteDisplayElement.innerHTML = "";
    quote.split("").forEach((char) => {
        const charSpan = document.createElement("span");
        charSpan.innerText = char;
        quoteDisplayElement.appendChild(charSpan);
    });
};

let startTime;
function startTimer() {
    isTimerStated = true;
    timerElement.innerText = 0;
    startTime = new Date();
    timerID = setInterval(() => {
        timer.innerText = getTimerTime();
    }, 1000);
}

function getTimerTime() {
    return Math.floor((new Date() - startTime) / 1000);
}

function stopTimer() {
    isTimerStated = false;
    clearInterval(timerID);
}

renderNewQuote();
