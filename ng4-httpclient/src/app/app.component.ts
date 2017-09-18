import {Component} from '@angular/core';
import {HttpClient, HttpParams} from '@angular/common/http';
import {User} from "./user.model";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  title: string;
  userValue: User = new User();

  constructor(private _http: HttpClient) {
    this._http.get<User>("http://localhost:8080/sayHalo").subscribe(data => {
      this.userValue = data;
    })
  }

  submitNewUser(value: User) {
    this._http.get(`http://localhost:8080/user/new?username=${value.username}&password=${value.password}`).subscribe();
  }
}
