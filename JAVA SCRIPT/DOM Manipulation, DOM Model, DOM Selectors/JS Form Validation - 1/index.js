const errorDiv=document.getElementById("errors-holder");
const resultDiv=document.getElementById("result-holder");
       
function ageChange(event){
    //This Function will run when 
    //you start typing in age input field
    
    //Get the value entered by the user
    console.log("event is",event.target)
    const enteredValue=Number(event.target.value);
    
    if(enteredValue < 5){
        errorDiv.innerText="You need to be atleast 5 years old to participate";
        const submitButton=document.getElementById("age_submit");
        submitButton.setAttribute("disabled",true);
    }
    else{
        errorDiv.innerText="";
        const submitButton=document.getElementById("age_submit");
        submitButton.removeAttribute("disabled",false);
    }
}

function handleSubmit(e){
    //Whenever Form is Submitted you need 
    //to write this
    e.preventDefault();
    const ageEntered=Number(document.getElementById("q_age").value);
    const phoneCheckbox=document.getElementById("q_owns_phone");
    //.checked returns if your checkbox is checked or not
    console.log("Phone Checkbox Value",phoneCheckbox.checked);
    if(ageEntered===0){
            errorDiv.innerText="Please choose age"
    }
    else{
        errorDiv.innerText="";
        //We are sure that some age is entered
        if(ageEntered<13&&phoneCheckbox.checked){
            resultDiv.innerText="You are too young to have a phone"
        }
        else if(ageEntered<13&&!phoneCheckbox.checked){
            resultDiv.innerText="You will get a phone soon"
        }
        else if(phoneCheckbox.checked){
            resultDiv.innerText="Use your phone in moderation"
        }
        else{
            resultDiv.innerText="You should get a phone"
        }
    }
}
