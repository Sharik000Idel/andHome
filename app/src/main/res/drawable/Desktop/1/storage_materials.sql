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
-- Table structure for table `materials`
--

DROP TABLE IF EXISTS `materials`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `materials` (
  `ID` int NOT NULL,
  `Name` varchar(100) DEFAULT NULL,
  `Type` varchar(45) DEFAULT NULL,
  `Image` varchar(200) DEFAULT NULL,
  `Price` int DEFAULT NULL,
  `Count` int DEFAULT NULL,
  `MinCount` int DEFAULT NULL,
  `CountInBox` int DEFAULT NULL,
  `Ed` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `materials`
--

LOCK TABLES `materials` WRITE;
/*!40000 ALTER TABLE `materials` DISABLE KEYS */;
INSERT INTO `materials` VALUES (1,'Гранулы белый 0x2','Гранулы','',9330,490,40,2,'л'),(2,'Гранулы белый 0x3','Гранулы','',7183,538,11,3,'кг'),(3,'Гранулы белый 0x3','Гранулы','',7183,517,11,3,'кг'),(4,'Гранулы белый 1x0','Гранулы','',27718,980,41,3,'кг'),(5,'Гранулы белый 1x0','Гранулы','',27718,957,41,3,'кг'),(6,'Гранулы белый 1x1','Гранулы','',6557,93,11,4,'л'),(7,'Гранулы белый 1x1','Гранулы','',6557,20,11,4,'л'),(8,'Гранулы белый 1x2','Гранулы','',8129,77,46,4,'л'),(9,'Гранулы белый 1x2','Гранулы','',8129,35,46,4,'л'),(10,'Гранулы белый 2x2','Гранулы','',47680,76,8,7,'л'),(11,'Гранулы белый 2x2','Гранулы','',47680,74,8,7,'л'),(12,'Гранулы белый 2x3','Гранулы','',32446,274,8,4,'л'),(13,'Гранулы белый 2x3','Гранулы','',32446,176,8,4,'л'),(14,'Гранулы белый 3x0','Гранулы','',50217,208,7,6,'л'),(15,'Гранулы белый 3x0','Гранулы','',50217,115,7,6,'л'),(16,'Гранулы белый 3x1','Гранулы','',43711,995,27,8,'л'),(17,'Гранулы белый 3x1','Гранулы','',43711,932,27,8,'л'),(18,'Гранулы зеленый 0x2','Гранулы','',38217,206,34,4,'л'),(19,'Гранулы зеленый 0x2','Гранулы','',38217,141,34,4,'л'),(20,'Гранулы зеленый 1x1','Гранулы','\\materials\\image_4.jpeg',46455,10,19,4,'л'),(21,'Гранулы зеленый 1x1','Гранулы','\\materials\\image_4.jpeg',46455,5,19,4,'л'),(22,'Гранулы зеленый 1x2','Гранулы','',45083,575,15,9,'л'),(23,'Гранулы зеленый 1x2','Гранулы','',45083,515,15,9,'л'),(24,'Гранулы серый 0x0','Гранулы','',16715,608,12,5,'л'),(25,'Гранулы серый 0x0','Гранулы','',16715,540,12,5,'л'),(26,'Гранулы серый 2x0','Гранулы','\\materials\\image_8.jpeg',8939,312,21,3,'кг'),(27,'Гранулы серый 2x0','Гранулы','\\materials\\image_8.jpeg',8939,225,21,3,'кг'),(28,'Гранулы серый 2x1','Гранулы','',50339,779,44,7,'кг'),(29,'Гранулы серый 2x1','Гранулы','',50339,724,44,7,'кг'),(30,'Гранулы серый 2x2','Гранулы','',15478,648,17,7,'л'),(31,'Гранулы серый 2x2','Гранулы','',15478,639,17,7,'л'),(32,'Гранулы серый 2x3','Гранулы','',47757,467,28,6,'л'),(33,'Гранулы серый 2x3','Гранулы','',47757,383,28,6,'л'),(34,'Гранулы серый 3x0','Гранулы','\\materials\\image_7.jpeg',702,0,5,4,'л'),(35,'Гранулы серый 3x0','Гранулы','\\materials\\image_7.jpeg',702,2,5,4,'л'),(36,'Гранулы серый 3x1','Гранулы','',10899,762,6,10,'кг'),(37,'Гранулы серый 3x1','Гранулы','',10899,676,6,10,'кг'),(38,'Гранулы серый 3x2','Гранулы','',29943,96,9,5,'л'),(39,'Гранулы серый 3x2','Гранулы','',29943,77,9,5,'л'),(40,'Гранулы серый 3x3','Гранулы','',15170,2,38,5,'л'),(41,'Гранулы серый 3x3','Гранулы','',15170,0,38,5,'л'),(42,'Гранулы синий 0x2','Гранулы','',41646,576,36,9,'л'),(43,'Гранулы синий 0x2','Гранулы','',41646,548,36,9,'л'),(44,'Гранулы синий 0x3','Гранулы','',45134,953,48,5,'кг'),(45,'Гранулы синий 0x3','Гранулы','',45134,884,48,5,'кг'),(46,'Гранулы синий 1x2','Гранулы','',9242,680,6,3,'кг'),(47,'Гранулы синий 1x2','Гранулы','',9242,668,6,3,'кг'),(48,'Гранулы синий 1x3','Гранулы','',5668,41,30,8,'л'),(49,'Гранулы синий 1x3','Гранулы','',5668,4,30,8,'л'),(50,'Гранулы синий 2x1','Гранулы','\\materials\\image_2.jpeg',231,273,17,9,'л'),(51,'Гранулы синий 2x1','Гранулы','\\materials\\image_2.jpeg',231,246,17,9,'л'),(52,'Гранулы синий 2x3','Гранулы','',53482,749,45,2,'л'),(53,'Гранулы синий 2x3','Гранулы','',53482,699,45,2,'л'),(54,'Гранулы синий 3x0','Гранулы','',16665,411,8,1,'кг'),(55,'Гранулы синий 3x0','Гранулы','',16665,375,8,1,'кг'),(56,'Гранулы цветной 0x1','Гранулы','',24488,746,50,3,'л'),(57,'Гранулы цветной 0x1','Гранулы','',24488,684,50,3,'л'),(58,'Гранулы цветной 0x3','Гранулы','',1209,723,44,7,'кг'),(59,'Гранулы цветной 0x3','Гранулы','',1209,627,44,7,'кг'),(60,'Гранулы цветной 3x2','Гранулы','',28596,32,45,1,'л'),(61,'Гранулы цветной 3x2','Гранулы','',28596,30,45,1,'л'),(62,'Краска белый 0x1','Краски','',19777,423,47,7,'л'),(63,'Краска белый 0x1','Краски','',19777,328,47,7,'л'),(64,'Краска белый 1x0','Краски','',3543,95,6,6,'л'),(65,'Краска белый 1x0','Краски','',3543,10,6,6,'л'),(66,'Краска белый 2x1','Краски','',3353,790,8,2,'л'),(67,'Краска белый 2x1','Краски','',3353,773,8,2,'л'),(68,'Краска белый 2x2','Краски','\\materials\\image_3.jpeg',29906,659,35,1,'л'),(69,'Краска белый 2x2','Краски','\\materials\\image_3.jpeg',29906,645,35,1,'л'),(70,'Краска белый 3x0','Краски','',51471,609,48,5,'кг'),(71,'Краска белый 3x0','Краски','',51471,566,48,5,'кг'),(72,'Краска зеленый 0x1','Краски','',30581,869,7,2,'л'),(73,'Краска зеленый 0x1','Краски','',30581,813,7,2,'л'),(74,'Краска зеленый 0x2','Краски','',39809,139,23,9,'л'),(75,'Краска зеленый 0x2','Краски','',39809,60,23,9,'л'),(76,'Краска зеленый 0x3','Краски','',24073,50,48,2,'л'),(77,'Краска зеленый 0x3','Краски','',24073,35,48,2,'л'),(78,'Краска зеленый 1x0','Краски','',52189,626,17,8,'кг'),(79,'Краска зеленый 1x0','Краски','',52189,559,17,8,'кг'),(80,'Краска зеленый 1x1','Краски','\\materials\\image_6.jpeg',40583,103,34,2,'кг'),(81,'Краска зеленый 1x1','Краски','\\materials\\image_6.jpeg',40583,22,34,2,'кг'),(82,'Краска зеленый 2x2','Краски','',19014,752,36,2,'кг'),(83,'Краска зеленый 2x2','Краски','',19014,722,36,2,'кг'),(84,'Краска зеленый 2x3','Краски','',44978,485,8,2,'л'),(85,'Краска зеленый 2x3','Краски','',44978,432,8,2,'л'),(86,'Краска зеленый 3x0','Краски','\\materials\\image_1.jpeg',20226,261,7,2,'л'),(87,'Краска зеленый 3x0','Краски','\\materials\\image_1.jpeg',20226,186,7,2,'л'),(88,'Краска зеленый 3x1','Краски','',32487,657,19,10,'л'),(89,'Краска зеленый 3x1','Краски','',32487,558,19,10,'л'),(90,'Краска зеленый 3x3','Краски','',27710,601,32,6,'л'),(91,'Краска зеленый 3x3','Краски','',27710,553,32,6,'л'),(92,'Краска серый 0x1','Краски','',35063,768,27,2,'л'),(93,'Краска серый 0x1','Краски','',35063,707,27,2,'л'),(94,'Краска серый 0x2','Краски','',33227,679,36,3,'кг'),(95,'Краска серый 0x2','Краски','',33227,655,36,3,'кг'),(96,'Краска серый 2x0','Краски','',35256,131,22,2,'л'),(97,'Краска серый 2x0','Краски','',35256,99,22,2,'л'),(98,'Краска серый 2x1','Краски','',46579,706,45,5,'л'),(99,'Краска серый 2x1','Краски','',46579,648,45,5,'л'),(100,'Краска серый 3x0','Краски','',19352,341,38,7,'кг'),(101,'Краска серый 3x0','Краски','',19352,315,38,7,'кг'),(102,'Краска серый 3x2','Краски','',55064,806,50,3,'л'),(103,'Краска серый 3x2','Краски','',55064,786,50,3,'л'),(104,'Краска синий 0x0','Краски','',18656,796,29,8,'кг'),(105,'Краска синий 0x0','Краски','',18656,739,29,8,'кг'),(106,'Краска синий 1x2','Краски','',44490,640,50,2,'л'),(107,'Краска синий 1x2','Краски','',44490,630,50,2,'л'),(108,'Краска синий 1x3','Краски','',38230,265,17,6,'кг'),(109,'Краска синий 1x3','Краски','',38230,191,17,6,'кг'),(110,'Краска синий 2x0','Краски','',40074,135,50,7,'л'),(111,'Краска синий 2x0','Краски','',40074,86,50,7,'л'),(112,'Краска синий 2x1','Краски','',46848,642,29,9,'л'),(113,'Краска синий 2x1','Краски','',46848,596,29,9,'л'),(114,'Краска синий 2x2','Краски','',403,334,48,6,'л'),(115,'Краска синий 2x2','Краски','',403,327,48,6,'л'),(116,'Краска синий 3x0','Краски','',38644,523,42,7,'л'),(117,'Краска синий 3x0','Краски','',38644,483,42,7,'л'),(118,'Краска синий 3x3','Краски','',46545,740,24,6,'кг'),(119,'Краска синий 3x3','Краски','',46545,660,24,6,'кг'),(120,'Краска цветной 0x1','Краски','',54401,43,8,6,'л'),(121,'Краска цветной 0x1','Краски','',54401,38,8,6,'л'),(122,'Краска цветной 0x2','Краски','',2600,595,38,7,'л'),(123,'Краска цветной 0x2','Краски','',2600,518,38,7,'л'),(124,'Краска цветной 0x3','Краски','',3322,324,9,10,'л'),(125,'Краска цветной 0x3','Краски','',3322,290,9,10,'л'),(126,'Краска цветной 1x1','Краски','',43466,784,22,3,'л'),(127,'Краска цветной 1x1','Краски','',43466,762,22,3,'л'),(128,'Краска цветной 1x2','Краски','',47701,299,50,10,'л'),(129,'Краска цветной 1x2','Краски','',47701,233,50,10,'л'),(130,'Краска цветной 1x3','Краски','',268,730,5,9,'кг'),(131,'Краска цветной 1x3','Краски','',268,699,5,9,'кг'),(132,'Краска цветной 2x1','Краски','',1846,325,45,1,'л'),(133,'Краска цветной 2x1','Краски','',1846,255,45,1,'л'),(134,'Краска цветной 2x3','Краски','',46502,443,46,9,'л'),(135,'Краска цветной 2x3','Краски','',46502,361,46,9,'л'),(136,'Нить белый 0x1','Нитки','',36883,101,43,10,'м'),(137,'Нить белый 0x1','Нитки','',36883,42,43,10,'м'),(138,'Нить белый 0x2','Нитки','',29271,43,19,4,'г'),(139,'Нить белый 0x2','Нитки','',29271,39,19,4,'г'),(140,'Нить белый 1x3','Нитки','',2191,406,27,8,'м'),(141,'Нить белый 1x3','Нитки','',2191,402,27,8,'м'),(142,'Нить белый 2x0','Краски','',46684,623,23,2,'м'),(143,'Нить белый 2x0','Краски','',46684,522,23,2,'м'),(144,'Нить белый 2x3','Нитки','',10823,283,41,3,'г'),(145,'Нить белый 2x3','Нитки','',10823,248,41,3,'г'),(146,'Нить зеленый 0x0','Краски','',41827,288,43,8,'м'),(147,'Нить зеленый 0x0','Краски','',41827,247,43,8,'м'),(148,'Нить зеленый 0x2','Нитки','',17429,578,20,2,'м'),(149,'Нить зеленый 0x2','Нитки','',17429,514,20,2,'м'),(150,'Нить зеленый 1x0','Нитки','',8105,304,43,9,'г'),(151,'Нить зеленый 1x0','Нитки','',8105,228,43,9,'г'),(152,'Нить зеленый 2x0','Краски','\\materials\\image_10.jpeg',28301,535,45,5,'м'),(153,'Нить зеленый 2x0','Краски','\\materials\\image_10.jpeg',28301,524,45,5,'м'),(154,'Нить зеленый 2x1','Нитки','',34556,802,16,6,'м'),(155,'Нить зеленый 2x1','Нитки','',34556,769,16,6,'м'),(156,'Нить зеленый 2x3','Нитки','',20057,649,25,7,'г'),(157,'Нить зеленый 2x3','Нитки','',20057,633,25,7,'г'),(158,'Нить серый 0x2','Краски','\\materials\\image_9.jpeg',45744,504,10,3,'м'),(159,'Нить серый 0x2','Краски','\\materials\\image_9.jpeg',45744,414,10,3,'м'),(160,'Нить серый 1x0','Краски','',27456,978,42,1,'м'),(161,'Нить серый 1x0','Краски','',27456,975,42,1,'м'),(162,'Нить серый 1x1','Нитки','',14474,372,22,5,'м'),(163,'Нить серый 1x1','Нитки','',14474,327,22,5,'м'),(164,'Нить серый 1x2','Нитки','',30198,292,30,1,'м'),(165,'Нить серый 1x2','Нитки','',30198,198,30,1,'м'),(166,'Нить серый 1x3','Краски','',32002,489,25,1,'г'),(167,'Нить серый 1x3','Краски','',32002,392,25,1,'г'),(168,'Нить серый 2x3','Нитки','',22452,431,40,1,'г'),(169,'Нить серый 2x3','Нитки','',22452,413,40,1,'г'),(170,'Нить серый 3x0','Нитки','',29503,409,19,1,'м'),(171,'Нить серый 3x0','Нитки','',29503,362,19,1,'м'),(172,'Нить синий 0x2','Нитки','',7490,654,10,9,'м'),(173,'Нить синий 0x2','Нитки','',7490,646,10,9,'м'),(174,'Нить синий 0x3','Краски','',32087,615,22,8,'м'),(175,'Нить синий 0x3','Краски','',32087,564,22,8,'м'),(176,'Нить синий 2x1','Краски','',12283,948,13,9,'г'),(177,'Нить синий 2x1','Краски','',12283,876,13,9,'г'),(178,'Нить синий 2x3','Краски','',43659,10,21,5,'м'),(179,'Нить синий 2x3','Краски','',43659,4,21,5,'м'),(180,'Нить синий 3x0','Нитки','',44407,67,23,10,'м'),(181,'Нить синий 3x0','Нитки','',44407,13,23,10,'м'),(182,'Нить синий 3x1','Краски','',4920,579,48,7,'м'),(183,'Нить синий 3x1','Краски','',4920,501,48,7,'м'),(184,'Нить синий 3x2','Нитки','',10878,529,13,1,'м'),(185,'Нить синий 3x2','Нитки','',10878,516,13,1,'м'),(186,'Нить синий 3x3','Нитки','',45774,140,12,7,'г'),(187,'Нить синий 3x3','Нитки','',45774,88,12,7,'г'),(188,'Нить цветной 1x0','Нитки','',24948,91,38,5,'г'),(189,'Нить цветной 1x0','Нитки','',24948,62,38,5,'г'),(190,'Нить цветной 1x1','Краски','\\materials\\image_5.jpeg',8619,424,10,3,'г'),(191,'Нить цветной 1x1','Краски','\\materials\\image_5.jpeg',8619,419,10,3,'г'),(192,'Нить цветной 2x0','Краски','',16856,395,26,2,'м'),(193,'Нить цветной 2x0','Краски','',16856,389,26,2,'м'),(194,'Нить цветной 2x1','Краски','',7615,150,22,3,'м'),(195,'Нить цветной 2x1','Краски','',7615,112,22,3,'м'),(196,'Нить цветной 3x0','Нитки','',53651,989,14,1,'м'),(197,'Нить цветной 3x0','Нитки','',53651,906,14,1,'м'),(198,'Нить цветной 3x2','Нитки','',2939,831,46,3,'м'),(199,'Нить цветной 3x2','Нитки','',2939,739,46,3,'м');
/*!40000 ALTER TABLE `materials` ENABLE KEYS */;
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
