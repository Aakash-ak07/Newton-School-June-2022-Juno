const billItems = [{
  id: 1,
  itemName: "Bread",
  price: 20
}, {
  id: 2,
  itemName: "Butter",
  price: 50
}, {
  id: 3,
  itemName: "Tomatoes",
  price: 30
}, {
  id: 4,
  itemName: "Onion",
  price: 40
}, {
  id: 5,
  itemName: "Pomegranate",
  price: 60
}, {
  id: 6,
  itemName: "Apple",
  price: 40
}, {
  id: 7,
  itemName: "Grapes",
  price: 30
}, {
  id: 8,
  itemName: "Mango",
  price: 100
}]

let t;
window.onload = function(){
  t = document.getElementsByTagName("table").item(0);
  let r = document.createElement("tr");
  let h1 = document.createElement("th");
  let h2 = document.createElement("th");
  let h3 = document.createElement("th");

  h1.innerHTML = "<b>id</b>";
  h2.innerHTML = "<b>itemName</b>";
  h3.innerHTML = "<b>price</b>";

  r.appendChild(h1);
  r.appendChild(h2);
  r.appendChild(h3);
  t.appendChild(r);

  for(let i = 0; i < 8; i++)
  {
    let r = document.createElement("tr");
    let d1 = document.createElement("td");
    let d2 = document.createElement("td");
    let d3 = document.createElement("td");

    h1.innerHTML = billItems[i]["id"];
    h2.innerHTML = billItems[i]["itemName"];
    h3.innerHTML = billItems[i]["price"];

    r.appendChild(d1);
    r.appendChild(d2);
    r.appendChild(d3);
    t.appendChild(r);
  }
}

function update() {
  t.innerHTML = "";
  let text = document.getElementById("search-bar").value;
  text = text.toLowerCase();
  let a = [];
  for (let i = 0; i < 8; i++) 
  {
    let p = billItems[i]["itemName"].toLowerCase();
    if (p.indexOf(text) != -1) a.push(i);
  }

  if (a.length == 0) 
  {
    t.innerText = "No items found!";
    return;
  }

  let r = document.createElement("tr");
  let h1 = document.createElement("th");
  let h2 = document.createElement("th");
  let h3 = document.createElement("th");

  h1.innerHTML = "<b>id</b>";
  h2.innerHTML = "<b>itemName</b>";
  h3.innerHTML = "<b>price</b>";
  r.appendChild(h1);
  r.appendChild(h2);
  r.appendChild(h3);
  t.appendChild(r);

  for (let i = 0; i < a.length; i++) 
  {
    let r = document.createElement("tr");
    let d1 = document.createElement("td");
    let d2 = document.createElement("td");
    let d3 = document.createElement("td");
    d1.innerText = billItems[a[i]]["id"];
    d2.innerText = billItems[a[i]]["itemName"];
    d3.innerText = billItems[a[i]]["price"];
    r.appendChild(d1);
    r.appendChild(d2);
    r.appendChild(d3);
    t.appendChild(r);
  }
}
