/*
SQLyog Community v10.3 
MySQL - 5.5.17 : Database - keypr
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`keypr` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `keypr`;

/*Table structure for table `order_details` */

DROP TABLE IF EXISTS `order_details`;

CREATE TABLE `order_details` (
  `id` int(11) NOT NULL,
  `item_code` varchar(10) DEFAULT NULL,
  `item_description` varchar(50) DEFAULT NULL,
  `unit_price` double DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `order_id` int(11) DEFAULT NULL,
  `charge_amount` double DEFAULT NULL,
  `date_created` timestamp NULL DEFAULT NULL,
  `date_modified` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `order` (`order_id`),
  CONSTRAINT `order` FOREIGN KEY (`order_id`) REFERENCES `resrevation_order` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `order_details` */

insert  into `order_details`(`id`,`item_code`,`item_description`,`unit_price`,`quantity`,`order_id`,`charge_amount`,`date_created`,`date_modified`) values (1,'CF','COFFEE',500,2,1,1000,'2014-02-20 18:04:00',NULL),(2,'TS','TOAST',550,2,2,1100,'2014-02-20 18:04:03',NULL),(3,'BG','BURGER',400,1,3,400,'2014-02-19 18:04:05',NULL),(4,'PZ','PIZZA',1000,2,4,2000,'2014-02-19 18:04:09',NULL),(5,'CK','CAKE',2000,1,5,2000,'2014-02-20 18:05:19',NULL);

/*Table structure for table `reservation` */

DROP TABLE IF EXISTS `reservation`;

CREATE TABLE `reservation` (
  `pms_id` int(11) NOT NULL COMMENT 'pms_system_ID',
  `stay_length` int(11) DEFAULT NULL COMMENT 'number of nights the guest is staying',
  `first_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `company_name` varchar(50) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL COMMENT 'primary address of guest',
  `loyalty_number` varchar(20) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL COMMENT 'primary phone of guest',
  `number_of_guest` int(11) DEFAULT NULL,
  `confirmation_number` varchar(20) DEFAULT NULL,
  `check_in_date` datetime DEFAULT NULL,
  `check_out_date` datetime DEFAULT NULL,
  `notes` varchar(255) DEFAULT NULL,
  `loyalty_program` varchar(50) DEFAULT NULL,
  `property_id` varchar(10) DEFAULT NULL,
  `credit_card_no` varchar(16) DEFAULT NULL,
  `reservation_source` varchar(45) DEFAULT NULL,
  `property_image` blob,
  `affiliate_id` varchar(10) DEFAULT NULL,
  `date_created` timestamp NULL DEFAULT NULL,
  `date_modified` timestamp NULL DEFAULT NULL,
  `messages` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`pms_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `reservation` */

insert  into `reservation`(`pms_id`,`stay_length`,`first_name`,`last_name`,`company_name`,`address`,`loyalty_number`,`phone`,`number_of_guest`,`confirmation_number`,`check_in_date`,`check_out_date`,`notes`,`loyalty_program`,`property_id`,`credit_card_no`,`reservation_source`,`property_image`,`affiliate_id`,`date_created`,`date_modified`,`messages`) values (100,10,'Rozer','Andy','Becker Industries','S-51,Park Street','al-b001','09878967545',5,'100','2014-02-10 15:53:14','2014-02-20 15:53:22','aa ; sd ; ','Not Available','adapter-1','1234565432','keypr',NULL,'afId-123','2014-02-10 15:55:15',NULL,'Do Not Disturb'),(101,3,'Michael','Smith','Pzefixer Solutions','N-11, New Colony Street','a1-b002','06785643456',2,'101','2014-02-18 15:58:52','2014-02-20 00:00:00','City Look','Not Available','adapter-2','1234565432','keypr',NULL,'afId-124','2014-02-18 16:00:29',NULL,'Video on demand'),(102,2,'Nizer','Hussain','Trasport Tracket','T-12 Old Fort','a1-b003','08976546786',1,'102','2014-02-20 16:02:41','2014-02-22 16:02:48','No Windows','Not Available','adapter-3','6754567843','desktop',NULL,'afId-125','2014-02-18 16:04:12',NULL,'Compact Class'),(103,1,'Paul','Color','Color Mixing Solutions','C-12 Draw Street','a1-b004','03421234567',3,'103','2014-02-18 16:06:04','2014-02-19 16:06:19','Near Beach','Not Available','adapter-4','7786654356','desktop',NULL,'afId-126','2014-02-18 16:07:36',NULL,'Blue Sky View'),(104,2,'New','Man','Nizer Industries','M-01 Munk Road','a1-b005','09898987893',1,'104','2014-03-01 15:29:59','2014-03-01 15:43:53','Sea Shore','Not Available','adapter-5','1111112222','keypr',NULL,'afId-127',NULL,NULL,'Sea View'),(105,3,'adi','haggar','frank Sonata','y-87 Hunk Street','a1-b006','8745954456',2,'105','2014-03-01 16:43:13','2014-03-01 16:43:36','King Size','Not Available','adapter -6','3455667755','keypr',NULL,'afld-128','2014-03-01 16:07:36',NULL,'Moon Light'),(106,3,'adi','haggar','frank Sonata','y-87 Hunk Street','a1-b006','8745954456',2,'106','2014-03-01 16:13:10','2014-03-01 16:21:41','King Size','Not Available','adapter -6','3455667755','keypr',NULL,'afld-128','2014-03-01 16:07:36',NULL,'Moon Light');

/*Table structure for table `reservation_payment_details` */

DROP TABLE IF EXISTS `reservation_payment_details`;

CREATE TABLE `reservation_payment_details` (
  `id` int(11) NOT NULL,
  `amount` double DEFAULT NULL,
  `credit_card_number` varchar(16) DEFAULT NULL,
  `reservation_id` int(11) DEFAULT NULL,
  `payment_date` datetime DEFAULT NULL,
  `date_created` timestamp NULL DEFAULT NULL,
  `date_modified` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `reservation_details` (`reservation_id`),
  CONSTRAINT `reservation_details` FOREIGN KEY (`reservation_id`) REFERENCES `reservation` (`pms_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `reservation_payment_details` */

insert  into `reservation_payment_details`(`id`,`amount`,`credit_card_number`,`reservation_id`,`payment_date`,`date_created`,`date_modified`) values (1,1000,'123456789',100,'2014-02-20 17:59:04','2014-02-20 17:59:20','2014-02-20 17:57:14'),(2,2000,'987654321',100,'2014-02-20 17:59:07','2014-02-20 17:59:24','2014-02-20 17:57:40'),(3,1000,'098756433',101,'2014-02-19 17:59:09','2014-02-19 17:59:26','2014-02-20 17:57:42'),(4,3000,'875356678',102,'2014-02-19 17:59:12','2014-02-19 17:59:29','2014-02-20 17:57:44'),(5,2500,'325425262',103,'2014-02-20 17:59:15','2014-02-19 17:59:32','2014-02-20 17:57:47');

/*Table structure for table `reservation_room_allocation` */

DROP TABLE IF EXISTS `reservation_room_allocation`;

CREATE TABLE `reservation_room_allocation` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `reservation_id` int(11) DEFAULT NULL,
  `room_number` int(11) DEFAULT NULL,
  `is_deleted` tinyint(1) DEFAULT NULL,
  `date_created` timestamp NULL DEFAULT NULL,
  `date_modified` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `resrevation` (`reservation_id`),
  KEY `room_number` (`room_number`),
  CONSTRAINT `resrevation` FOREIGN KEY (`reservation_id`) REFERENCES `reservation` (`pms_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `room_number` FOREIGN KEY (`room_number`) REFERENCES `room_details` (`room_number`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

/*Data for the table `reservation_room_allocation` */

insert  into `reservation_room_allocation`(`id`,`reservation_id`,`room_number`,`is_deleted`,`date_created`,`date_modified`) values (1,100,10,1,'2014-02-18 16:36:59',NULL),(2,101,11,1,'2014-02-18 16:37:02',NULL),(3,102,12,1,'2014-02-18 16:37:04',NULL),(4,103,14,1,'2014-02-18 16:37:07',NULL),(5,100,15,1,'2014-02-18 16:57:54',NULL),(8,104,16,1,'2014-03-01 15:29:59',NULL),(13,106,16,0,'2014-03-01 16:13:10',NULL),(16,105,16,1,'2014-03-01 16:43:13',NULL);

/*Table structure for table `reservation_room_rates` */

DROP TABLE IF EXISTS `reservation_room_rates`;

CREATE TABLE `reservation_room_rates` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `amount` double DEFAULT NULL,
  `effective_date` datetime DEFAULT NULL,
  `expiration_date` datetime DEFAULT NULL,
  `occurrence_type` varchar(10) DEFAULT NULL,
  `date_created` timestamp NULL DEFAULT NULL,
  `date_modified` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `reservation_room_allocation_id` int(11) NOT NULL,
  `room_code` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `reservation_room_allocation` (`reservation_room_allocation_id`),
  CONSTRAINT `reservation_room_allocation` FOREIGN KEY (`reservation_room_allocation_id`) REFERENCES `reservation_room_allocation` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

/*Data for the table `reservation_room_rates` */

insert  into `reservation_room_rates`(`id`,`amount`,`effective_date`,`expiration_date`,`occurrence_type`,`date_created`,`date_modified`,`reservation_room_allocation_id`,`room_code`) values (1,3000,'2014-02-18 16:38:48','2014-02-21 16:38:52','DAILY','2014-02-18 16:39:06','2014-02-18 16:40:19',1,'1'),(2,4000,'2014-02-18 16:40:37','2014-02-25 16:40:43','WEEKLY','2014-02-18 16:41:21','2014-02-18 16:40:24',2,'2'),(3,2000,'2014-02-18 16:41:32','2014-03-18 16:41:35','MONTHLY','2014-02-18 16:41:57','2014-02-18 16:40:27',3,'3'),(4,1000,'2014-02-18 16:43:16','2014-02-19 16:43:07','DAILY','2014-02-18 16:43:28','2014-02-18 16:43:36',4,'4'),(5,4000,'2014-02-18 16:59:58','2014-02-21 17:00:01','DAILY','2014-02-18 16:59:36','2014-02-18 17:00:32',5,'5'),(9,4000,'2014-03-01 15:29:59','2014-03-01 15:29:59','DAILY',NULL,'2014-03-01 15:29:59',8,NULL),(11,4000,'2014-03-01 16:13:10','2014-03-01 16:13:10','DAILY',NULL,'2014-03-01 16:13:10',13,NULL),(12,4000,'2014-03-01 16:43:13','2014-03-01 16:43:13','DAILY',NULL,'2014-03-01 16:43:13',16,NULL);

/*Table structure for table `resrevation_order` */

DROP TABLE IF EXISTS `resrevation_order`;

CREATE TABLE `resrevation_order` (
  `id` int(11) NOT NULL,
  `reservation_id` int(11) DEFAULT NULL,
  `total_amount` double DEFAULT NULL,
  `order_date` date DEFAULT NULL,
  `date_created` timestamp NULL DEFAULT NULL,
  `date_modified` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `resrevation_id` (`reservation_id`),
  CONSTRAINT `resrevation_id` FOREIGN KEY (`reservation_id`) REFERENCES `reservation` (`pms_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `resrevation_order` */

insert  into `resrevation_order`(`id`,`reservation_id`,`total_amount`,`order_date`,`date_created`,`date_modified`) values (1,100,1000,'2014-02-20','2014-02-20 17:44:42',NULL),(2,100,1100,'2014-02-19','2014-02-19 17:45:20',NULL),(3,101,400,'2014-02-19','2014-02-19 17:46:48',NULL),(4,102,2000,'2014-02-19','2014-02-19 17:46:45',NULL),(5,103,2000,'2014-02-20','2014-02-19 17:46:51',NULL);

/*Table structure for table `room_details` */

DROP TABLE IF EXISTS `room_details`;

CREATE TABLE `room_details` (
  `room_number` int(11) NOT NULL,
  `room_type_id` int(11) DEFAULT NULL,
  `date_created` timestamp NULL DEFAULT NULL,
  `date_modified` timestamp NULL DEFAULT NULL,
  `front_office_status` varchar(45) DEFAULT NULL,
  `house_keeping_status` varchar(45) DEFAULT NULL,
  `occupied_from` timestamp NULL DEFAULT NULL,
  `occupied_to` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`room_number`),
  KEY `room_type` (`room_type_id`),
  CONSTRAINT `room_type` FOREIGN KEY (`room_type_id`) REFERENCES `room_type` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `room_details` */

insert  into `room_details`(`room_number`,`room_type_id`,`date_created`,`date_modified`,`front_office_status`,`house_keeping_status`,`occupied_from`,`occupied_to`) values (10,1,'2014-02-11 16:24:05',NULL,'OCCUPIED','CLEAN','2014-02-26 17:26:09',NULL),(11,2,'2014-02-18 16:24:38',NULL,'OCCUPIED','CLEAN','2014-02-26 17:26:14',NULL),(12,3,'2014-02-18 16:25:09',NULL,'OCCUPIED','DIRTY','2014-02-26 17:26:18',NULL),(13,4,'2014-02-18 16:25:38',NULL,'OCCUPIED','DIRTY','2014-02-26 17:26:24',NULL),(14,5,'2014-02-18 16:25:58',NULL,'OCCUPIED','DIRTY','2014-02-26 17:26:28',NULL),(15,6,'2014-02-18 16:30:00',NULL,'OCCUPIED','DIRTY','2014-02-26 17:34:38','2014-02-28 20:11:54'),(16,1,'2014-02-18 16:30:00',NULL,'VACANT','CLEAN','2014-03-05 17:24:10','2014-03-15 17:24:22'),(17,2,'2014-02-26 15:27:08',NULL,'VACANT','CLEAN',NULL,NULL),(18,3,'2014-02-26 15:27:56',NULL,'OCCUPIED','DIRTY','2014-02-26 17:20:26','2014-02-28 17:20:37'),(19,5,'2014-02-26 15:28:34',NULL,'VACANT','CLEAN',NULL,NULL),(20,4,'2014-02-26 15:29:06',NULL,'VACANT','CLEAN','2014-03-01 17:21:12','2014-03-05 17:21:28');

/*Table structure for table `room_type` */

DROP TABLE IF EXISTS `room_type`;

CREATE TABLE `room_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(10) DEFAULT NULL,
  `description` varchar(50) DEFAULT NULL,
  `features` varchar(255) DEFAULT NULL,
  `date_created` timestamp NULL DEFAULT NULL,
  `date_modified` timestamp NULL DEFAULT NULL,
  `base_amount` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `room_type` */

insert  into `room_type`(`id`,`code`,`description`,`features`,`date_created`,`date_modified`,`base_amount`) values (1,'DX','Well Furnished with Video on Demand','Two Bed','2014-02-18 16:16:22',NULL,'3000'),(2,'SDX','Glass Wall','Sound Proof','2014-02-20 16:17:29',NULL,'4000'),(3,'EN','Good for Saving','Air Blower','2014-02-18 16:19:01',NULL,'5000'),(4,'EN','Rising Sun View','Air Conditioned','2014-02-18 16:19:01',NULL,'6000'),(5,'DX','Well Furnished with Video on Demand','Single Bed','2014-02-18 16:16:22',NULL,'7000'),(6,'DX','Well Furnished with Video on Demand','Air Blower','2014-02-18 16:16:22',NULL,'3000'),(10,'NZ','NEAR SEE','DOUBLE BED','2014-02-18 16:16:22',NULL,'4000'),(11,NULL,NULL,NULL,NULL,NULL,'4000');

/* Procedure structure for procedure `procCheckAvail` */

/*!50003 DROP PROCEDURE IF EXISTS  `procCheckAvail` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `procCheckAvail`(in p_start_date date,
in p_end_date date)
BEGIN

SELECT ry.id, rd.room_number, rd.front_office_status,ry.base_amount FROM room_details rd
INNER JOIN room_type ry ON ry.id = rd.room_type_id
WHERE (occupied_from IS NULL AND FRONT_OFFICE_STATUS='VACANT')
                            OR 
                            ( NOT(occupied_from BETWEEN p_start_date AND p_end_date ) 
                            AND NOT(occupied_to  BETWEEN p_start_date AND p_end_date)
                            AND NOT(p_start_date  BETWEEN  occupied_from AND occupied_to)
                            AND NOT(p_end_date BETWEEN  occupied_from AND occupied_to));


END */$$
DELIMITER ;

/* Procedure structure for procedure `procCheckIn` */

/*!50003 DROP PROCEDURE IF EXISTS  `procCheckIn` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `procCheckIn`(IN creditCardNumber VARCHAR(10),
IN confirmationNumber VARCHAR(5), IN roomNumber INT(5))
BEGIN

DECLARE reservationNumber INT(5);
DECLARE rowsAffectd INT(2);
DECLARE roomTypeId INT(3);
DECLARE reservationRoomAllocation INT(3);

DECLARE EXIT HANDLER FOR SQLEXCEPTION
BEGIN
ROLLBACK;
END;

DECLARE EXIT HANDLER FOR SQLWARNING
BEGIN
ROLLBACK;
END;


IF (roomNumber=0) THEN
   SELECT ('No Room Number Provided');
ELSE
   IF EXISTS (SELECT DL.ROOM_NUMBER, DL.FRONT_OFFICE_STATUS , 
   DL.HOUSE_KEEPING_STATUS ,DL.ROOM_TYPE_ID 
   FROM KEYPR.ROOM_DETAILS DL WHERE ( DL.ROOM_NUMBER = roomNumber ) 
   AND (DL.FRONT_OFFICE_STATUS='VACANT'))THEN
   
START TRANSACTION;
   
SELECT RES.PMS_ID INTO reservationNumber FROM KEYPR.RESERVATION RES WHERE CONFIRMATION_NUMBER=confirmationNumber;
   
 
UPDATE KEYPR.ROOM_DETAILS DL SET  DL.FRONT_OFFICE_STATUS='OCCUPIED'
            WHERE ( DL.ROOM_NUMBER = roomNumber);
 

INSERT INTO  RESERVATION_ROOM_ALLOCATION 
(RESERVATION_ID, ROOM_NUMBER,IS_DELETED,DATE_CREATED) 
VALUES(reservationNumber,roomNumber,0,NOW()) ;

SELECT id INTO reservationRoomAllocation FROM RESERVATION_ROOM_ALLOCATION WHERE room_number = roomNumber
AND reservation_id = reservationNumber;

INSERT INTO reservation_room_rates(amount,effective_date,expiration_date,occurrence_type,
reservation_room_allocation_id)
VALUES(4000,NOW(),NOW(),'DAILY',reservationRoomAllocation);

UPDATE RESERVATION SET CHECK_IN_DATE = NOW() WHERE PMS_ID =reservationNumber;

SELECT DL.ROOM_TYPE_ID INTO roomTypeId FROM KEYPR.ROOM_DETAILS DL WHERE DL.ROOM_NUMBER = roomNumber;


SELECT res.* , rrr.*,
rd.*, TY.CODE, TY.DESCRIPTION , TY.FEATURES 
FROM 
KEYPR.RESERVATION RES 
INNER JOIN reservation_room_allocation rra ON RES.PMS_ID = rra.RESERVATION_ID 
INNER JOIN reservation_room_rates rrr ON  rra.ID = rrr.RESERVATION_ROOM_ALLOCATION_ID
INNER JOIN room_details rd ON  rd.ROOM_NUMBER = rra.ROOM_NUMBER 
INNER JOIN room_type TY ON TY.ID = rd.ROOM_TYPE_ID 

WHERE RES.confirmation_number=confirmationNumber AND TY.ID = roomTypeId;

ELSE /*when the room is occupied*/

SELECT DL.ROOM_TYPE_ID INTO roomTypeId FROM KEYPR.ROOM_DETAILS DL WHERE DL.ROOM_NUMBER = roomNumber ;

SELECT res.* , rrr.*,
rd.*, TY.CODE, TY.DESCRIPTION , TY.FEATURES 
FROM 
KEYPR.RESERVATION RES 
INNER JOIN reservation_room_allocation rra ON RES.PMS_ID = rra.RESERVATION_ID 
INNER JOIN reservation_room_rates rrr ON  rra.ID = rrr.RESERVATION_ROOM_ALLOCATION_ID
INNER JOIN room_details rd ON  rd.ROOM_NUMBER = rra.ROOM_NUMBER 
INNER JOIN room_type TY ON TY.ID = rd.ROOM_TYPE_ID 
WHERE RES.confirmation_number=confirmationNumber AND TY.ID = roomTypeId;


END IF;

COMMIT;
   
END IF;
   
   


END */$$
DELIMITER ;

/* Procedure structure for procedure `procCheckOut` */

/*!50003 DROP PROCEDURE IF EXISTS  `procCheckOut` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `procCheckOut`(IN confirmationNumber VARCHAR(20))
BEGIN
 DECLARE pmsID INT(4);
 DECLARE roomNumber INT(4);
 DECLARE typeId INT (4);
 DECLARE checkOutIdentifier INT (2);
 DECLARE selQuery VARCHAR(1000);
 DECLARE  whereClause VARCHAR(200);
 
     
   SET @selQuery =  "SELECT res.*, rt.amount, rt.occurrence_type , rt.effective_date , rt.expiration_date ,  dl.* ,ty.* FROM  keypr.reservation res 
          INNER JOIN reservation_room_allocation AL ON res.pms_id = al.reservation_id 
					INNER JOIN room_details dl ON  dl.room_number = al.room_number 
					INNER JOIN room_type ty ON ty.id = dl.room_type_id 
          INNER JOIN reservation_room_rates rt ON  al.id = rt.reservation_room_allocation_id
          where ";    
              


  SELECT res.pms_id INTO pmsID FROM keypr.reservation res WHERE ( res.confirmation_number =confirmationNumber); 
  
  SELECT al.is_deleted INTO  checkOutIdentifier FROM reservation_room_allocation al WHERE reservation_id =pmsID;
  
  SELECT al.room_number  INTO roomNumber FROM reservation_room_allocation al WHERE reservation_id =pmsID ;
   
  SELECT dl.room_type_id INTO typeId FROM keypr.room_details dl WHERE (dl.room_number =roomNumber);
   
  IF EXISTS ( SELECT al.*  
  FROM reservation_room_allocation al WHERE al.room_number = roomNumber AND is_deleted = 0 
  AND reservation_id = pmsID) THEN    
  
 
  
  UPDATE   keypr.reservation_room_allocation  al set al.is_deleted = 1 where room_number = roomNumber and
  al.reservation_id = pmsID ;
      
        UPDATE keypr.room_details dl SET  dl.front_office_status='VACANT' WHERE (dl.room_number =roomNumber);    
        
        UPDATE keypr.reservation res SET res.check_out_date = NOW() WHERE ( res.pms_id =pmsID ) ;
       
           SET @whereClause = "res.pms_id = "+pmsID AND "ty.type_id = " +typeId;
          SET @selQuery = CONCAT(@selQuery,@whereClause);
          PREPARE stmt FROM @selQuery;
          EXECUTE stmt;
          
          ELSE
                
        
           SET @whereClause = "res.pms_id = "+pmsID AND "ty.type_id = " +typeId;
          SET @selQuery = CONCAT(@selQuery,@whereClause);
          PREPARE stmt FROM @selQuery;
          EXECUTE stmt;
          
 
 END IF ; 
 
         
END */$$
DELIMITER ;

/* Procedure structure for procedure `procGetFolio` */

/*!50003 DROP PROCEDURE IF EXISTS  `procGetFolio` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `procGetFolio`(IN confirmationNumber VARCHAR(20))
BEGIN

 
                  
           SELECT res.*, rt.amount, rt.occurrence_type , rt.effective_date , rt.expiration_date ,  dl.* ,ty.* ,ro.total_amount , ro.order_date , od.item_code , od.item_description , od.unit_price , od.quantity , od.charge_amount , od.order_id FROM  keypr.reservation res 
           INNER JOIN reservation_room_allocation AL ON res.pms_id = al.reservation_id 
	   INNER JOIN room_details dl ON  dl.room_number = al.room_number 
	   INNER JOIN room_type ty ON ty.id = dl.room_type_id 
           INNER JOIN reservation_room_rates rt ON  al.id = rt.reservation_room_allocation_id
           INNER JOIN resrevation_order ro ON res.pms_id = ro.reservation_id
           INNER JOIN order_details od ON ro.id = od.order_id
           WHERE res.confirmation_number =confirmationNumber ORDER BY pms_id , room_number , order_date;

         
           
          
          
END */$$
DELIMITER ;

/* Procedure structure for procedure `procSearchReserv` */

/*!50003 DROP PROCEDURE IF EXISTS  `procSearchReserv` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `procSearchReserv`(in whereClause varchar(1000))
BEGIN

DECLARE selQuery varchar(1000);

SET @selQuery ="
SELECT res.* , rt.amount ,rt.effective_date, rt.expiration_date , 
rt.occurrence_type, dl.room_number, dl.front_office_status, dl.house_keeping_status, 
ty.code, ty.description , ty.features 
FROM 
keypr.reservation res INNER JOIN reservation_room_allocation al ON res.pms_id = al.reservation_id 
INNER JOIN room_details dl ON  dl.room_number = al.room_number 
INNER JOIN room_type ty ON ty.id = dl.room_type_id 
INNER JOIN reservation_room_rates rt 
ON  al.id = rt.reservation_room_allocation_id WHERE " ;

SET @selQuery = CONCAT(@selQuery,whereClause);

PREPARE stmt FROM @selQuery;
EXECUTE stmt;

END */$$
DELIMITER ;

/* Procedure structure for procedure `procUpdateBooking` */

/*!50003 DROP PROCEDURE IF EXISTS  `procUpdateBooking` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `procUpdateBooking`(IN confirmationNumber VARCHAR(6) , IN notes VARCHAR(255))
BEGIN
        
 DECLARE pmsId INT(4);
 DECLARE roomNumber INT(4);
 DECLARE typeId INT (4);



    
     

      UPDATE keypr.reservation res SET  res.notes= notes
            WHERE ( res.confirmation_number  = confirmationNumber);
            
 
  SELECT res.pms_id INTO pmsId FROM keypr.reservation res WHERE ( res.confirmation_number =confirmationNumber); 
            
          SELECT res.*, rt.amount, rt.occurrence_type , rt.effective_date , rt.expiration_date ,  dl.* ,ty.* FROM  keypr.reservation res 
          INNER JOIN reservation_room_allocation AL ON res.pms_id = al.reservation_id 
	  INNER JOIN room_details dl ON  dl.room_number = al.room_number 
	  INNER JOIN room_type ty ON ty.id = dl.room_type_id 
          INNER JOIN reservation_room_rates rt ON  al.id = rt.reservation_room_allocation_id
           WHERE res.pms_id = pmsId;
           
           
    END */$$
DELIMITER ;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
