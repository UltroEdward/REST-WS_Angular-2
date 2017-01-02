import { Project } from './project';

export class Company {
  id: number;
  companyImg: string;
  companyUrl: string;
  companyName: string;
  title: string;
  startDate: string;
  endDate: string;
  projects: Project [];
}