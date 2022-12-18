// Writing programs that work when everything goes as expected is a good start. Making your programs behave properly when encountering unexpected conditions is where it really gets challenging. Proper error handling is important as it can help users to understand what went wrong. One of the important reasons to include proper error handling in your Web applications is to help you fix it for the next release and to make development faster.
// We will be constructing a smart evaluator which will test the validity of the input field. The input string(expression) should only evaluate addition, subtraction, multiplication, division of positive and negative integers. An expression can contain spaces. Any other character will be considered invalid and shall give OutOfRangeError.
// Details
// - Create two class that Extends Error class (OutOfRangeError,InvalidExprError)
// - OutOfRangeError class should take one and should have message field value Expression should only consist of integers and +-/* characters and not < arg >
// - InvalidExprError should have message field Expression should not have an invalid combination of expression
// - Above two classes should have a name field equal to their class name
// - evalString function should
// - Throw error InvalidExprError if there is a combination of operators like ++, /+, etc.
// - Throw Syntax Error if Expression start with +,/,* operator with message Expression should not start with invalid operator
// - Throw Syntax Error if Expression ends with +,/,*,- operator with message Expression should not end with invalid operator
// - Write your code in the try-catch block given.
// - Don't alter other codes given.


// -------html part----------//

<lable for="input1">Enter value:- </lable>
<input type="text" id="input1" />
<button type="button" onclick="evalString()">Test</button>

//---------Js Part-------------//

class OutOfRangeError extends Error {
  constructor(args) 
  {
    super();
    this.name = "OutOfRangeError";
    this.message = "Expression should only consist of integers and +-/* characters and not '" + args + "' ";
  }
}

class InvalidExprError extends Error {
  constructor() 
  {
    super();
    this.name = "InvalidExprError";
    this.message = "Expression should not have an invalid combination of expression";
  }
}


function evalString() {
  let str = document.getElementById("input1").value;
  try {

//write your code here
  for (let i = 0; i < str.length; i++) {
      if (
        [
          "0", "1", "2", "3", "4", "5", "6", "7",
          "8", "9", "+", "/", " ", "-", "*",
        ].includes(str[i]) == false
      ) 
      {
        throw new OutOfRangeError(str[i]);
      }
    }
    str.replace(" ", "");
    if (["+", "*", "/"].includes(str[0])) 
    {
      throw new SyntaxError("Expression should not start with invalid operator");
    }
    if (["+", "*", "/", "-"].includes(str[str.length - 1])) 
    {
      throw new SyntaxError("Expression should not end with invalid operator");
    }
    for (let i = 1; i < str.length - 1; i++) 
    {
      if ((["+", "/", "-", "*"].includes(str[i - 1]) && ["+", "/", "*"].includes(str[i])) ||
          (["+", "/", "-", "*"].includes(str[i - 1]) && str[i] == "-" && 
          ["+", "-", "/", "*"].includes(str[i + 1])) ) 
        {
          throw new InvalidExprError("Bad expression, Expression should not consist of an invalid sequence of operation");
        }
    }
    alert("passed");
  } 
  catch (e) 
  {
    alert("failed " + e.name + " " + e.message);
    if (window.Cypress) 
    {
      throw e;
    }
  }
}

if (window.Cypress) 
{
  window.OutOfRangeError = OutOfRangeError
  window.InvalidExprError = InvalidExprError
}
