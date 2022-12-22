// Complete the object sayHiMixin and the function setPrototype. You should implement the following:

// setPrototype, this should set the prototype of a pre- defined class (not visible to you)User to sayHiMixin.

// sayHiMixin, this must override the method say of an already defined object (not visible to you) sayMixin.

// Note: The method "say" in sayMixin takes a single parameter as string (which in this case the "name" attribute of the User class) and returns a number based on it.
// Input
// Name of the person as string s.
// Output
// You should return the same value as the say function in sayMixin returns.
// Example

// // This is what you have to implement.

// let sayHiMixin = {
//  // this should inherit from sayMixin, and invoke it's "say" method somehow
//  // for example, 
//      const say = (name) => sayMixin.say(name);
//   // name is a string, which will infact be the `name` attribute of a `User` object
// };

// // You must setPrototype of User class to that of sayHiMixin object.
// function setPrototype(){
//  // some code here
// }
// // Finally, when
// // const obj = new User("Newton School")
// // console.log(obj.say())  // this should print whatever sayHiMixin.say returns, which in this case is 39...


let sayHiMixin = {
  __proto__:sayMixin,

  say(){
    return super.say(`${this.name}`)
  },
};

function setPrototype(){
  return Object.assign(User.prototype, sayHiMixin);
}
