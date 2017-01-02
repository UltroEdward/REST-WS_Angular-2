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
INSERT INTO `COMPANIES` VALUES (1, 'EPAM', 'img/logo_epam.png','https://www.epam.com', 'Senior QA Automation', 'May 2016', 'Present');
INSERT INTO `COMPANIES` VALUES (2, 'AdHoc', 'img/logo_adhoc.png','http://adhoc.by', 'Senior QA', 'June 2014', 'May 2016');
INSERT INTO `COMPANIES` VALUES (3, 'Bitcoin Miner', 'img/logo_bitcoin.png','', 'Senior QA', 'July 2015', 'April 2016');
INSERT INTO `COMPANIES` VALUES (4, 'Heineken', 'img/logo_heineken.png','http://www.heineken.com', 'Business Analyst', 'June 2013', 'May 2015');
INSERT INTO `COMPANIES` VALUES (5, 'PriorBank', 'img/logo_raiffeisen.png','https://www.priorbank.by/eu', 'Business Analyst', 'June 2011', 'May 2013');

INSERT INTO `ARTICLES` VALUES (1, 'Linux shell', 'img/topics/bash.png', 'A few common shell comdans with description. In fact its enough to do everything you wish.', '<h3>');

INSERT INTO `PROJECTS` VALUES (1, 1, 'Kronos', 'http://www.kronos.com', 'Web application for resource management (vacations, working time and so on)', '<ul><li>Position of key QA developer: Automation testing</li>  <li>Created Selenium framework from scratch, covered part of manual smoke tests</li> <li>Created SoapUI tests (tests running daily on Jenkins), sharing of best practices to SoapUi team</li> <li>Created "POC" of REST-Assured based framework</li> <li>Covering  UI Smoke tests on Selenium </li> <li>Created UI application for UI performance testing on Java + Selenium + Swing. Application allows to configure it and run existing Test Cases and report some metrics)</li> </ul>');
INSERT INTO `PROJECTS` VALUES (2, 2, 'FICO DMP_MANAGER', 'http://www.fico.com/en/latest-thinking/product-sheet/fico-decision-management-platform-product-sheet', 'FICOÂ® Decision Management Platform reduces the time to build, implement and scale analytics and decision management solutions across any organization. It enables easy analysis and visualization of data and, with a comprehensive set of tools and templates, provides a cost-effective and timely way to evaluate, customize, deploy and scale state-of-the-art analytics and decision management solutions. Users can now develop new solutions that leverage analytic tools, data sets and decision modeling along with extensible technologies provided by FICO and third-party partners.', '<ul> <li>testing most difficult manual tasks</li><li>I bring QA automation to project</li><li>Created UI smoke test from scratch Java+Selenium+testNG</li> <li>Created REST API tests, with daily running on Jenkins Java+ApacheHttp+testNG. About 40% of APi was covered by me</li><li>Created Test Plan of product. I created more then 80% of all TC</li> <li>Mentoring, creating tasks, estimations for junior QA</li> </ul>');
INSERT INTO `PROJECTS` VALUES (3, 2, 'Fungo', 'https://www.fungo.io', 'Web application for building and executing business process with abstarct programming', '<ul><li>manual testing</li><li>writing test cases</li></ul>');
INSERT INTO `PROJECTS` VALUES (4, 3, 'Bitcoin media portal', '', 'Web application for agregating news, metrics, and all data related to bitcoin', '<ul>  <li>Remote activity</li> <li>Manual testing</li> <li>regression and acceptance testing</li> <li>Weekly and monthly testing of all parts of functionality. I found and created about 50% of all defects (4 qa in a team)</li> <li>new feature testing and discussing. A lot of of my ideas was implemented for improving UX</li> <li>Automation testing</li> <li>developed automation web-form fillers, data parsers (Apache POI + Java + WebDriver)</li> <li>covered 20% of API on SoapUI</li> <li>Participating in developing UI test framework on Java + WebDriver + Serenity. More then 20+ complex scenario was covered by me in addition</li> <li>Creating TC and reviwing TC written by other team members. At last 40% of functionality covered</li> </ul>');
INSERT INTO `PROJECTS` VALUES (5, 4, 'Heineken', '', 'Sailing beer infrastructure', '<ul>  <li>Remote activity</li> <li>Manual testing</li> <li>Requirements Analysis</li> <li>Communication with developers</li>  </ul>');
INSERT INTO `PROJECTS` VALUES (6, 5, 'Virtual bank for all customers','https://www.priorbank.by/en/internetbanking-for-business', 'Web and stan-alone application for bank customers', '<ul><li>Manual testing</li><li>Requirements Analysis</li><li>Communication with developers</li> </ul>');
