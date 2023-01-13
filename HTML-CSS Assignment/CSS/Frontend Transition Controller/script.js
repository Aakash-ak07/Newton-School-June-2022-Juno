// You have to animate the box (div with id "box") based on the sliders given in the boilerplate.
// Use transition and transform properties of CSS and change these properties dynamically based on the slider values to animate the box.
// Use the given image as a reference. There are 5 properties you have to edit:
// // x: 0, for translate
// // y: 0, for translate
// // scale: 1,
// // rotation: 0,
// // duration: 1, for transition

// Note: Do not change the ids of the divs as this might cause the testcases to fill.
// Also, for the form, use the onchange listeners for sliders and do not add any submit button, as per the given image.



// javascript code goes here
const animatedDiv = document.getElementById("animation-box");

let animProperties = {
  x: 0,
  y: 0,
  scale: 1,
  rotation: 0,
  duration: 1,
};

function changeHandler() {
  animProperties.x = document.getElementById("anim-x").value;
  animProperties.y = document.getElementById("anim-y").value;
  animProperties.scale = document.getElementById("anim-scale").value;
  animProperties.rotation = document.getElementById("anim-rotation").value;
  animProperties.duration = document.getElementById("anim-duration").value;
  changeAllLabels();
  applyAnimation();
}

function changeAllLabels() {
  document.getElementById("anim-x-label").innerHTML = `X: ${animProperties.x}%`;
  document.getElementById("anim-y-label").innerHTML = `Y: ${animProperties.y}%`;
  document.getElementById("anim-scale-label").innerHTML = `Scale: ${animProperties.scale}`;
  document.getElementById("anim-rotation-label").innerHTML = `Rotation: ${animProperties.rotation}deg`;
  document.getElementById("anim-duration-label").innerHTML = `Duration: ${animProperties.duration}s`;
}


function applyAnimation() {
  animatedDiv.style.transform = `translate(${animProperties.x}%, ${animProperties.y}%) scale(${animProperties.scale}) rotate(${animProperties.rotation}deg)`;
  animatedDiv.style.transition = `transform ${animProperties.duration}s`;
}
