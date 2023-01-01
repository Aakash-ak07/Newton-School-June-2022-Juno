// javascript code goes here
const addTodo = document.getElementById("add-todo");
const inputTodo = document.getElementById("todo-input");
const holderTodo = document.getElementById("todo-holder");

let size = localStorage.length;
let key = localStorage.key(size - 1);
let i = Number(key);
i = i + 1;

function loadTasks(){
    let size = localStorage.length;
    for(let i = 0; i < size; i++)
    {
        let key = localStorage.key(i);
        let val = localStorage.getItem(key);
        let todoItem = document.createElement('li');
        todoItem.innerHTML = val;
        holderTodo.appendChild(todoItem);
    }
}

addTodo.addEventListener('click', () =>{
    let todo1 = inputTodo.value;
    localStorage.setItem(i, todo1);
    i++;

    let todoItem2 = document.createElement('li');
    todoItem2.innerHTML = todo1;
    holderTodo.appendChild(todoItem2);
    inputTodo.value="";
})
