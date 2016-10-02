DROP SCHEMA IF EXISTS `PORTFOLIO`;
CREATE SCHEMA IF NOT EXISTS `PORTFOLIO`;
USE `PORTFOLIO`;

-- ******************** Create tables ******************** 

CREATE TABLE `ARTICLES` (
	`ARTICLE_ID` int(10) NOT NULL auto_increment,
	`NAME` varchar(100) NOT NULL,
	`PATH_TO_PIC` varchar(100) NOT NULL,
	`DESCRIPTION_SHORT` varchar(100) NOT NULL,
	`DESCRIPTION_FULL` varchar(1000) NOT NULL,
	 PRIMARY KEY (`ARTICLE_ID`)
);

CREATE TABLE `COMPANIES` (
	`COMPANY_ID` int(10) NOT NULL auto_increment,
	`NAME` varchar(100) NOT NULL,
	`PATH_TO_PIC` varchar(100) NOT NULL,
	`URL` varchar(100) NOT NULL,
	`TITLE` varchar(100) NOT NULL,
	`START_DATE` varchar(100) NOT NULL,
	`END_DATE` varchar(1000) NOT NULL,
	 PRIMARY KEY (`COMPANY_ID`)
);

CREATE TABLE `PROJECTS` (
	`PROJECT_ID` int(10) NOT NULL auto_increment,
	`COMPANY_ID` int(10) NOT NULL,
	`NAME` varchar(100) NOT NULL,
	`URL` varchar(100) NOT NULL,
	`PROJECT_ABOUT` varchar(2000) NOT NULL,
	`PROJECT_WORK` varchar(2000) NOT NULL,
	 PRIMARY KEY (`PROJECT_ID`),
	 
	  CONSTRAINT `PROJECTS` FOREIGN KEY (`COMPANY_ID`) REFERENCES `COMPANIES` (`COMPANY_ID`)
        ON DELETE RESTRICT
        ON UPDATE RESTRICT
);





-- ******************** Create tables ******************** 
INSERT INTO `COMPANIES` VALUES (1, 'AdHOC', 'img/logo_epam.png','www.adhoc.by', 'Senior QA', 'start', 'end');
INSERT INTO `ARTICLES` VALUES (1, 'Programming', 'img/cat.jpg', 'Programming is awesome', 'Programming is awesome - i know what i am speaking about!');
INSERT INTO `PROJECTS` VALUES (1, 1, 'KRONOS', 'www.kronos.com', 'With the challenge to attract and retain quality talent today, human resource professionals need an integrated set of tools for managing and nurturing their organizations’ most valuable advantage from pre-hire to retire. Powered on a unified platform, the Kronos® full-suite human capital management (HCM) solution embraces the entire workforce — salaried or hourly, full-time or part-time — with end-to-end employee lifecycle management. Its comprehensive toolset integrates HR, time and attendance, payroll, scheduling, and more for managing your workforce at every stage — while providing managers with a single employee record updated in real time for driving productivity, increasing employee engagement, and making more informed business decisions.', 'Automation testing - Created Selenium framework from scratch, covered part of manual smoke tests. - Created SoapUI tests (tests running daily on Jenkins), sharing of best practices to SoapUi team - Created "POC" of REST-Assured based framework - Covering UI Smoke tests on Selenium - Created UI application for UI performance testing on Java + Selenium + Swing. Application allows to configure it and run existing Test Cases and report some metrics');
INSERT INTO `PROJECTS` VALUES (2, 1, 'KRONOS2', 'www.kronos2.com', 'With the challenge to attract and retain quality talent today, human resource professionals need an integrated set of tools for managing and nurturing their organizations’ most valuable advantage from pre-hire to retire. Powered on a unified platform, the Kronos® full-suite human capital management (HCM) solution embraces the entire workforce — salaried or hourly, full-time or part-time — with end-to-end employee lifecycle management. Its comprehensive toolset integrates HR, time and attendance, payroll, scheduling, and more for managing your workforce at every stage — while providing managers with a single employee record updated in real time for driving productivity, increasing employee engagement, and making more informed business decisions.', 'Automation testing - Created Selenium framework from scratch, covered part of manual smoke tests. - Created SoapUI tests (tests running daily on Jenkins), sharing of best practices to SoapUi team - Created "POC" of REST-Assured based framework - Covering UI Smoke tests on Selenium - Created UI application for UI performance testing on Java + Selenium + Swing. Application allows to configure it and run existing Test Cases and report some metrics');


