import { Project } from './project';

export class Company {
  id: number;
  logo: string;
  web: string;
  name: string;
  title: string;
  start: string;
  end: string;
  projects: Project [];
}