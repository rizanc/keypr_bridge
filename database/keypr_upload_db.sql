CREATE DATABASE  IF NOT EXISTS `keypr_upload_db` 
USE `keypr_upload_db`;
-- MySQL dump 10.13  Distrib 5.5.16, for Win32 (x86)
--
-- Host: localhost    Database: keypr_upload_db
-- ------------------------------------------------------
-- Server version	5.5.27-log


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
  `date_created` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `date_modified` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=UTF8;


