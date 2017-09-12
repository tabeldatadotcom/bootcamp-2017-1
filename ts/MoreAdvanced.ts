class Greeter{
    greeting: string;

    constructor(message: string){
        this.greeting = message;
    }

    getGreeting(){
        return "Halo, nama saya "+ this.greeting;
   }
}

let greeter = new Greeter("Dimas Maryanto");
console.log(greeter.getGreeting());

interface Universitas{
    kerjaan: string;
}

class Mahasiswa implements Universitas{
    kerjaan: string = "Menerima Pelajaran";
    mataPelajaran: string[] = ["Matematika", "Programming", "Database"];
    kelas: string = "IF-01";
}

class Dosen implements Universitas{
    kerjaan : string = "Menberikan Pelajaran";
    mengajarDiKelas: string[] = ["IT", "Lab"];
    kelas: string[] = ["SI-03", "IF-01", "IF-02"];
}

enum TipeKendaraan{
    Motor, Mobil
}


class Mesin{
    nama: string;
    namufacture: string;
    cylinder: number;
    tipe: TipeKendaraan;
}

class HondaCivic extends Mesin{
    
}
let hondaCivicD012213VX = new HondaCivic();
console.log()