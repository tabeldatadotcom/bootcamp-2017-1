"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = Object.setPrototypeOf ||
        ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
        function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Greeter = (function () {
    function Greeter(message) {
        this.greeting = message;
    }
    Greeter.prototype.getGreeting = function () {
        return "Halo, nama saya " + this.greeting;
    };
    return Greeter;
}());
var greeter = new Greeter("Dimas Maryanto");
console.log(greeter.getGreeting());
var Mahasiswa = (function () {
    function Mahasiswa() {
        this.kerjaan = "Menerima Pelajaran";
        this.mataPelajaran = ["Matematika", "Programming", "Database"];
        this.kelas = "IF-01";
    }
    return Mahasiswa;
}());
var Dosen = (function () {
    function Dosen() {
        this.kerjaan = "Menberikan Pelajaran";
        this.mengajarDiKelas = ["IT", "Lab"];
        this.kelas = ["SI-03", "IF-01", "IF-02"];
    }
    return Dosen;
}());
var TipeKendaraan;
(function (TipeKendaraan) {
    TipeKendaraan[TipeKendaraan["Motor"] = 0] = "Motor";
    TipeKendaraan[TipeKendaraan["Mobil"] = 1] = "Mobil";
})(TipeKendaraan || (TipeKendaraan = {}));
var Mesin = (function () {
    function Mesin() {
    }
    return Mesin;
}());
var HondaCivic = (function (_super) {
    __extends(HondaCivic, _super);
    function HondaCivic() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    return HondaCivic;
}(Mesin));
var hondaCivicD012213VX = new HondaCivic();
console.log();
