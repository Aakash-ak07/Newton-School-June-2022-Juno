// The call stack of javascript based on the LIFO format i. e. last in first out.
// Complete the functions greetEnglish and greetFrench so as the greetings are printed in the order : Hindi, English and French.
// Input
// Name of the person as string
// Output
// Greetings are printed in the order : Hindi, English, French
// Example
// Sample Input :
// John

// Sample Output :
// Namaste John!
// Hello John!
// Bonjour John!

function greetHindi(person) {
    console.log(`Namaste ${person}!`)
}
function greetEnglish(person) {
    greetHindi(person)
    console.log(`Hello ${person}!`)
}
function greetFrench(person) {
    greetEnglish(person)
    console.log(`Bonjour ${person}!`)
}
function Greetings(person) {
    greetFrench(person)
}
