// In a GRE exam, there are essays you have to write. Instead of counting the words every few hours, you want students to be able to see the word count of their essays real-time.
// There should be a textbox with id="evaluatedText" and an h3 tag with id="wordCount". The h3 renders the calculated word count of the text in the textbox. The words should be counted in realtime, i.e. when users update the text in the textbox, the h3 should also update the word count displayed. If there's no text, it should display 0.

// html part

<textarea id="evaluatedText" oninput="countWord()" value="">
    </textarea>
    <h3 id="wordCount">0</h3>


// JS code here

function countWord(){
    let words = document.getElementById("evaluatedText").value;
    let count = 0;
    let split = words.split(' ');

    for(let i = 0; i < split.length; i++)
    {
        if(split[i] != "")
        {
            count += 1
        }
    }
    document.getElementById("wordCount").innerHTML = count;
}
