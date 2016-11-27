import { NgModule }             from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { CompanyComponent }   from './company.component';

const routes: Routes = [
  { path: '', redirectTo: 'about.jsp', pathMatch: 'full' },
  { path: 'about',  component: CompanyComponent },
  { path: 'about.jsp',  component: CompanyComponent }
];

@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})
export class AppRoutingModule {}

export const routedComponents = [CompanyComponent];