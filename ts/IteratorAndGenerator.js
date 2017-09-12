"use strict";
let listOfArray = ['10', 20, 'Halo World', 'Spring Framework'];
// for .. of
for (let value of listOfArray) {
    console.log(value);
}
// for .. in
for (let value in listOfArray) {
    console.log("index ke " + value + " memiliki nilai " + listOfArray[value]);
}
let setValues = new Set(["Cat", "Dog", "Cat"]);
for (let value of setValues) {
    console.log(value);
}
let mapValues = new Map();
mapValues.set(1, "Halo World");
mapValues.set(2, "Halo Typescript");
mapValues.set(3, "Halo Spring Framework");
console.log(mapValues.get(2));
mapValues.forEach((value, key) => {
    console.log("value : " + value + ", key : " + key);
});
