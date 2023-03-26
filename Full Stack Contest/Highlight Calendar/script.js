const calendarDays = document.querySelectorAll(".calendar-day");
const inputDate = document.getElementById("input-date");
const inputColor = document.getElementById("input-color");
const highlightButton = document.getElementById("highlight-button");
const clearButton = document.getElementById("clear-button");

function highlightDate() {
  const selectedDate = parseInt(inputDate.value);
  if (selectedDate < 1 || selectedDate > 31) {
    alert("Please enter a valid date between 1 and 31.");
    return;
  }
  const selectedColors = inputColor.value;
  calendarDays.forEach(day => {
    const dayNum = parseInt(day.textContent);
    if (dayNum === selectedDate) {
      day.style.backgroundColor = selectedColors;
    }
  });
  inputDate.value = "";
  inputColor.value = "";
}

function clearDates() {
  calendarDays.forEach(day => {
    day.style.backgroundColor = "";
  });
}

highlightButton.addEventListener("click", highlightDate);
clearButton.addEventListener("click", clearDates);
