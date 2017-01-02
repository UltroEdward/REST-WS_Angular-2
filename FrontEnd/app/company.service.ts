import { Injectable }    from '@angular/core';
import { Headers, Http } from '@angular/http';

import 'rxjs/add/operator/toPromise';

import { Company } from './models/company';

@Injectable()
export class CompanyService {

  private headers = new Headers({'Content-Type': 'application/json'});
 // private companyUrl = '/rest/companies'; 
private companyUrl = 'http://localhost:8080/rest/companies'; 

  constructor(private http: Http) { 
    this.http=http
  }

  getCompanies(): Promise<Company[]> {
//console.log(this.http.get(this.companyUrl));
 // console.log(this.http.get(this.companyUrl).toPromise().then(response => response.json() as Company[]));
	
    return this.http.get(this.companyUrl).toPromise().then(response => response.json() as Company[]);
  }

};
