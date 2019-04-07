/*
SQLyog Ultimate v11.11 (64 bit)
MySQL - 5.6.21 : Database - login
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`login` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `login`;

/*Table structure for table `course` */

DROP TABLE IF EXISTS `course`;

CREATE TABLE `course` (
  `course_id` int(11) NOT NULL AUTO_INCREMENT,
  `course` varchar(40) NOT NULL,
  `Status` int(2) NOT NULL,
  PRIMARY KEY (`course_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

/*Data for the table `course` */

insert  into `course`(`course_id`,`course`,`Status`) values (1,'Java',1),(2,'Andorid',1),(3,'C#',1),(4,'Html',1),(5,'Graphics',1),(6,'JavaScript',1),(7,'C++',1),(8,'ASP.net',1),(9,'SQL',1),(10,'Oracle',1);

/*Table structure for table `login` */

DROP TABLE IF EXISTS `login`;

CREATE TABLE `login` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Username` varchar(30) NOT NULL,
  `Post` enum('Admin','Teacher') NOT NULL,
  `status` int(2) NOT NULL,
  `password` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

/*Data for the table `login` */

insert  into `login`(`id`,`Username`,`Post`,`status`,`password`) values (1,'Vijay','Admin',1,'vijay'),(2,'Saad','Teacher',1,'saad'),(3,'Humza','Teacher',1,'humza'),(4,'Watson','Teacher',1,'watson'),(5,'abd','Teacher',1,'abd'),(6,'Amir','Teacher',1,'amir'),(7,'Mehdi','Teacher',1,'suneel1'),(8,'Usama','Teacher',1,'usama'),(9,'Mehdi','Teacher',1,'mehdi'),(10,'Suneel kumar','Teacher',1,'suneel1'),(11,'aa','Teacher',1,'aa'),(12,'aa','Teacher',1,'aab'),(13,'Ali raza','Teacher',1,'aliraza');

/*Table structure for table `student_table` */

DROP TABLE IF EXISTS `student_table`;

CREATE TABLE `student_table` (
  `student_id` int(11) NOT NULL AUTO_INCREMENT,
  `student_name` varchar(30) NOT NULL,
  `course` varchar(30) NOT NULL,
  `roll_no` varchar(30) NOT NULL,
  `fees` double NOT NULL,
  `id` int(11) NOT NULL,
  `Fees_Status` enum('Paid','Not Paid') NOT NULL,
  `status` int(2) NOT NULL,
  PRIMARY KEY (`student_id`),
  KEY `id` (`id`),
  CONSTRAINT `student_table_ibfk_1` FOREIGN KEY (`id`) REFERENCES `teacher_table` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=latin1;

/*Data for the table `student_table` */

insert  into `student_table`(`student_id`,`student_name`,`course`,`roll_no`,`fees`,`id`,`Fees_Status`,`status`) values (1,'Vk Soni','Java','16sw81',3054,1,'Paid',1),(2,'Ali','Java','16sw1',333333,1,'Paid',1),(3,'Ali','Java','16sw1',333333,1,'Not Paid',0),(4,'Asif','Java','16sw2',444444,1,'Paid',1),(5,'M.Marsh','JavaScript','16sw82',444444,2,'Not Paid',1),(6,'Akash','JavaScript','16sw91',3232,2,'Paid',1),(7,'Iqra','JavaScript','16sw171',33333,2,'Paid',1),(8,'Ayesha','JavaScript','16sw81',333,2,'Paid',1),(9,'Ayesha khan','JavaScript','16sw81',1234,2,'Not Paid',0),(10,'M.Johnson','JavaScript','16sw05',333,2,'Paid',1),(11,'Watson','JavaScript','16sw17',333,2,'Paid',1),(12,'Tom Cruse','JavaScript','43',30000,2,'Not Paid',1),(13,'Amar kumar','JavaScript','16',3232,2,'Paid',1),(14,'Rajesh kumar','JavaScript','12',3000,2,'Not Paid',1),(15,'aba','JavaScript','12',2122,2,'Paid',0),(16,'Ethan Hunt','JavaScript','1321',3000,2,'Not Paid',1),(17,'John','JavaScript','16sw91',31000,2,'Paid',1),(18,'Danish','JavaScript','13sw11',3433,2,'Not Paid',1),(19,'James Taylor','JavaScript','15RW91',4300,2,'Not Paid',0),(20,'Brenden','JavaScript','12SW32',323232,2,'Not Paid',1),(21,'Usama shaikh','C++','16sw167',100,7,'Not Paid',1),(22,'Raza','Java','16sw91',2000,1,'Not Paid',1),(23,'Amar','Graphics','81',2000,9,'Paid',1),(24,'ab','Andorid','12',2000,10,'Paid',1),(25,'wa','ASP.net','81',2000,11,'Not Paid',1),(26,'raza','C#','43',222,12,'Paid',1);

/*Table structure for table `teacher_course` */

DROP TABLE IF EXISTS `teacher_course`;

CREATE TABLE `teacher_course` (
  `id` int(11) NOT NULL,
  `course_id` int(11) NOT NULL,
  KEY `course_id` (`course_id`),
  KEY `id` (`id`),
  CONSTRAINT `teacher_course_ibfk_1` FOREIGN KEY (`course_id`) REFERENCES `course` (`course_id`),
  CONSTRAINT `teacher_course_ibfk_2` FOREIGN KEY (`id`) REFERENCES `teacher_table` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `teacher_course` */

insert  into `teacher_course`(`id`,`course_id`) values (1,1),(2,6),(3,3),(4,5),(5,4),(6,2),(7,7),(8,7),(9,5),(10,2),(11,8),(12,3);

/*Table structure for table `teacher_table` */

DROP TABLE IF EXISTS `teacher_table`;

CREATE TABLE `teacher_table` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `teacher_name` varchar(30) NOT NULL,
  `pass` varchar(20) NOT NULL,
  `Gender` enum('Male','Female') NOT NULL,
  `Age` int(11) NOT NULL,
  `status` int(2) NOT NULL,
  `teacher_status` int(2) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

/*Data for the table `teacher_table` */

insert  into `teacher_table`(`id`,`teacher_name`,`pass`,`Gender`,`Age`,`status`,`teacher_status`) values (1,'Saad','saad','Male',43,1,0),(2,'Humza','humza','Male',43,1,0),(3,'Watson','watson','Male',32,1,0),(4,'Ali','ali','Male',67,1,0),(5,'Amir','amir','Male',43,1,0),(6,'abd','abd','Male',43,1,0),(7,'Usama','usama','Male',78,1,0),(8,'Mehdi','suneel1','Male',21,1,0),(9,'Suneel kumar','suneel1','Male',18,1,0),(10,'aa','aa','Male',43,1,0),(11,'aa','aab','Male',23,1,0),(12,'Ali raza','aliraza','Male',33,1,0);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
