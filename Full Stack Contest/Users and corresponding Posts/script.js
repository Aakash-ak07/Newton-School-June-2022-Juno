// In this project, you will be using the Newton School content to get a list of users and their corresponding posts and display it in a pagewise manner.

// You will specifically be using these urls for fetching users & posts:

// https://content.newtonschool.co/v1/pr/main/users
// https://content.newtonschool.co/v1/pr/main/posts
// (you can fetch posts uploaded by a specific user from https://content.newtonschool.co/v1/pr/main/posts?user_id=)


// By default you will start with page 1 when your app loads. This API returns a lot of data, your task is to only display user names in an ordered list. Each page should display exactly 2 usernames.
// Each user should then contain an unordered list of posts titles(3 post titles are to be displayed)

// Also display "Page number : 1" on first page, and keep changing it depending on number of page.

// You will make 2 buttons,

// One button with id="next" which loads the next page of users by calling the above mentioned API with the current page number + 1, replacing the currently displayed issues with new issues and also changing the "Page number 1" heading to "Page number 2".

// And the second button with id="prev", which goes back one page and displays the previous, page's users and posts and also changes the Page number heading. (Edge case hint:- you cannot go to Page number 0 or Page number 6)


var pgNum = 1;
var issueName;

document.getElementById("next").addEventListener("click", () => {
    if (pgNum < 5) pgNum = pgNum + 1;
    console.log(pgNum);
    document.getElementById("head").textContent = `Page Number : ${pgNum}`;
    fetch("https://content.newtonschool.co/v1/pr/main/users")
    .then(function (response) {
        // The API call was successful!
        return response.json();
    })
    .then(function (data) {
        // This is the JSON from our response
        issueName = data;
        for (let i = 0; i < 2; i++) {
            document.getElementById(`${i + 1}`).textContent =
            issueName[(pgNum - 1) * 2 + i].name;
            fetch(`https://content.newtonschool.co/v1/pr/main/posts?user_id=${(pgNum - 1) * 2 + i + 1}`)
            .then(function (res) {
                return res.json();
            })
            .then(function (postList) {
                console.log("postlist", postList);
                for (let j = 0; j < Math.min(3, postList.length); j++) {
                    document.getElementById(
                        `post${i + 1}${j + 1}`
                    ).textContent = postList[j].title;
                }
            });
        }
    })
    .catch(function (err) {
        // There was an error
        console.warn("Something went wrong.", err);
    });
});

document.getElementById("prev").addEventListener("click", () => {
if (pgNum > 1) {
    pgNum = pgNum - 1;
    console.log(pgNum);
    document.getElementById ("head").textContent = `Page Number : ${pgNum}`;

    fetch("https://content.newtonschool.co/v1/pr/main/users")
    .then(function (response) {
        // The API call was successful!
        return response.json();
    })

    .then(function (data) {
        // This is the JSON from our response
        issueName = data;
        for (let i = 0; i < 2; i++) {
        document.getElementById(`${i + 1}`).textContent =
            issueName[(pgNum - 1) * 2 + i].name;
            fetch(`https://content.newtonschool.co/v1/pr/main/posts?user_id=${(pgNum - 1) * 2 + i + 1}`)
            .then(function (res) {
            return res.json();
            })
            .then(function (postList) {
                console.log("postlist", postList);
                for (let j = 0; j < Math.min(3, postList.length); j++) {
                    document.getElementById(
                        `post${i + 1}${j + 1}`
                    ).textContent = postList[j].title;
                }
            });
        }
        console.log(issueName);
    })
    .catch(function (err) {
        // There was an error
        console.warn("Something went wrong.", err);
    });
}
});
fetch("https://content.newtonschool.co/v1/pr/main/users")
.then(function (response) {
    // The API call was successful!
    return response.json();
})
.then(function (data) {
    // This is the JSON from our response
    issueName = data;
    for (let i = 0; i < 2; i++) {
        document.getElementById(`${i + 1}`).textContent = issueName[i].name;

        fetch(`https://content.newtonschool.co/v1/pr/main/posts?user_id=${ i + 1 }`)
        .then(function (res) {
        return res.json();
        })
        .then(function (postList) {
            console.log("postlist", postList);
            for (let j = 0; j < Math.min(3, postList.length); j++) {
                document.getElementById(`post${i + 1}${j + 1}`).textContent =
                postList[j].title;
            }
        });
    }
})
.catch(function (err) {
    // There was an error
    console.warn("Something went wrong.", err);
});
document.getElementById("head").textContent = `Page Number : ${pgNum}`;
