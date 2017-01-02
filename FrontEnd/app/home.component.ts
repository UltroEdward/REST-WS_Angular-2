import { Component, OnInit } from '@angular/core';

import { Article }             from './models/article';
import { ArticleService }         from './article.service';

@Component({
  moduleId: module.id,
  selector: 'home',
  templateUrl: './views/article.component.html'
})

export class HomeComponent implements OnInit {
  article: Article;

  constructor(private articleService: ArticleService) { }

  getArticle(id: number): void {
    this.articleService.getArticle(id).then(article => this.article = article);
  }

ngOnInit(): void {
    this.getArticle(1);
}

}