// You need to create an Object in Javascript with the name Car.
// This object will have three properties with name color, seats, nitros
// The table given below contains the properties of the object, their data type, and the value for that property.


// Property of Object	Data Type of Property	value for property
// color	string	"white"
// seats	number	2
// nitros	boolean	false


// Create another variable msg which contains a string in it with the value
// "My car have seats seats and it is of color color"

// but you have to use the properties of the Object that you have created.

// Note: Generate Expected Output section will not work for this question
// You don't need to console.log anything here, just create the Car object and the msg variable.
// Input
// There is no input required for this question
// Output
// There is no output required for this question. You are only required to create the Car object and the msg string.

// Your code here
const Car = {
    color: "white",
    seats: 2,
    nitros: false,
};

const msg = `My car have ${Car.seats} seats and it is of color ${Car.color}`;
