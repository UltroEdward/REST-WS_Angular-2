import { NgModule }             from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { CompanyComponent }   from './company.component';
import { ArticleComponent }   from './article.component';
import { HomeComponent }   from './home.component';

const routes: Routes = [
  { path: '', redirectTo: '/home', pathMatch: 'full' },
  { path: 'home',  component: HomeComponent },
  { path: 'about',  component: CompanyComponent },
  { path: 'article/:id',  component: ArticleComponent }
];

@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})
export class AppRoutingModule {}
