// In this project, we will be building a bubble sort visualizer.

// Take input from the user, It will be numbers separated by commas from input tag with id numbers_input.

// Create a button with id create-btn with text create array, which on click creates individual div for each element in the array.

// All such elements will be stored in div with class num-holder. Make this div a flexbox, and space out all the child elements evenly

// Each number inside the above-mentioned div will be div and have class num along with num-${idx}, where idx starts from zero.

// Also they will have an attribute data-val which equals the number they are representing.

// Also, set the CSS property order of each element according to their place in the original array input by users. (Order property starts from one, and this is what we will be manipulated to show the array being sorted ).

// Also, each num div will have the same width as each other but different heights depending upon their values.

// Create a button with id sort-btn, which will step by step sort the array.

// The exact sorting algorithm that you have to use is already mentioned. And you may have noticed that this algorithm is not fully optimized because even for a fully sorted array it will still do all the comparisons which are intended.
// So each "step" of the sorting is the iteration of the inner for loop. And on each step, we highlight the two elements in comparison by setting the border property to '2px solid black' for 100ms, then remove it.

// if they are supposed to change places, we change their order property so they automatically change places.



// Example :-

// User enters 1,2,3,4,5 and clicks create array button.

// 5 divs with class "num" are created, each also have class "num-1", "num-2" and so on.

// They are all inside the div "num-holder".

// On clicking sort-btn, num-1 and num-2 will be highlighted, since these are the first 2 comparisons in the algorithm, followed by num-2 and num-3 and so on.

// This is a sorted array so all comparisons will show, but no element will change its position.

// So if instead the array was 2,1,3,4,5.

// On the first comparison num-1 and num-2 will highlight and their order attribute will change to each other so they switch places.


let globalNumbers = []
let sorter = null
let globalIndex = 0
function bubbleSort(arr) {
    const states = []
    const n = arr.length
    for (let i = 0; i < n - 1; i++) {
        for (let j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                [arr[j],arr[j+1]] = [arr[j+1],arr[j]]
                states.push([arr[j], arr[j + 1], 'swap']);
            } 
            else {
                states.push([arr[j], arr[j + 1], 'no-swap']);
            }
        }
    }
    return states
}
function htmlToElement(html) {
    var template = document.createElement('template');
    html = html.trim(); // Never return a text node of whitespace as the result
    template.innerHTML = html;
    return template.content.firstChild;
}

function createArray(e) {
    e.preventDefault()
    const numbers = document.getElementById('numbers_input').value
    const numbersArray = numbers.split(',').map(num => parseInt(num.trim(), 10)).filter(num => Number.isInteger(num))
    globalNumbers = numbersArray
    sorter = null
    globalIndex = 0
    const main = document.getElementById('numbers-display')
    main.innerHTML = ''
    main.appendChild(htmlToElement(createArrayMarkup(numbersArray)))
}
function createArrayMarkup(array) {
    const els = array.map((num, idx) => `<div class="num num-${idx}" data-val="${num}" style="width:14px;height:${num * 16}px;order:${idx + 1}">${num}</div>`)
    els.push('</div>')
    els.unshift('<div class="num-holder">')
    return els.join("")
}

function next() {
    if (sorter === null) {
        sorter = bubbleSort(globalNumbers)
    }
    const k = sorter[globalIndex]
    globalIndex++
    console.log(k);
    if (k) {
    const [p, q, r] = k
        if (r !== 'no-swap') {
            updateDisplayArray(p, q)
        }
        tempHighlight(p, q)
    }
}

function updateDisplayArray(p, q) {
    const r = document.querySelector(`[data-val="${p}"]`)
    const s = document.querySelector(`[data-val="${q}"]`)
    const temp = r.style.order
    r.style.order = s.style.order
    s.style.order = temp
}
function tempHighlight(p, q) {
    const r = document.querySelector(`[data-val="${p}"]`)
    const s = document.querySelector(`[data-val="${q}"]`)
    r.style.border = s.style.border = '2px solid black'
    setTimeout(() => {
        r.style.border = s.style.border = ''
    }, 100)
}
