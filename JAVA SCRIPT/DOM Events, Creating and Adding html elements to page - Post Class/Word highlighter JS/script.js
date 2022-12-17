function highlighter() {
    const paraElement = document.querySelector('#paragraph-input');
    const wordElement = document.querySelector('#word-input');
    const wCounterElement = document.querySelector('#words-counter');
    const upperLowerCase = document.querySelector('#ignore-case').checked;

    if(!wordElement.value) 
        return;

    let newParaText = '';
    let i = 0;
    
    if (upperLowerCase) 
    {
        const reg = new RegExp(wordElement.value,'ig')
        newParaText = paraElement.innerText.replaceAll(reg, (args) => {
            i++;
            return `<span class="highlighted-txt">${args}</span>`
        })
    }
    else
    {
        newParaText = paraElement.innerText.replaceAll(wordElement.value, (args) => {
            i++;
            return `<span class="highlighted-txt">${args}</span>`
        })
    }

    paraElement.innerHTML = newParaText
    wCounterElement.innerText = i
}
