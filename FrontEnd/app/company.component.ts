import { Component, OnInit } from '@angular/core';

import { Company }             from './models/company';
import { CompanyService }         from './company.service';

@Component({
  moduleId: module.id,
  selector: 'companies',
  templateUrl: './views/company.component.html'
})

export class CompanyComponent implements OnInit {
  company: Company [];

  constructor(private companyService: CompanyService) { }

  getCompanies(): void {
    this.companyService.getCompanies().then(company => this.company = company);
  }

  ngOnInit(): void {
    this.getCompanies();
  }

}