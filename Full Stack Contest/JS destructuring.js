// You are given two objects of two persons rohanInfo of Rohan and gauriInfo of Gauri which have property height and weight . Now using the concept of Object destructuring , destructure their properties of height and weight into the mentioned variables and then use those variable to write code which return the array that contains two values , maximum height and maximum weight among the two objects.
// Input
// Function will take two arguments, both of them are objects of two different person,both of them contains two properties which are height and weight

// Output
// function returns an array having two numbers, maximum height and maximum weight from the given objects in that order.
// Example
// const mohan={height:180, weight:60};
// const radha={height:100, weight:120};

// const answer = calculateMax(mohan, radha) // returns an array of two numbers

// console.log(answer) // prints [ 180, 120 ]


// const rahul={height:10, weight:20};
// const ritika={height:30, weight:40};

// const answer = calculateMax(rahul, ritika) // returns an array of two numbers

// console.log(answer) // prints [ 30, 40 ]

//--------------
//complete the code using the code below
// const { } = rohanInfo;
// const { } = gauriInfo;

function calculateMax(rohanInfo, gauriInfo) {
  const {height : rohanHeight, weight : rohanWeight} = rohanInfo
  const {height : gauriHeight, weight : gauriWeight} = gauriInfo

  const maxHeight = Math.max(rohanHeight, gauriHeight)
  const maxWidth = Math.max(rohanWeight, gauriWeight)

  return [maxHeight, maxWidth];
}
