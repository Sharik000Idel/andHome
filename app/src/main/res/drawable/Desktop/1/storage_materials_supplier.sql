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
-- Table structure for table `materials_supplier`
--

DROP TABLE IF EXISTS `materials_supplier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `materials_supplier` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(100) DEFAULT NULL,
  `ID_Supplier` int DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `ID_idx` (`ID_Supplier`)
) ENGINE=InnoDB AUTO_INCREMENT=96 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `materials_supplier`
--

LOCK TABLES `materials_supplier` WRITE;
/*!40000 ALTER TABLE `materials_supplier` DISABLE KEYS */;
INSERT INTO `materials_supplier` VALUES (1,'Нить серый 1x2',1755853973),(3,'Краска цветной 2x1',1076279398),(4,'Краска белый 2x2',1036521658),(5,'Нить серый 1x3',1163880101),(6,'Гранулы цветной 3x2',1426268088),(8,'Краска цветной 2x1',1371692583),(9,'Краска белый 2x2',22735978),(10,'Краска цветной 2x1',1988313615),(11,'Нить серый 1x0',1892306757),(12,'Нить серый 1x0',1102143492),(14,'Нить серый 1x3',1488487851),(16,'Краска зеленый 3x0',1468114280),(17,'Нить цветной 2x0',1954050214),(18,'Краска зеленый 3x0',1404774111),(19,'Нить цветной 2x0',12996016),(21,'Гранулы белый 0x2',1113468466),(23,'Краска зеленый 1x1',1718185951),(24,'Гранулы белый 0x2',1429908355),(25,'Краска зеленый 2x3',2031832854),(26,'Нить цветной 2x0',1551173338),(27,'Гранулы белый 0x2',2059691335),(28,'Гранулы белый 0x2',1650212184),(29,'Краска зеленый 3x0',1549496316),(31,'Гранулы цветной 0x1',20275945),(32,'Нить цветной 2x1',1032089879),(34,'Гранулы серый 2x0',1949139718),(48,'Гранулы зеленый 1x1',1947163072),(49,'Гранулы зеленый 0x2',1178826599),(52,'Гранулы серый 0x0',1564667734),(55,'Нить зеленый 2x0',1014490629),(65,'Краска синий 1x3',1794419510),(66,'Гранулы серый 2x3',1906157177),(74,'Краска цветной 0x2',1944834477),(76,'Краска серый 3x0',1846812080),(78,'Гранулы серый 2x1',1685247455),(95,'Краска цветной 1x2',1654184411);
/*!40000 ALTER TABLE `materials_supplier` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-29 12:39:53
