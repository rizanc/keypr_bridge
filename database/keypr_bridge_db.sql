
--
-- Current Database: `keypr_bridge_db`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `keypr_bridge_db` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `keypr_bridge_db`;

--
-- Table structure for table `room_details`
--

DROP TABLE IF EXISTS `room_details`;

CREATE TABLE `room_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `room_number` int(11) DEFAULT NULL,
  `room_type` varchar(10) DEFAULT NULL,
  `front_office_status` varchar(45) DEFAULT NULL,
  `house_keeping_status` varchar(45) DEFAULT NULL,
  `room_status` varchar(45) DEFAULT NULL,
  `date_created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `date_modified` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;


--
-- Table structure for table `room_details_upload`
--

DROP TABLE IF EXISTS `room_details_upload`;

CREATE TABLE `room_details_upload` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `room_number` int(11) DEFAULT NULL,
  `room_type` varchar(10) DEFAULT NULL,
  `front_office_status` varchar(45) DEFAULT NULL,
  `house_keeping_status` varchar(45) DEFAULT NULL,
  `room_status` varchar(45) DEFAULT NULL,
  `date_created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `date_modified` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


--
-- Table structure for table `room_inventory`
--

DROP TABLE IF EXISTS `room_inventory`;

CREATE TABLE `room_inventory` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type_code` varchar(10) NOT NULL,
  `total_rooms` int(11) NOT NULL,
  `total_rooms_available` int(11) NOT NULL,
  `date_created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `date_modified` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8;


--
-- Table structure for table `room_inventory_upload`
--

DROP TABLE IF EXISTS `room_inventory_upload`;

CREATE TABLE `room_inventory_upload` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type_code` varchar(10) NOT NULL,
  `total_rooms` int(11) NOT NULL,
  `total_rooms_available` int(11) NOT NULL,
  `date_created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `date_modified` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
