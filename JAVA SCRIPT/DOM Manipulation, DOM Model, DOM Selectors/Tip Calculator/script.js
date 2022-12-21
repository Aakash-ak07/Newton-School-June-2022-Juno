window.onload =() =>{
    document.querySelector('#calculate').onclick = calculateTip;
}

function calculateTip(){
    let bill = document.querySelector('#billamt').value;
    let tipPresent = document.querySelector('#serviceQual').value;
    let people = document.querySelector('#peopleamt').value;

    if(bill === '' || tipPresent === 'Select' || people === '')
    {
        alert("Please Enter Bill Amount");
        return;
    }
    if(people === '1'){
        document.querySelector('#each').style.display = 'none';
    }
    else
        document.querySelector('#each').style.display = 'block';

    let tip = (bill * tipPresent) / people;
    tip = tip.toFixed(2);
    document.getElementById('total').innerHTML = tip;
}
