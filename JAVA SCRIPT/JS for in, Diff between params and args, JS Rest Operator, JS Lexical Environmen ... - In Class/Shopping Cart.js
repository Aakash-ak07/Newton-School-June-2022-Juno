// Instead of creating a static shopping list with paper and a pen, create it dynamically. Take the list item and the price from the user and further find the grand total.
// Details:
// Two input fields should be displayed that take name and price as input.
// A button with innerText Add should be rendered.
// When the add button is clicked, list should be updated and rendered through a table.
// data-ns-test="item-name" and data-ns-test="item-price" should be used to label name and price in table
// item-name-input and item-price-input should be used as id for name and price input fields.
// Total price of all element in the list should be displayed in an element with data-ns-test="grandTotal". This element should only have the value of the total and no other string.
// Input fields should be cleared once element has been added to the list
// Initially, table should have only one row with grandTotal as 0.
// Invalid input should not be accepted.

// html part

<h1>Grocery List</h1>
<input placeholder="item name" id="item-name-input">
<input placeholder="item price" type="number" id="item-price-input">
<button onclick="submitItem()"> Add</button>

<table>
        <tr>
            <th>Sr. No.</th>
            <th>Title</th>
            <th>Price</th>
        </tr>
        <tr>
            <td>Grand Total</td>
            <td data-ns-test="grandTotal">0</td>
        </tr>
</table>

// JS part

let tableHeading = document.createElement('tr');
tableHeading.innerHTML = '<th>Sr. No.</th><th>Title</th><th>Price</th>'
function CreateRow(data) {
    let tableRow = document.createElement('tr');
    tableRow.innerHTML = '<td>' + data.index + '</td><td data-ns-test="item-name">' + data.name + '</td><td data-ns-test="item-price">' + data.price + '</td>';
    return tableRow;
}
function total(data) {
    let sum = 0;
    for (let i = 0; i < data.length; i++) {
        sum += parseInt(data[i].price);
    }

    let returnData = document.createElement('tr')
    returnData.innerHTML = '<td>Grand Total</td><td data-ns-test="grandTotal">' + sum + '</td>';
    return returnData;
}
let dataHolder = []
function submitItem() 
{
    if (document.getElementById('item-price-input').value !== "")
        if (document.getElementById('item-name-input').value !== "") 
        {
            dataHolder.push({ index: dataHolder.length, name: document.getElementById('item-name-input').value, price: document.getElementById('item-price-input').value })
            document.getElementById('item-name-input').value = ""
            document.getElementById('item-price-input').value = ""

            document.getElementsByTagName('table')[0].innerHTML = "";
            document.getElementsByTagName('table')[0].appendChild(tableHeading);
            for (let i = 0; i < dataHolder.length; i++)
                document.getElementsByTagName('table')[0].appendChild(CreateRow(dataHolder[i]));
            document.getElementsByTagName('table')[0].appendChild(total(dataHolder))
        }
}
