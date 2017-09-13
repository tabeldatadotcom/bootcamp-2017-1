import { Component } from '@angular/core';

@Component({
  selector: 'my-app',
  templateUrl: `./app.component.html`,
  styleUrls: ['./app.component.css']
})
export class AppComponent  { 

  namaKaryawan: string;

  constructor(){
    this.namaKaryawan = "Dimas Maryanto";
  }
  onSubmitData(value:any){
    console.log(value);
  }

}
