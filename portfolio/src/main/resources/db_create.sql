DROP SCHEMA IF EXISTS `PORTFOLIO`;
CREATE SCHEMA IF NOT EXISTS `PORTFOLIO`;
USE `PORTFOLIO`;

-- ******************** Create tables ******************** 

CREATE TABLE `PROJECTS` (
	`PROJECT_ID` int(10) NOT NULL auto_increment,
	`NAME` varchar(10) NOT NULL,
	`ROLE` varchar(1000) NOT NULL,
	`WEB_SITE` varchar(20) NOT NULL,
	`START_DATE` varchar(10) NOT NULL,
	`END_DATE` varchar(10) NOT NULL,
	`DESCRIPTION_SHORT` varchar(100) NOT NULL,
	`DESCRIPTION_FULL` varchar(1000) NOT NULL,
	 PRIMARY KEY (`PROJECT_ID`)
);

CREATE TABLE `ARTICLES` (
	`ARTICLE_ID` int(10) NOT NULL auto_increment,
	`NAME` varchar(100) NOT NULL,
	`PATH_TO_PIC` varchar(100) NOT NULL,
	`DESCRIPTION_SHORT` varchar(100) NOT NULL,
	`DESCRIPTION_FULL` varchar(1000) NOT NULL,
	 PRIMARY KEY (`ARTICLE_ID`)
);


-- ******************** Create tables ******************** 
INSERT INTO `PROJECTS` VALUES (1, 'FICO', 'qa', 'www.fico.com', 'start', 'end', 'testing', 'tons of testing');
INSERT INTO `ARTICLES` VALUES (1, 'Programming', 'pics/cat.jpg', 'Programming is awesome', 'Programming is awesome - i know what i am speaking about!');



