import { Injectable }    from '@angular/core';
import { Headers, Http } from '@angular/http';

import 'rxjs/add/operator/toPromise';

import { Company } from './models/company';

@Injectable()
export class CompanyService {

  private headers = new Headers({'Content-Type': 'application/json'});
  private companyUrl = '/rest/companies'; 

  constructor(private http: Http) { 
    this.http=http
  }

  getCompanies(): Promise<Company[]> {
    return this.http.get(this.companyUrl).toPromise().then(response => response.json() as Company[]);

  }

};
