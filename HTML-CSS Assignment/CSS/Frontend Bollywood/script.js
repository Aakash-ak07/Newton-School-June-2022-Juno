const chanceElement = document.getElementById("chance");
const letterElement = document.getElementsByClassName("letter");
const resElement = document.getElementById("answer");

let str = "abcdefghijklmnopqrstuvwxyz";

let word = "";
for (let i = 0; i < 5; i++) {
    let v = Math.floor(Math.random() *  26);
    word += str.charAt(v);
}
let index =0;
let chance = 5;

function check(event) 
{
    if (index > 4) 
    {
        return;
    }
    let k = event.key;
    if (k == word.charAt(index)) 
    {
        letterElement[index].innerText = k;
        if (index == 4) 
        {
            alert("Congratulations!");
        }
        index++;
    }
    else
    { 
        chance--;
        if (chance <= 0)
        {
            alert("You've run out of guesses! Game over!");
            resElement.innerText = "Answer is " + word;
            if (chance < 0) 
            {
                return;
            }
            chanceElement.innerText = "Chances Left : "+ chance;
            return;
        }
        let message = "Wrong guess! "+ chance +" guesses remaining.";
        chanceElement.innerText = "Chances Left : "+ chance;
        alert(message);
    }
}
