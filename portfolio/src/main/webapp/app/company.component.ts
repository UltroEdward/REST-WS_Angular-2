import { Component, OnInit } from '@angular/core';
import { Router }            from '@angular/router';

import { Company }             from './models/company';
import { CompanyService }         from './company.service';

@Component({
  selector: 'companies',
  templateUrl: './app/company.component.html',
  providers: [CompanyService]
})

export class CompanyComponent implements OnInit {
  company: Company [];

  constructor(private companyService: CompanyService) { }

  getCompany(): void {
    this.companyService.getCompanies().then(company => this.company = company);
  }

  ngOnInit(): void {
    this.getCompany();
  }

}