/*
SQLyog Ultimate v12.2.6 (64 bit)
MySQL - 5.7.21 : Database - test
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`test` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `test`;

/*Table structure for table `old` */

DROP TABLE IF EXISTS `old`;

CREATE TABLE `old` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `name_old` varchar(255) DEFAULT NULL,
  `user_id` int(4) DEFAULT NULL,
  `is_deleted` int(4) DEFAULT NULL,
  `mobile_old` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

/*Data for the table `old` */

insert  into `old`(`id`,`name_old`,`user_id`,`is_deleted`,`mobile_old`) values 
(1,'mm',1,0,'15621493371'),
(2,'ee',2,0,'15376768068'),
(3,'ee',3,0,'33333');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `name` varchar(32) DEFAULT NULL COMMENT '姓名',
  `mobile_two` varchar(20) DEFAULT NULL,
  `is_deleted` tinyint(1) DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COMMENT='用户表';

/*Data for the table `user` */

insert  into `user`(`id`,`name`,`mobile_two`,`is_deleted`) values 
(1,'nnn',NULL,0),
(2,'mss',NULL,1),
(3,'ss',NULL,1),
(4,'ss',NULL,1),
(5,'mmm',NULL,0),
(6,'dd',NULL,0),
(7,'xx',NULL,1),
(8,'www',NULL,0);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
