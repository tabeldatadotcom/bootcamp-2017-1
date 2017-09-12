import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

import { AppComponent }  from './app.component';
import { BelajarComponent } from './belajar.component';
import { TourHeroesComponent} from './tour.heroes.component';

@NgModule({
  imports:      [ BrowserModule , FormsModule],
  declarations: [ AppComponent , BelajarComponent, TourHeroesComponent],
  bootstrap:    [ AppComponent ]
})
export class AppModule { }
