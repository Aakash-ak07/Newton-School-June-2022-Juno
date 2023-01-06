// In this app, you will be using this https://randomuser.me/api/ endpoint to get a random user and show their info.

// This endpoint returns a lot of info, but you only need to display specific things,
// By default, only the full name (first name + last name) and the image will be visible. The API returns URLs for 3 image sizes , use only the large one.

// Display 3 buttons for Age, Email, and Phone
// each having attribute "data-attr" with a value equal to "age", "email" and "phone" respectively.

// Make a section with the heading additional info, which upon clicking the above mentioned buttons displays the relevant data inside it.

// Upon clicking one of the buttons you will display the relevant info, for ex:- If the user clicks the age button, display the age of that user you got
// from the initial API call, do not make another API call and display some other user's age.

// If the user clicks another button for ex:- the email button, remove whatever was being displayed earlier (not name and photo) and only show the email instead.

// By default when the page loads, age, email, and phone are not shown.

// The last feature you have to implement is a button with id="getUser" which upon clicking makes another call to the API and gets a new user and displays their photo and full name, and subsequently, on clicking phone, email buttons, etc display their relevant info.

let userData=null;
function getUser(){
    fetch("https://randomuser.me/api/").then((response) => {
        return response.json();
    }).then((data) => {
        userData = data;
        console.log("Data is",data);
        const name=data.results[0].name.first + " " + data.results[0].name.last
        document.getElementById("fullname").innerText = name;
        const userImage=document.getElementById("user-image");
        userImage.setAttribute("src", data.results[0].picture.large);
    })
} 

function showData(propertyToShow){
    let outputString="";
    const result = userData.results[0];
    switch(propertyToShow)
    {
        case "age":
        outputString = result.dob.age;
        break;
        case "email":
        outputString = result.email;
        break;
        case "phone":
        outputString = result.phone;
        break;
        default:
        outputString = ""
    }
    document.getElementById("data").innerText = outputString
}
getUser()
