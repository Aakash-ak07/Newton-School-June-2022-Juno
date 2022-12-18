// We've all seen the like and dislike buttons on youtube. There is a number that shows the count of total likes. Let's replicate that feature of Youtube and use it in our own social networking site.

// Acceptance Criteria:

// Render two buttons. The Like button should have id="increment". The dislike button should have id="decrement"

// There should be a h3 element that displays the count of the count of Likes. This element should have id="counter"

// The count should not go below zero. If dislike button is pressed when count is 0, it should remain at 0


// --------html-part----------//

<!-- html code goes here -->
<div>
    <button type="button" id="increment" onclick="increment()">
        Likes
    </button>
    <h3 id="counter">Count</h3>
    <button type="button" id="decrement" onclick="decrement()">
        Dislikes
    </button>
</div>


//--------JS-part---------//

let data = 0;
document.getElementById("counter").innerHTML = data;

function increment(){
    data += 1;
    document.getElementById("counter").innerHTML = data;
}
function decrement(){
    data -= 1;
    if(data <= 0)
        data = 0;

    document.getElementById("counter").innerHTML = data;
}
