import './rxjs-extensions';

import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule }   from '@angular/forms';
import { HttpModule }    from '@angular/http';

import { AppRoutingModule } from './app-routing.module';

//Components
import { AppComponent }         from './app.component';
import { CompanyComponent }      from './company.component';
import { ArticleComponent }      from './article.component';
import { HomeComponent }      from './home.component';
//Serives
import { CompanyService }      from './company.service';
import { ArticleService }      from './article.service';


@NgModule({
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    AppRoutingModule
  ],
  declarations: [
    AppComponent,
    CompanyComponent,
    ArticleComponent,
    HomeComponent
  ],
   providers: [
    CompanyService,
    ArticleService
  ],
 bootstrap: [ AppComponent ]

})
export class AppModule { }
