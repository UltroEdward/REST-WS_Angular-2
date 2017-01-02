import { Injectable }    from '@angular/core';
import { Headers, Http } from '@angular/http';

import 'rxjs/add/operator/toPromise';

import { Article } from './models/article';

@Injectable()
export class ArticleService {

  private headers = new Headers({'Content-Type': 'application/json'});
  private articleUrl = 'http://measqa.com:8081/rest/articles'; 

  constructor(private http: Http) { 
    this.http=http
  }

  getArticle(id: number): Promise<Article> {
    const url = `${this.articleUrl}/${id}`;
	
  let article: Article;
	
	console.log(this.http.get(url));
  console.log(this.http.get(url).toPromise().then(response => response.json() as Article));
	
  return this.http.get(url).toPromise().then(response => response.json() as Article);
}

};
