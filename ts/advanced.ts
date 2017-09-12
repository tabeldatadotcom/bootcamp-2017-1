console.log("dari advance.ts");

interface Mobil{
    mesin: string;
    roda: number;
    tipe: TipeMobil;
}

enum TipeMobil{ Sedan, Pickup, Truck}

let kijangInova : Mobil = {
    mesin: "Toyota",
    roda: 4,
    tipe: TipeMobil.Sedan
}

console.log("object kijang inova "+ kijangInova.roda);

interface Mesin{
    cylinder: number;
    piston: number;
    stiring?: string;    
}

let astraHonda : Mesin = {
    cylinder : 1,
    piston : 2
}

console.log("Object astra honda "+ astraHonda.piston)