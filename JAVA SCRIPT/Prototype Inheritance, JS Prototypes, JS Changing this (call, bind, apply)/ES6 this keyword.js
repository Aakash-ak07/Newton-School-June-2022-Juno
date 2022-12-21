// Create a class FooBar, whose objects have foo and bar as their attributes.
// Also write the function solve(obj, param1, param2).
// obj: Object of class FooBar
// param1, param2: some random numbers provided to you directly as input.

// See the example for more clarity.
// Input
// Input will have 4 numbers, viz. foo,bar,param1, param2. separated by spaces.

// You need not worry about the same, it is handled properly by the hidden pre-function code.

// Example:
// 4 5 6 7
// Output
// Function solve(obj, param1, param2) should return the value obj.foo + obj.bar + func(param1, param2)

// There is a global function named func(a, b) , which takes two numbers as parameters and it's implementation is hidden.

// Note: func uses properties of obj (using this, just like class methods), but does not accept obj as a parameter.
// Example

// const obj = new FooBar(1, 2); // say
// console.log(solve(obj, param1, param2)) // prints a number as answer
// // param1 and param2 are some hidden numbers passed as input.


class FooBar{
    constructor(foo, bar){
        this.foo = foo;
        this.bar = bar;
    }
}


function solve(obj, a, b){
   // obj: object of class FooBar, with foo and bar as its attributes set from input
   // should somehow return the following
   // return obj.foo + obj.bar + func(a, b);

    return Number(obj.foo) + Number(obj.bar) + Number(func.call(obj, a, b));
}
