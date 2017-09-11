console.log('Halo World');

var iniNomor = 1;
console.log(iniNomor + " tipe datanya adalah " + typeof (iniNomor));

var iniKaracter = "Halo nama saya dimas";
console.log(iniKaracter + " tipe datanya adalah " + typeof (iniKaracter));

var iniBoolean = true;
console.log(iniBoolean + " tipe datanya adalah " + typeof (iniBoolean));

var iniObject = {
    id: 10,
    nama: "Dimas Maryanto",
    status: "single",
    meritage: false
}
console.log("ini object dengan property nama " + iniObject.nama + " dan statusnya " + iniObject.status)

var iniArray = [10, 11, 12, 'Halo'];
console.log("ini array " + iniArray[3]);

var iniNull = null;
console.log("ini adalah " + iniNull);

var iniUndefined = undefined;
console.log("iniUndefined: "+ iniUndefined);

console.log("Halo ini var belum dideklarasikan "+ index);
var index = null;
console.log("Halo ini var belum kasih nilai "+ index);

var bil1 = 10;
var bil2 = 20;
var bil3 = bil1 + bil2;
console.log("bil1 + bil2 = "+ bil3);

var bilKarakter = "20";
bil3 = bil1 + bilKarakter;
console.log("bil1 + bilKarakter = "+ bil3);
bil3 = bil1 - bilKarakter;
console.log("bil1 + bilKarakter = "+ bil3);

var isSame = 10 == "10";
console.log("info 10 sama dengannya 2x '10' jawabanyan adalah "+ isSame);

isSame = 10 === "10";
console.log("info 10 sama dengannya 3x '10' jawabanyan adalah "+ isSame);

// ini menggunakan for
for(var i = 0; i < iniArray.length; i++){
    console.log(iniArray[i]);
}
// loop menggunakan do-while
var i = 0;
do{
    console.log(iniArray[i]);
i++;
}while(i < iniArray.length)

// loop menggunakan while
var i = 0;
while(i < iniArray.length){
    console.log(iniArray[i]);
    i++;
}

// loop menggunakan for ... in
for(var nilai in iniArray){
    console.log(iniArray[nilai]);
}

// select dengan if
if(bil1 === bil2){
    console.log("bil1 dan bil2 sama")
}else if(bil1 === bil3){
    console.log("bil1 dan bil3 sama")
}else{
    console.log("tidak ada yang sama")
}

//  select dengan switch case
switch(bil1){
    case bil2 : console.log("bil1 dan bil2 sama"); break;
    case bil3 : console.log("bil1 dan bil3 sama");break;
    default : console.log("tidak ada yang sama")
}

// declaration function
function sayHalo(){
    console.log("Halo ini dari funcation");
}
// pemanggilan funcation
sayHalo();

function haveAnArguments(nama, umur = 24){
    console.log("halo nama saya "+ nama+ " umur saya "+ umur);
}

haveAnArguments("Dimas");
haveAnArguments("Dimas", 25);
