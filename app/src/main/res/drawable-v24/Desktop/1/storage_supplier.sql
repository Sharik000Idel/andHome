-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: storage
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `supplier`
--

DROP TABLE IF EXISTS `supplier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `supplier` (
  `ID` int NOT NULL,
  `Name` varchar(50) DEFAULT NULL,
  `Type` varchar(50) DEFAULT NULL,
  `INN` bigint DEFAULT NULL,
  `Raiting` smallint DEFAULT NULL,
  `Date` date DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supplier`
--

LOCK TABLES `supplier` WRITE;
/*!40000 ALTER TABLE `supplier` DISABLE KEYS */;
INSERT INTO `supplier` VALUES (0,'Cиб','ОАО',1949139718,95,'2028-11-20'),(1,'CибCибОрио','ООО',1988313615,95,'2013-01-20'),(2,'Асбоцем','МФО',1944834477,20,'2010-04-20'),(3,'Асбоцемент','МФО',1650212184,80,'2009-12-20'),(4,'ВодРыб','ЗАО',1113468466,21,'2025-11-20'),(5,'ВостокМети','ООО',1488487851,58,'2013-03-20'),(6,'ГаражГазМ','ОАО',1740623312,86,'2020-11-20'),(7,'ГаражГлав','МКК',1404774111,89,'2028-06-20'),(8,'ГаражТелекомГор','МКК',1718185951,36,'2020-12-20'),(9,'ГаражХозФлот','ОАО',2164720385,7,'2028-08-20'),(10,'ГлавАвтоГазТрест','МФО',2059691335,18,'2004-08-20'),(11,'ГлавРыб','МФО',1426268088,46,'2009-11-20'),(12,'ГорМонтаж','ООО',1564667734,79,'2023-12-20'),(13,'ГорМонтаж','ООО',1564667735,79,'2023-12-20'),(14,'ЖелДорГаз','МФО',1255275062,76,'2004-09-20'),(15,'ИнфоГазМотор','ОАО',1954050214,42,'2023-07-20'),(16,'Казань','ОАО',1965011544,51,'2016-03-20'),(17,'Компания Во','ПАО',2027005945,11,'2022-06-20'),(18,'Компания К','ПАО',1468114280,70,'2007-12-20'),(19,'Компания КазаньАвтоCиб','МКК',1371692583,23,'2019-10-20'),(20,'Компания МорМетал','ООО',1947163072,33,'2018-11-20'),(21,'Компания Мотор','ООО',1429908355,50,'2027-12-20'),(22,'Компания НефтьITИнф','ООО',1685247455,85,'2009-03-20'),(23,'Компания Омск','ОАО',1878504395,2,'2013-09-20'),(24,'Компания СервисМикроО','ООО',1178826599,5,'2007-07-20'),(25,'Микро','МКК',2293562756,64,'2027-05-20'),(26,'Микро','МКК',2293562757,64,'2027-05-20'),(27,'МобайлДизайнОмск','ООО',1014490629,73,'2028-10-20'),(28,'Монтаж','ОАО',1163880101,10,'2023-05-20'),(29,'Мор','МКК',1906157177,82,'2006-03-20'),(30,'МорФинансФинансМаш','ООО',1549496316,68,'2018-06-20'),(31,'Мотор','ПАО',1019917089,19,'2024-04-20'),(32,'МоторКаз','ОАО',1076279398,37,'2023-08-20'),(33,'МясКрепТеле','ПАО',2152486844,59,'2011-11-20'),(34,'РыбВектор','ОАО',2275526397,92,'2020-06-20'),(35,'СеверТехВостокЛизинг','ООО',1846812080,30,'2026-02-20'),(36,'Сервис','ОАО',2031832854,25,'2025-11-20'),(37,'Софт','МКК',1036521658,67,'2023-11-20'),(38,'ТверьБухГаз','ОАО',2167673760,9,'2013-11-20'),(39,'Теле','ПАО',2170198203,11,'2001-05-20'),(40,'ТелекомТранс','ОАО',2200735978,8,'2011-01-20'),(41,'ТелеРыбХм','ООО',2299034130,3,'2010-02-20'),(42,'ТомскНефть','ООО',1002996016,95,'2007-05-20'),(43,'ТомскТяжРеч','МФО',1102143492,36,'2022-12-20'),(44,'ТяжКазаньБашкир','ПАО',1794419510,85,'2022-12-20'),(45,'ТяжЛифтВостокС','ОАО',1032089879,66,'2013-08-20'),(46,'УралСервисМон','МКК',1892306757,26,'2020-12-20'),(47,'УралХме','ООО',2291253256,82,'2022-05-20'),(48,'ЦементОбл','ООО',2021607106,42,'2003-10-20'),(49,'Электро','ЗАО',1755853973,14,'2016-06-20'),(50,'ЭлектроЦвет','ОАО',1654184411,3,'2025-06-20'),(51,'ЮпитерТомс','ПАО',1551173338,60,'2028-07-20');
/*!40000 ALTER TABLE `supplier` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-29 12:39:52
