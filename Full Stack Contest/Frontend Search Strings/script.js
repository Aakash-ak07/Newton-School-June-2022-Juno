const totalContent = document.getElementById('main');
const inputRef = document.getElementById('search-bar');

let prev = "";
const click = () => {
    let obj = new Mark(totalContent);
    if(prev !== "")
    {
        obj.unmark(prev);
    }
    obj.mark(inputRef.value);
    prev = inputRef.value;
};
const markMatches = (currentNode, pattern) => {

};

document.getElementById('search-button').addEventListener('click', click)
