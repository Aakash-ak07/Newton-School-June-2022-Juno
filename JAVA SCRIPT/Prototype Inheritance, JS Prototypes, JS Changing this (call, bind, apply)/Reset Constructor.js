// You are given two constructor functions - Animal and Reptile where Reptile inherits from Animal (check the boiler plate code).

// Currently if you check the constructor property of objects instantiated from Reptile constructor, it would be set as [[Function: Animal]].
// You have to reset the constructor property for constructor function Reptile such that all objects instantiated from Reptile constructor have [[Function: Reptile]] as their constructor property.

// Note - You don't need to output anything, just write code to reset the constructor property.
// Input
// A string name and a number age.
// Output
// The constructor property for an instance of Reptile.
// Example
// const name = "snake"
// const age = 10

// const reptile = new Reptile(name, age)
// console.log(reptile.constructor) // prints [Function: Reptile] on console


function Animal(name, lifeSpan) {
  this.name = name;
  this.lifeSpan = lifeSpan;
}

function Reptile() {
  this.layEggs = function layEggs() {
    console.log("Reptile laid eggs.");
  };
}


Reptile.prototype = Object.create(Animal.prototype);

/** Do not make changes in the above code. Start writing your code here. */
Reptile.prototype.constructor = Reptile;
