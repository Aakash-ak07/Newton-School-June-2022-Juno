// javascript code goes here
const heading = document.getElementById("heading");
const next = document.getElementById("load_next");
const previous = document.getElementById("load_prev");
const list = document.getElementById("list");
let pageNum = 1;

function gitIssue(pageNum){
    return fetch(`https://api.github.com/repositories/1296269/issues?page=${pageNum}&per_page=5`)
    .then(response => response.json()).then(response => response);
}

async function renderIssue(pageNum){
    let issue = await gitIssue(pageNum);
    list.innerHTML = "";
    heading.innerHTML = `page number ${pageNum}`;
    issue.forEach(issue =>{
        let li = document.createElement("li");
        li.innerHTML = issue.node_id;
        list.appendChild(li);
    })
}
renderIssue(1);

next.addEventListener('click', () => {
    pageNum++;
    renderIssue(pageNum);
});

previous.addEventListener('click', () => {
    if(pageNum > 1){
        pageNum--;
        renderIssue(pageNum);
    }
});
