/*
SQLyog Community v13.1.9 (64 bit)
MySQL - 5.6.24-log : Database - assignment1
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`assignment1` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `day_11`;

/*Table structure for table `countries` */

DROP TABLE IF EXISTS `countries`;

CREATE TABLE `countries` (
  `country_id` CHAR(2) NOT NULL,
  `country_name` VARCHAR(40) DEFAULT NULL,
  `region_id` INT(11) NOT NULL,
  PRIMARY KEY (`country_id`),
  KEY `region_id` (`region_id`),
  CONSTRAINT `countries_ibfk_1` FOREIGN KEY (`region_id`) REFERENCES `regions` (`region_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=INNODB DEFAULT CHARSET=utf8;

/*Data for the table `countries` */

INSERT  INTO `countries`(`country_id`,`country_name`,`region_id`) VALUES 
('AR','Argentina',2),
('AU','Australia',3),
('BE','Belgium',1),
('BR','Brazil',2),
('CA','Canada',2),
('CH','Switzerland',1),
('CN','China',3),
('DE','Germany',1),
('DK','Denmark',1),
('EG','Egypt',4),
('FR','France',1),
('HK','HongKong',3),
('IL','Israel',4),
('IN','India',3),
('IT','Italy',1),
('JP','Japan',3),
('KW','Kuwait',4),
('MX','Mexico',2),
('NG','Nigeria',4),
('NL','Netherlands',1),
('SG','Singapore',3),
('UK','United Kingdom',1),
('US','United States of America',2),
('ZM','Zambia',4),
('ZW','Zimbabwe',4);

/*Table structure for table `departments` */

DROP TABLE IF EXISTS `departments`;

CREATE TABLE `departments` (
  `department_id` INT(11) NOT NULL AUTO_INCREMENT,
  `department_name` VARCHAR(30) NOT NULL,
  `location_id` INT(11) DEFAULT NULL,
  PRIMARY KEY (`department_id`),
  KEY `location_id` (`location_id`),
  CONSTRAINT `departments_ibfk_1` FOREIGN KEY (`location_id`) REFERENCES `locations` (`location_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=INNODB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `departments` */

INSERT  INTO `departments`(`department_id`,`department_name`,`location_id`) VALUES 
(1,'Administration',1700),
(2,'Marketing',1800),
(3,'Purchasing',1700),
(4,'Human Resources',2400),
(5,'Shipping',1500),
(6,'IT',1400),
(7,'Public Relations',2700),
(8,'Sales',2500),
(9,'Executive',1700),
(10,'Finance',1700),
(11,'Accounting',1700);

/*Table structure for table `dependents` */

DROP TABLE IF EXISTS `dependents`;

CREATE TABLE `dependents` (
  `dependent_id` INT(11) NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(50) NOT NULL,
  `last_name` VARCHAR(50) NOT NULL,
  `relationship` VARCHAR(25) NOT NULL,
  `employee_id` INT(11) NOT NULL,
  PRIMARY KEY (`dependent_id`),
  KEY `employee_id` (`employee_id`),
  CONSTRAINT `dependents_ibfk_1` FOREIGN KEY (`employee_id`) REFERENCES `employees` (`employee_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=INNODB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;

/*Data for the table `dependents` */

INSERT  INTO `dependents`(`dependent_id`,`first_name`,`last_name`,`relationship`,`employee_id`) VALUES 
(1,'Penelope','Gietz','Child',206),
(2,'Nick','Higgins','Child',205),
(3,'Ed','Whalen','Child',200),
(4,'Jennifer','King','Child',100),
(5,'Johnny','Kochhar','Child',101),
(6,'Bette','De Haan','Child',102),
(7,'Grace','Faviet','Child',109),
(8,'Matthew','Chen','Child',110),
(9,'Joe','Sciarra','Child',111),
(10,'Christian','Urman','Child',112),
(11,'Zero','Popp','Child',113),
(12,'Karl','Greenberg','Child',108),
(13,'Uma','Mavris','Child',203),
(14,'Vivien','Hunold','Child',103),
(15,'Cuba','Ernst','Child',104),
(16,'Fred','Austin','Child',105),
(17,'Helen','Pataballa','Child',106),
(18,'Dan','Lorentz','Child',107),
(19,'Bob','Hartstein','Child',201),
(20,'Lucille','Fay','Child',202),
(21,'Kirsten','Baer','Child',204),
(22,'Elvis','Khoo','Child',115),
(23,'Sandra','Baida','Child',116),
(24,'Cameron','Tobias','Child',117),
(25,'Kevin','Himuro','Child',118),
(26,'Rip','Colmenares','Child',119),
(27,'Julia','Raphaely','Child',114),
(28,'Woody','Russell','Child',145),
(29,'Alec','Partners','Child',146),
(30,'Sandra','Taylor','Child',176);

/*Table structure for table `employees` */

DROP TABLE IF EXISTS `employees`;

CREATE TABLE `employees` (
  `employee_id` INT(11) NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(20) DEFAULT NULL,
  `last_name` VARCHAR(25) NOT NULL,
  `email` VARCHAR(100) NOT NULL,
  `phone_number` VARCHAR(20) DEFAULT NULL,
  `hire_date` DATE NOT NULL,
  `job_id` INT(11) NOT NULL,
  `salary` DECIMAL(8,2) NOT NULL,
  `manager_id` INT(11) DEFAULT NULL,
  `department_id` INT(11) DEFAULT NULL,
  PRIMARY KEY (`employee_id`),
  KEY `job_id` (`job_id`),
  KEY `department_id` (`department_id`),
  KEY `manager_id` (`manager_id`),
  CONSTRAINT `employees_ibfk_1` FOREIGN KEY (`job_id`) REFERENCES `jobs` (`job_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `employees_ibfk_2` FOREIGN KEY (`department_id`) REFERENCES `departments` (`department_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `employees_ibfk_3` FOREIGN KEY (`manager_id`) REFERENCES `employees` (`employee_id`)
) ENGINE=INNODB AUTO_INCREMENT=207 DEFAULT CHARSET=utf8;

/*Data for the table `employees` */

INSERT  INTO `employees`(`employee_id`,`first_name`,`last_name`,`email`,`phone_number`,`hire_date`,`job_id`,`salary`,`manager_id`,`department_id`) VALUES 
(100,'Steven','King','steven.king@gmail.com','515.123.4567','1987-06-17',4,24000.00,NULL,9),
(101,'Neena','Kochhar','neena.kochhar@gmail.com','515.123.4568','1989-09-21',5,17000.00,100,9),
(102,'Lex','De Haan','lex.de haan@gmail.com','515.123.4569','1993-01-13',5,17000.00,100,9),
(103,'Alexander','Hunold','alexander.hunold@gmail.com','590.423.4567','1990-01-03',9,9000.00,102,6),
(104,'Bruce','Ernst','bruce.ernst@gmail.com','590.423.4568','1991-05-21',9,6000.00,103,6),
(105,'David','Austin','david.austin@gmail.com','590.423.4569','1997-06-25',9,4800.00,103,6),
(106,'Valli','Pataballa','valli.pataballa@gmail.com','590.423.4560','1998-02-05',9,4800.00,103,6),
(107,'Diana','Lorentz','diana.lorentz@gmail.com','590.423.5567','1999-02-07',9,4200.00,103,6),
(108,'Nancy','Greenberg','nancy.greenberg@gmail.com','515.124.4569','1994-08-17',7,12000.00,101,10),
(109,'Daniel','Faviet','daniel.faviet@gmail.com','515.124.4169','1994-08-16',6,9000.00,108,10),
(110,'John','Chen','john.chen@gmail.com','515.124.4269','1997-09-28',6,8200.00,108,10),
(111,'Ismael','Sciarra','ismael.sciarra@gmail.com','515.124.4369','1997-09-30',6,7700.00,108,10),
(112,'Jose Manuel','Urman','jose manuel.urman@gmail.com','515.124.4469','1998-03-07',6,7800.00,108,10),
(113,'Luis','Popp','luis.popp@gmail.com','515.124.4567','1999-12-07',6,6900.00,108,10),
(114,'Den','Raphaely','den.raphaely@gmail.com','515.127.4561','1994-12-07',14,11000.00,100,3),
(115,'Alexander','Khoo','alexander.khoo@gmail.com','515.127.4562','1995-05-18',13,3100.00,114,3),
(116,'Shelli','Baida','shelli.baida@gmail.com','515.127.4563','1997-12-24',13,2900.00,114,3),
(117,'Sigal','Tobias','sigal.tobias@gmail.com','515.127.4564','1997-07-24',13,2800.00,114,3),
(118,'Guy','Himuro','guy.himuro@gmail.com','515.127.4565','1998-11-15',13,2600.00,114,3),
(119,'Karen','Colmenares','karen.colmenares@gmail.com','515.127.4566','1999-08-10',13,2500.00,114,3),
(120,'Matthew','Weiss','matthew.weiss@gmail.com','650.123.1234','1996-07-18',19,8000.00,100,5),
(121,'Adam','Fripp','adam.fripp@gmail.com','650.123.2234','1997-04-10',19,8200.00,100,5),
(122,'Payam','Kaufling','payam.kaufling@gmail.com','650.123.3234','1995-05-01',19,7900.00,100,5),
(123,'Shanta','Vollman','shanta.vollman@gmail.com','650.123.4234','1997-10-10',19,6500.00,100,5),
(126,'Irene','Mikkilineni','irene.mikkilineni@gmail.com','650.124.1224','1998-09-28',18,2700.00,120,5),
(145,'John','Russell','john.russell@gmail.com',NULL,'1996-10-01',15,14000.00,100,8),
(146,'Karen','Partners','karen.partners@gmail.com',NULL,'1997-01-05',15,13500.00,100,8),
(176,'Jonathon','Taylor','jonathon.taylor@gmail.com',NULL,'1998-03-24',16,8600.00,100,8),
(177,'Jack','Livingston','jack.livingston@gmail.com',NULL,'1998-04-23',16,8400.00,100,8),
(178,'Kimberely','Grant','kimberely.grant@gmail.com',NULL,'1999-05-24',16,7000.00,100,8),
(179,'Charles','Johnson','charles.johnson@gmail.com',NULL,'2000-01-04',16,6200.00,100,8),
(192,'Sarah','Bell','sarah.bell@gmail.com','650.501.1876','1996-02-04',17,4000.00,123,5),
(193,'Britney','Everett','britney.everett@gmail.com','650.501.2876','1997-03-03',17,3900.00,123,5),
(200,'Jennifer','Whalen','jennifer.whalen@gmail.com','515.123.4444','1987-09-17',3,4400.00,101,1),
(201,'Michael','Hartstein','michael.hartstein@gmail.com','515.123.5555','1996-02-17',10,13000.00,100,2),
(202,'Pat','Fay','pat.fay@gmail.com','603.123.6666','1997-08-17',11,6000.00,201,2),
(203,'Susan','Mavris','susan.mavris@gmail.com','515.123.7777','1994-06-07',8,6500.00,101,4),
(204,'Hermann','Baer','hermann.baer@gmail.com','515.123.8888','1994-06-07',12,10000.00,101,7),
(205,'Shelley','Higgins','shelley.higgins@gmail.com','515.123.8080','1994-06-07',2,12000.00,101,11),
(206,'William','Gietz','william.gietz@gmail.com','515.123.8181','1994-06-07',1,8300.00,205,11);

/*Table structure for table `jobs` */

DROP TABLE IF EXISTS `jobs`;

CREATE TABLE `jobs` (
  `job_id` INT(11) NOT NULL AUTO_INCREMENT,
  `job_title` VARCHAR(35) NOT NULL,
  `min_salary` DECIMAL(8,2) DEFAULT NULL,
  `max_salary` DECIMAL(8,2) DEFAULT NULL,
  PRIMARY KEY (`job_id`)
) ENGINE=INNODB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

/*Data for the table `jobs` */

INSERT  INTO `jobs`(`job_id`,`job_title`,`min_salary`,`max_salary`) VALUES 
(1,'Public Accountant',4200.00,9000.00),
(2,'Accounting Manager',8200.00,16000.00),
(3,'Administration Assistant',3000.00,6000.00),
(4,'President',20000.00,40000.00),
(5,'Administration Vice President',15000.00,30000.00),
(6,'Accountant',4200.00,9000.00),
(7,'Finance Manager',8200.00,16000.00),
(8,'Human Resources Representative',4000.00,9000.00),
(9,'Programmer',4000.00,10000.00),
(10,'Marketing Manager',9000.00,15000.00),
(11,'Marketing Representative',4000.00,9000.00),
(12,'Public Relations Representative',4500.00,10500.00),
(13,'Purchasing Clerk',2500.00,5500.00),
(14,'Purchasing Manager',8000.00,15000.00),
(15,'Sales Manager',10000.00,20000.00),
(16,'Sales Representative',6000.00,12000.00),
(17,'Shipping Clerk',2500.00,5500.00),
(18,'Stock Clerk',2000.00,5000.00),
(19,'Stock Manager',5500.00,8500.00);

/*Table structure for table `locations` */

DROP TABLE IF EXISTS `locations`;

CREATE TABLE `locations` (
  `location_id` INT(11) NOT NULL AUTO_INCREMENT,
  `street_address` VARCHAR(40) DEFAULT NULL,
  `postal_code` VARCHAR(12) DEFAULT NULL,
  `city` VARCHAR(30) NOT NULL,
  `state_province` VARCHAR(25) DEFAULT NULL,
  `country_id` CHAR(2) NOT NULL,
  PRIMARY KEY (`location_id`),
  KEY `country_id` (`country_id`),
  CONSTRAINT `locations_ibfk_1` FOREIGN KEY (`country_id`) REFERENCES `countries` (`country_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=INNODB AUTO_INCREMENT=2701 DEFAULT CHARSET=utf8;

/*Data for the table `locations` */

INSERT  INTO `locations`(`location_id`,`street_address`,`postal_code`,`city`,`state_province`,`country_id`) VALUES 
(1400,'2014 Jabberwocky Rd','26192','Southlake','Texas','US'),
(1500,'2011 Interiors Blvd','99236','South San Francisco','California','US'),
(1700,'2004 Charade Rd','98199','Seattle','Washington','US'),
(1800,'147 Spadina Ave','M5V 2L7','Toronto','Ontario','CA'),
(2400,'8204 Arthur St',NULL,'London',NULL,'UK'),
(2500,'Magdalen Centre, The Oxford Science Park','OX9 9ZB','Oxford','Oxford','UK'),
(2700,'Schwanthalerstr. 7031','80925','Munich','Bavaria','DE');

/*Table structure for table `regions` */

DROP TABLE IF EXISTS `regions`;

CREATE TABLE `regions` (
  `region_id` INT(11) NOT NULL AUTO_INCREMENT,
  `region_name` VARCHAR(25) DEFAULT NULL,
  PRIMARY KEY (`region_id`)
) ENGINE=INNODB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `regions` */

INSERT  INTO `regions`(`region_id`,`region_name`) VALUES 
(1,'Europe'),
(2,'Americas'),
(3,'Asia'),
(4,'Middle East and Africa');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

/*Execute the following queries:*/

/*1. SELECT the FULL NAME OF the employees, the DATE they were hired AND the NAME OF their manager.*/

SELECT CONCAT(emp.first_name, ' ', emp.last_name) 
AS full_name, emp.hire_date,
CONCAT(man.first_name, ' ', man.last_name) AS manager_name
FROM employees emp
LEFT JOIN employees man ON emp.manager_id = man.employee_id;


/*2. SELECT the FULL NAME OF the employees along WITH the RANGE OF salary they are TO be provided AND the salary they are currently receiving.*/

SELECT CONCAT(first_name, ' ', last_name) AS employee_name, salary,
CASE
WHEN salary BETWEEN 10000 AND 15000 THEN 'HIGH SALARY'
WHEN salary BETWEEN 6000 AND 10000 THEN 'MEDIUM SALARY'
ELSE 'LOW SALARY'
END AS salary_range
FROM employees;

/*3. SELECT the department NAME along WITH the region NAME WHERE they are located.*/

SELECT dep.department_name, reg.region_name
FROM departments dep
INNER JOIN locations loc ON dep.location_id = loc.location_id
INNER JOIN countries con ON loc.country_id = con.country_id
INNER JOIN regions reg ON con.region_id = reg.region_id;

/*4. SELECT the FULL NAME OF the dependents, relationship WITH the employee AND the FULL NAME OF 
the employee FOR the employees IN the IT department.*/

SELECT CONCAT(dep.first_name, ' ', dep.last_name) 
AS department_name, dep.relationship,
CONCAT(emp.first_name, ' ', emp.last_name) AS employee_name
FROM dependents dep
INNER JOIN employees emp ON dep.employee_id = emp.employee_id
INNER JOIN departments dept ON emp.department_id = dept.department_id
WHERE dept.department_name = 'IT';

/*5. SELECT the FULL NAME OF the dependents AND the corresponding contact NUMBER OF their related employee.*/

SELECT CONCAT(dep.first_name, ' ', dep.last_name) AS department_name,
emp.phone_number AS employee_concat
FROM dependents dep
INNER JOIN employees emp ON dep.employee_id = emp.employee_id;

/*6. WRITE a USER-defined FUNCTION TO display the FULL NAME OF the employee, job title & region name.    */

CREATE FUNCTION GetEmployeeDetails(employee_id INT)
RETURNS VARCHAR(255)
BEGIN
DECLARE employee_name VARCHAR(255);
DECLARE job_title VARCHAR(255);
DECLARE region_name VARCHAR(255);

SELECT CONCAT(emp.first_name, ' ', emp.last_name) INTO employee_name
FROM employees emp
WHERE emp.employee_id = employee_id;

SELECT job.job_title INTO job_title
FROM employees emp
INNER JOIN jobs job ON emp.job_id = job.job_id
WHERE emp.employee_id = employee_id;

SELECT reg.region_name INTO region_name
FROM employees emp
INNER JOIN departments dep ON emp.department_id = dep.department_id
INNER JOIN locations loc ON dep.location_id = loc.location_id
INNER JOIN countries con ON loc.country_id = con.country_id
INNER JOIN regions reg ON con.region_id = reg.region_id
WHERE emp.employee_id = employee_id;

RETURN CONCAT('Employee Name: ', employee_name, ', Jon Title: ',
job_title, ', Region Name: ', region_name);
END $$




