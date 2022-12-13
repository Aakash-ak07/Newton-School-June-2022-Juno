// We can share a lot of information through the URLs

// Make an HTML form and use JS for manipulation.

// Acceptance Criteria:
// Make an input field with id="name" and name="name"

// Make an input field with id="year" and name="year"

// Make a submit button element with id="button"

// Make a h3 element with id="url". Initially it has the text https://localhost:8080/

// When submit button is clicked, text in h3 should be updated with the appropriate query string.


// Refer to the attached image to see how it should work for different cases

// html part
<h3 id="url">https://localhost:8080/</h3>
<label for="name">Name:</label><br>
<input type="text" id="name" name="name"><br>

<label for="year">Graduation Year:</label><br>
<input type="number" id="year" name="year"><br><br>

<button id="button" onclick="update_h3()">Submit</button>

// Js Part

function update_h3(){
    let h3 = document.getElementById("url");
    h3.innerText = 'https://localhost:8080/';
    let name = document.getElementById("name");
    let year = document.getElementById("year");

    if(name.value === "" && year.value === ""){
        return;
    }
    else if (year.value === ""){
        h3.innerText += '?' + "name=" + name.value;
    }
    else if (name.value === ""){
        h3.innerText += '?' + "year=" + year.value;
    }
    else{
        h3.innerText += '?' + "name=" + name.value + "&year=" + year.value;
    }
}

/*
output:
https://localhost:8080/?name=name&year=year  
https://localhost:8080/?year=year
https://localhost:8080/?name=name
https://localhost:8080/
*/
