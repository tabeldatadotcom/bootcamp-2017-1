"use strict";
class Greeter {
    constructor(message) {
        this.greeting = message;
    }
    getGreeting() {
        return "Halo, nama saya " + this.greeting;
    }
}
let greeter = new Greeter("Dimas Maryanto");
console.log(greeter.getGreeting());
class Mahasiswa {
    constructor() {
        this.kerjaan = "Menerima Pelajaran";
        this.mataPelajaran = ["Matematika", "Programming", "Database"];
        this.kelas = "IF-01";
    }
}
class Dosen {
    constructor() {
        this.kerjaan = "Menberikan Pelajaran";
        this.mengajarDiKelas = ["IT", "Lab"];
        this.kelas = ["SI-03", "IF-01", "IF-02"];
    }
}
var TipeKendaraan;
(function (TipeKendaraan) {
    TipeKendaraan[TipeKendaraan["Motor"] = 0] = "Motor";
    TipeKendaraan[TipeKendaraan["Mobil"] = 1] = "Mobil";
})(TipeKendaraan || (TipeKendaraan = {}));
class Mesin {
}
class HondaCivic extends Mesin {
}
let hondaCivicD012213VX = new HondaCivic();
console.log();
