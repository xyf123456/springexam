/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.7.14-log : Database - exam
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`exam` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `exam`;

/*Table structure for table `course` */

DROP TABLE IF EXISTS `course`;

CREATE TABLE `course` (
  `id` varchar(255) NOT NULL,
  `c_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `course` */

insert  into `course`(`id`,`c_name`) values ('40282381679de83901679de84aae0001','语文');

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `id` varchar(255) NOT NULL,
  `s_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `student` */

insert  into `student`(`id`,`s_name`) values ('40282381679de83901679de84a660000','学生1');

/*Table structure for table `student_courses` */

DROP TABLE IF EXISTS `student_courses`;

CREATE TABLE `student_courses` (
  `students_id` varchar(255) NOT NULL,
  `courses_id` varchar(255) NOT NULL,
  PRIMARY KEY (`students_id`,`courses_id`),
  KEY `FKlwviiijdg10oc2ui4yl7adh1o` (`courses_id`),
  CONSTRAINT `FKlwviiijdg10oc2ui4yl7adh1o` FOREIGN KEY (`courses_id`) REFERENCES `course` (`id`),
  CONSTRAINT `FKrgo64lg01pxfwq2x9753jgywc` FOREIGN KEY (`students_id`) REFERENCES `student` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `student_courses` */

insert  into `student_courses`(`students_id`,`courses_id`) values ('40282381679de83901679de84a660000','40282381679de83901679de84aae0001');

/*Table structure for table `tb_role` */

DROP TABLE IF EXISTS `tb_role`;

CREATE TABLE `tb_role` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(255) DEFAULT NULL,
  `user_description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `tb_role` */

insert  into `tb_role`(`role_id`,`role_name`,`user_description`) values (1,'超级管理员','超级管理员'),(2,'角色2','角色2相关的描述'),(3,'角色3','角色3相关的描述'),(4,'角色4','角色4相关的描述');

/*Table structure for table `tb_user` */

DROP TABLE IF EXISTS `tb_user`;

CREATE TABLE `tb_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL,
  `user_password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `tb_user` */

insert  into `tb_user`(`id`,`user_name`,`user_password`) values (1,'系统管理员','111111');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
