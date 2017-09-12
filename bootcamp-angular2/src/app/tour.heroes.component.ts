import { Component } from '@angular/core';

@Component({
    selector : 'heroes-tour', 
    template: `
    <h2>{{title}}</h2>
    
    <ul *ngIf="showSuperHero">
        <li *ngFor="let superHero of daftarSuperHero">{{superHero}}</li>
    </ul>

    <input type='text' [(ngModel)]="text" #textValue> value will be appear here : {{text}} 
    `
})
export class TourHeroesComponent{
    title: string;
    daftarSuperHero:string[];
    showSuperHero:boolean;
    text:string;

    constructor(){
        this.title = "Tour of Heroes from Indonesian";
        this.daftarSuperHero = ['Saras 008', 'Bimasakti', 'Wiro sableng'];
        this.showSuperHero = false;
    }
}