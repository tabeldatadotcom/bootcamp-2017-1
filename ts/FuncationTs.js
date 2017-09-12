"use strict";
function add(bil1, bil2) {
    return bil1 + bil2;
}
let hasilPertambahan = add(10, 50);
console.log("hasil pertambahan 10 + 50 = " + hasilPertambahan);
let myAdd = function (x, y) { return x + y; };
myAdd(10, 50);
function addNumberList(...listOfNumber) {
    console.log(listOfNumber);
}
addNumberList(10, 9, 8, 7, 6, 5, 3, 2, 1);
