// You are given a restaurant menu with dishes broken down into 4 categories, including starters, veg, non-veg and desserts.
// Each section will have class="section" and have h3 with class="subtitle" can div with class="content" & id="listX" each element in content will have class="menuitem".
// Your objective is to use DOM manipulation and Javascript functions to create a feature that allows users to move the dishes up or down in same section by one at a time. Drag and drop should be used to move items around the menu.
// Note: There should be no movement across categories; all dishes should stay in their respective category as previously.

// The current dragging item
let draggingEle;

// The current position of mouse relative to the dragging element
let x = 0;
let y = 0;

let placeholder;
let isDraggingStarted = false;

const mouseDownHandler = function (e) {
  draggingEle = e.target.parentNode;

  // Calculate the mouse position
  const rect = draggingEle.getBoundingClientRect();
  x = e.pageX - rect.left;
  y = e.pageY - rect.top;

  // Attach the listeners to `document`
  document.addEventListener('mousemove', mouseMoveHandler);
  document.addEventListener('mouseup', mouseUpHandler);
};

const mouseMoveHandler = function (e) {
  const draggingRect = draggingEle.getBoundingClientRect();

  if (!isDraggingStarted) {
    // Update the flag
    isDraggingStarted = true;

    // Let the placeholder take the height of dragging element
    // So the next element won't move up
    placeholder = document.createElement('div');
    placeholder.classList.add('placeholder');
    draggingEle.parentNode.insertBefore(placeholder, draggingEle.nextSibling);

    // Set the placeholder's height
    placeholder.style.height = `${draggingRect.height}px`;
  }
  // Set position for dragging element
  draggingEle.style.position = 'absolute';
  draggingEle.style.top = `${e.pageY - y}px`;
  draggingEle.style.left = `${e.pageX - x}px`;

  const prevEle = draggingEle.previousElementSibling;
  const nextEle = placeholder.nextElementSibling;
  // User moves item to the top
  if (prevEle && isAbove(draggingEle, prevEle)) {
    // The current order    -> The new order
    // prevEle              -> placeholder
    // draggingEle          -> draggingEle
    // placeholder          -> prevEle
    swap(placeholder, draggingEle);
    swap(placeholder, prevEle);
    return;
  }
  // User moves the dragging element to the bottom
  if (nextEle && isAbove(nextEle, draggingEle)) {
    // The current order    -> The new order
    // draggingEle          -> nextEle
    // placeholder          -> placeholder
    // nextEle              -> draggingEle
    swap(nextEle, placeholder);
    swap(nextEle, draggingEle);
  }
};
const swap = function (nodeA, nodeB) {
  const parentA = nodeA.parentNode;
  const siblingA = nodeA.nextSibling === nodeB ? nodeA : nodeA.nextSibling;

  // Move `nodeA` to before the `nodeB`
  nodeB.parentNode.insertBefore(nodeA, nodeB);

  // Move `nodeB` to before the sibling of `nodeA`
  parentA.insertBefore(nodeB, siblingA);
};
const isAbove = function (nodeA, nodeB) {
  // Get the bounding rectangle of nodes
  const rectA = nodeA.getBoundingClientRect();
  const rectB = nodeB.getBoundingClientRect();

  return rectA.top + rectA.height / 2 < rectB.top + rectB.height / 2;
};

const mouseUpHandler = function () {
  // Remove the placeholder
  placeholder && placeholder.parentNode.removeChild(placeholder);
  // Reset the flag
  isDraggingStarted = false;

  // Remove the position styles
  draggingEle.style.removeProperty('top');
  draggingEle.style.removeProperty('left');
  draggingEle.style.removeProperty('position');

  x = null;
  y = null;
  draggingEle = null;

  // Remove the handlers of `mousemove` and `mouseup`
  document.removeEventListener('mousemove', mouseMoveHandler);
  document.removeEventListener('mouseup', mouseUpHandler);
};

// Query the list element
const list1 = document.getElementById('list1');

// Query all items
[].slice.call(list1.querySelectorAll('.menuitem')).forEach(function (item) {
  item.addEventListener('mousedown', mouseDownHandler);
});

// Query the list element
const list2 = document.getElementById('list2');

// Query all items
[].slice.call(list2.querySelectorAll('.menuitem')).forEach(function (item) {
  item.addEventListener('mousedown', mouseDownHandler);
});
// Query the list element
const list3 = document.getElementById('list3');

// Query all items
[].slice.call(list3.querySelectorAll('.menuitem')).forEach(function (item) {
  item.addEventListener('mousedown', mouseDownHandler);
});
// Query the list element
const list4 = document.getElementById('list4');

// Query all items
[].slice.call(list4.querySelectorAll('.menuitem')).forEach(function (item) {
  item.addEventListener('mousedown', mouseDownHandler);
});
