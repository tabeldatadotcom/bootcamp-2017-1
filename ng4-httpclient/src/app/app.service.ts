import {Injectable, OnInit} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Post} from "./post.model";

@Injectable()
export class AppService {

  private postData: Post;

  getPostById(id: number): Post {
    let url = 'https://jsonplaceholder.typicode.com/posts/' + id;
    this._http.get<Post>(url).subscribe(post => {
      this.postData = post;
    });
    return this.postData;
  }

  constructor(private _http: HttpClient) {

  }


}
