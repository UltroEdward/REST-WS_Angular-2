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
	`PROJECT_BRIEF` varchar(100) NOT NULL,
	`PROJECT_WORK` varchar(1000) NOT NULL,
	 PRIMARY KEY (`PROJECT_ID`),
	 
	  CONSTRAINT `PROJECTS` FOREIGN KEY (`COMPANY_ID`) REFERENCES `COMPANIES` (`COMPANY_ID`)
        ON DELETE RESTRICT
        ON UPDATE RESTRICT
);





-- ******************** Create tables ******************** 
INSERT INTO `COMPANIES` VALUES (1, 'AdHOC', 'img/epam.png','www.adhoc.by', 'Senior QA', 'start', 'end');
INSERT INTO `ARTICLES` VALUES (1, 'Programming', 'img/cat.jpg', 'Programming is awesome', 'Programming is awesome - i know what i am speaking about!');
INSERT INTO `PROJECTS` VALUES (1, 1, 'KRONOS', 'www.kronos.com', 'brief', 'work');




