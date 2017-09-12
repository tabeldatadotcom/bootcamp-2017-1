"use strict";
console.log("Halo World");
// tipe data
// var 
// let
let isDone = false;
console.log("tipe data isDone adalah " + typeof (isDone));
let decimal = 10;
console.log("tipe data decimal adalah " + typeof (decimal) + " nilanya adalah " + decimal);
decimal = 20;
console.log("Nilai decimal seelh di ubah adalah " + decimal);
let text = "Dimas Maryanto";
let sayHalo = `Halo nama saya ${text} ${decimal + 10}`;
console.log(sayHalo);
let listHobbies = ['Coding', 'Futsal', 'Main Game'];
console.log(listHobbies);
let listCategories;
listCategories = ["Halo", 10, 10, "World"];
console.log(listCategories);
var JenisKelamin;
(function (JenisKelamin) {
    JenisKelamin[JenisKelamin["LakiLaki"] = 0] = "LakiLaki";
    JenisKelamin[JenisKelamin["Perempuan"] = 1] = "Perempuan";
})(JenisKelamin || (JenisKelamin = {}));
let dimas = JenisKelamin.LakiLaki;
console.log(JenisKelamin[dimas]);
let notSure = 4;
console.log(notSure);
notSure = "stringlkasjdfkldsaf";
notSure = false;
let yessImSure = 4;
yessImSure = 5;
// only one initialization
const yesImFixed = 10;
function sayHaloFunc() {
    let yessImSure = 10;
    console.log("var inner yes im sure is " + yessImSure);
}
sayHaloFunc();
console.log("var outter yess im sure " + yessImSure);
function sayHaloWithArgs(text, nama = "Dimas Maryanto") {
    console.log(`${text} ${nama}`);
}
sayHaloWithArgs("Halo nama saya adalah ", "Dimas");
sayHaloWithArgs("Halo nama saya adalah ");
function sayHaloWithOptionalArgs(text, nama = "Dimas", umur) {
    console.log(`${text} ${nama} ${umur}`);
}
sayHaloWithOptionalArgs("Halo nama saya ", "Dimas", 24);
sayHaloWithOptionalArgs("Halo nama saya ", "Dimas");
