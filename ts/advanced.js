"use strict";
console.log("dari advance.ts");
var TipeMobil;
(function (TipeMobil) {
    TipeMobil[TipeMobil["Sedan"] = 0] = "Sedan";
    TipeMobil[TipeMobil["Pickup"] = 1] = "Pickup";
    TipeMobil[TipeMobil["Truck"] = 2] = "Truck";
})(TipeMobil || (TipeMobil = {}));
var kijangInova = {
    mesin: "Toyota",
    roda: 4,
    tipe: TipeMobil.Sedan
};
console.log("object kijang inova " + kijangInova.roda);
var astraHonda = {
    cylinder: 1,
    piston: 2
};
console.log("Object astra honda " + astraHonda.piston);
