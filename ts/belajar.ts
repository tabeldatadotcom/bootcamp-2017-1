console.log("Halo World");

// tipe data
// var 

// let

let isDone = false;
console.log("tipe data isDone adalah "+ typeof(isDone));

let decimal: number = 10;
console.log("tipe data decimal adalah "+ typeof(decimal)+" nilanya adalah "+ decimal);
decimal = 20;
console.log("Nilai decimal seelh di ubah adalah "+decimal);

let text: string = "Dimas Maryanto";

let sayHalo : string = `Halo nama saya ${text} ${decimal + 10}`
console.log(sayHalo);

let listHobbies : string[] = ['Coding', 'Futsal', 'Main Game'];
console.log(listHobbies);

let listCategories : [string, number];
listCategories = ["Halo", 10, 10, "World"];
console.log(listCategories);

enum JenisKelamin {LakiLaki, Perempuan}
let dimas: JenisKelamin = JenisKelamin.LakiLaki;
console.log(JenisKelamin[dimas]);

let notSure : any = 4;
console.log(notSure);
notSure = "stringlkasjdfkldsaf";
notSure = false;

let yessImSure = 4;
yessImSure = 5;

// only one initialization
const yesImFixed = 10;

function sayHaloFunc(){
    let yessImSure = 10;
    console.log("var inner yes im sure is "+ yessImSure);
}
sayHaloFunc();
console.log("var outter yess im sure "+ yessImSure);

function sayHaloWithArgs(text: string, nama: string = "Dimas Maryanto"){
    console.log(`${text} ${nama}`);
}

sayHaloWithArgs("Halo nama saya adalah ", "Dimas");
sayHaloWithArgs("Halo nama saya adalah ");

function sayHaloWithOptionalArgs(text: string, nama: string = "Dimas", umur?: number){
    console.log(`${text} ${nama} ${umur}`);
}

sayHaloWithOptionalArgs("Halo nama saya ", "Dimas", 24)
sayHaloWithOptionalArgs("Halo nama saya ", "Dimas")
