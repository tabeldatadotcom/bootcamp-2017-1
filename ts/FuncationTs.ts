function add(bil1:number, bil2: number){
    return bil1 + bil2;
}

let hasilPertambahan = add(10, 50);
console.log("hasil pertambahan 10 + 50 = "+ hasilPertambahan);

let myAdd = function (x: number, y: number) {return x + y;}
myAdd(10, 50);


function addNumberList(...listOfNumber:number[]){
    console.log(listOfNumber);
}

addNumberList(10, 9, 8, 7, 6, 5, 3, 2, 1);