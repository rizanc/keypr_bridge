-- MySQL dump 10.13  Distrib 5.5.15, for Win32 (x86)
--
-- Host: localhost    Database: keypr_bridge_db
-- ------------------------------------------------------
-- Server version	5.5.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `keypr_bridge_db`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `keypr_bridge_db` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `keypr_bridge_db`;

--
-- Table structure for table `idgenerator`
--

DROP TABLE IF EXISTS `idgenerator`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `idgenerator` (
  `id` int(11) NOT NULL DEFAULT '111111',
  `transId` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `idgenerator`
--

LOCK TABLES `idgenerator` WRITE;
/*!40000 ALTER TABLE `idgenerator` DISABLE KEYS */;
/*!40000 ALTER TABLE `idgenerator` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservation_room_allocation_upload`
--

DROP TABLE IF EXISTS `reservation_room_allocation_upload`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reservation_room_allocation_upload` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `reservation_upload_id` int(11) DEFAULT NULL,
  `room_number` varchar(10) DEFAULT NULL,
  `room_type_code` varchar(10) DEFAULT NULL,
  `date_created` timestamp NULL DEFAULT NULL,
  `date_modified` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `reservation_status_type` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `reservation_upload` (`reservation_upload_id`),
  CONSTRAINT `reservation_upload` FOREIGN KEY (`reservation_upload_id`) REFERENCES `reservation_upload` (`id`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservation_room_allocation_upload`
--

LOCK TABLES `reservation_room_allocation_upload` WRITE;
/*!40000 ALTER TABLE `reservation_room_allocation_upload` DISABLE KEYS */;
/*!40000 ALTER TABLE `reservation_room_allocation_upload` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservation_room_rates_upload`
--

DROP TABLE IF EXISTS `reservation_room_rates_upload`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reservation_room_rates_upload` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `rate_plan_code` varchar(10) DEFAULT NULL,
  `base_rate` double DEFAULT NULL,
  `date_created` timestamp NULL DEFAULT NULL,
  `date_modified` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `effective_date` datetime DEFAULT NULL,
  `expiration_date` datetime DEFAULT NULL,
  `room_allocation_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `room_allocation` (`room_allocation_id`),
  CONSTRAINT `room_allocation` FOREIGN KEY (`room_allocation_id`) REFERENCES `reservation_room_allocation_upload` (`id`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservation_room_rates_upload`
--

LOCK TABLES `reservation_room_rates_upload` WRITE;
/*!40000 ALTER TABLE `reservation_room_rates_upload` DISABLE KEYS */;
/*!40000 ALTER TABLE `reservation_room_rates_upload` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservation_upload`
--

DROP TABLE IF EXISTS `reservation_upload`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reservation_upload` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pms_id` int(11) NOT NULL COMMENT 'ReservationId',
  `stay_length` int(11) DEFAULT NULL COMMENT 'number of nights the guest is staying\n\nStayDateRange.numberOfTimeUnits',
  `first_name` varchar(50) DEFAULT NULL COMMENT 'ResProfiles.profile.IndividualName.nameFirst',
  `last_name` varchar(50) DEFAULT NULL COMMENT 'ResProfiles.profile.IndividualName.nameSur',
  `company_name` varchar(50) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL COMMENT 'primary address of guest\n\nResProfiles.profile.PostalAddresses.PostalAddress[mfPrimaryYN=Y]',
  `loyalty_number` varchar(20) DEFAULT NULL COMMENT 'Reservation.SelectedMembership.accountID/Profile.Membership.accountID',
  `phone` varchar(20) DEFAULT NULL COMMENT 'primary phone of guest\n\nResProfiles.profile.PhoneNumbers.phonenumber(mfPrimaryYN=Y)',
  `number_of_guest` int(11) DEFAULT NULL COMMENT 'reservation.GuestCounts.mfCount',
  `confirmation_number` varchar(20) DEFAULT NULL COMMENT 'Reservation.confirmationID',
  `check_in_date` datetime DEFAULT NULL COMMENT 'StayDateRange.startTime',
  `check_out_date` datetime DEFAULT NULL COMMENT 'StayDateRange.startTime + StayDateRange.numberOfTimeUnits',
  `notes` varchar(255) DEFAULT NULL COMMENT 'SpecialRequests.SpecialRequest.requestComments(semi-colon seperated)',
  `loyalty_program` varchar(50) DEFAULT NULL COMMENT 'Reservation.SelectedMembership.programCode/Profile.Membership.programCode',
  `property_id` varchar(10) DEFAULT NULL COMMENT 'Reservation.xsd(OXI)  hotelReference.hotelCode',
  `credit_card_no` varchar(16) DEFAULT NULL COMMENT 'Reservation.ResCreditCard.creditCardNumber/creditCardFourDigits[mfPrimaryYN=Y]',
  `reservation_source` varchar(45) DEFAULT NULL COMMENT 'reservation.roomStays.mfsourceCode',
  `property_image` blob,
  `affiliate_id` varchar(50) DEFAULT NULL,
  `date_created` timestamp NULL DEFAULT NULL,
  `date_modified` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `messages` varchar(100) DEFAULT NULL,
  `email_id` varchar(100) DEFAULT NULL COMMENT 'ResProfiles.profile.electronicAddresses.electronicAddresses.eAddress[mfPrimaryYN=Y & electronicAddressType=EMAIL]',
  `status` varchar(20) DEFAULT NULL,
  `reservation_action` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservation_upload`
--

LOCK TABLES `reservation_upload` WRITE;
/*!40000 ALTER TABLE `reservation_upload` DISABLE KEYS */;
/*!40000 ALTER TABLE `reservation_upload` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `room_details`
--

DROP TABLE IF EXISTS `room_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `room_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `room_number` int(11) DEFAULT NULL,
  `room_type` varchar(10) DEFAULT NULL,
  `front_office_status` varchar(45) DEFAULT NULL,
  `house_keeping_status` varchar(45) DEFAULT NULL,
  `room_status` varchar(45) DEFAULT NULL,
  `date_created` timestamp NULL DEFAULT NULL,
  `date_modified` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room_details`
--

LOCK TABLES `room_details` WRITE;
/*!40000 ALTER TABLE `room_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `room_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `room_details_upload`
--

DROP TABLE IF EXISTS `room_details_upload`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `room_details_upload` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `room_number` varchar(10) DEFAULT NULL,
  `room_type` varchar(10) DEFAULT NULL,
  `front_office_status` varchar(45) DEFAULT NULL,
  `house_keeping_status` varchar(45) DEFAULT NULL,
  `room_status` varchar(45) DEFAULT NULL,
  `date_created` timestamp NULL DEFAULT NULL,
  `date_modified` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room_details_upload`
--

LOCK TABLES `room_details_upload` WRITE;
/*!40000 ALTER TABLE `room_details_upload` DISABLE KEYS */;
/*!40000 ALTER TABLE `room_details_upload` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `room_inventory`
--

DROP TABLE IF EXISTS `room_inventory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `room_inventory` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type_code` varchar(10) NOT NULL,
  `total_rooms` int(11) NOT NULL,
  `total_rooms_available` int(11) NOT NULL,
  `date_created` timestamp NULL DEFAULT NULL,
  `date_modified` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room_inventory`
--

LOCK TABLES `room_inventory` WRITE;
/*!40000 ALTER TABLE `room_inventory` DISABLE KEYS */;
/*!40000 ALTER TABLE `room_inventory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `room_inventory_upload`
--

DROP TABLE IF EXISTS `room_inventory_upload`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `room_inventory_upload` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type_code` varchar(10) DEFAULT NULL,
  `total_rooms` int(11) DEFAULT NULL,
  `total_rooms_available` int(11) DEFAULT NULL,
  `date_created` timestamp NULL DEFAULT NULL,
  `date_modified` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room_inventory_upload`
--

LOCK TABLES `room_inventory_upload` WRITE;
/*!40000 ALTER TABLE `room_inventory_upload` DISABLE KEYS */;
/*!40000 ALTER TABLE `room_inventory_upload` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `room_type`
--

DROP TABLE IF EXISTS `room_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `room_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `room_type_code` varchar(10) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  `room_features` varchar(255) DEFAULT NULL,
  `date_created` timestamp NULL DEFAULT NULL,
  `date_modified` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room_type`
--

LOCK TABLES `room_type` WRITE;
/*!40000 ALTER TABLE `room_type` DISABLE KEYS */;
/*!40000 ALTER TABLE `room_type` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-05-22 17:00:49
