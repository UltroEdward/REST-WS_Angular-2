import './rxjs-extensions';

import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule }   from '@angular/forms';
import { HttpModule }    from '@angular/http';

import { AppComponent }         from './app.component';
import { CompanyComponent }      from './company.component';
import { CompanyService }      from './company.service';


@NgModule({
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule
  ],
  declarations: [
    AppComponent,
    CompanyComponent
  ],
   providers: [
    CompanyService
  ],
  bootstrap: [ AppComponent ]
})
export class AppModule { }
