CREATE DATABASE  IF NOT EXISTS `objetos` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `objetos`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: localhost    Database: objetos
-- ------------------------------------------------------
-- Server version	5.5.39

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
-- Table structure for table `butaca`
--

DROP TABLE IF EXISTS `butaca`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `butaca` (
  `idButaca` int(11) NOT NULL AUTO_INCREMENT,
  `butaca` varchar(10) DEFAULT NULL,
  `idVagon` int(11) NOT NULL,
  PRIMARY KEY (`idButaca`),
  KEY `fk_butaca_vagon1` (`idVagon`),
  CONSTRAINT `fk_butaca_vagon1` FOREIGN KEY (`idVagon`) REFERENCES `vagon` (`idVagon`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=194 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `butaca`
--

LOCK TABLES `butaca` WRITE;
/*!40000 ALTER TABLE `butaca` DISABLE KEYS */;
INSERT INTO `butaca` VALUES (170,'1A',19),(171,'1B',19),(172,'1C',19),(173,'1D',19),(174,'2A',19),(175,'2B',19),(176,'2C',19),(177,'2D',19),(178,'1A',20),(179,'1B',20),(180,'1C',20),(181,'1D',20),(182,'2A',20),(183,'2B',20),(184,'2C',20),(185,'2D',20),(186,'1A',21),(187,'1B',21),(188,'1C',21),(189,'1D',21),(190,'2A',21),(191,'2B',21),(192,'2C',21),(193,'2D',21);
/*!40000 ALTER TABLE `butaca` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clase`
--

DROP TABLE IF EXISTS `clase`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clase` (
  `idClase` int(11) NOT NULL AUTO_INCREMENT,
  `clase` varchar(45) DEFAULT NULL,
  `precio` int(11) DEFAULT NULL,
  `filas` int(11) DEFAULT NULL,
  PRIMARY KEY (`idClase`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clase`
--

LOCK TABLES `clase` WRITE;
/*!40000 ALTER TABLE `clase` DISABLE KEYS */;
INSERT INTO `clase` VALUES (1,'Pullman',250,2),(2,'Primera',200,3),(3,'Turista',150,4);
/*!40000 ALTER TABLE `clase` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contacto`
--

DROP TABLE IF EXISTS `contacto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contacto` (
  `idUsuario` int(11) NOT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idUsuario`),
  CONSTRAINT `fk_Contacto_Usuario1` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contacto`
--

LOCK TABLES `contacto` WRITE;
/*!40000 ALTER TABLE `contacto` DISABLE KEYS */;
INSERT INTO `contacto` VALUES (62,'admin','admin','admin');
/*!40000 ALTER TABLE `contacto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ferrocarril`
--

DROP TABLE IF EXISTS `ferrocarril`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ferrocarril` (
  `idFerrocarril` int(11) NOT NULL AUTO_INCREMENT,
  `ferrocarril` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idFerrocarril`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ferrocarril`
--

LOCK TABLES `ferrocarril` WRITE;
/*!40000 ALTER TABLE `ferrocarril` DISABLE KEYS */;
INSERT INTO `ferrocarril` VALUES (1,'Roca'),(2,'Sarmiento'),(3,'Mitre');
/*!40000 ALTER TABLE `ferrocarril` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login` (
  `idUsuario` int(11) NOT NULL,
  `login` int(11) DEFAULT NULL,
  `clave` int(11) DEFAULT NULL,
  `privilegio` int(11) DEFAULT NULL,
  `ultimoLogin` datetime DEFAULT NULL,
  `ultimoCambioClave` date DEFAULT NULL,
  PRIMARY KEY (`idUsuario`),
  CONSTRAINT `fk_Login_Usuario1` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES (62,123,123,2,NULL,NULL);
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pasaje`
--

DROP TABLE IF EXISTS `pasaje`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pasaje` (
  `idPasaje` int(11) NOT NULL AUTO_INCREMENT,
  `ocupado` bit(1) DEFAULT b'0',
  `idUsuario` int(11) DEFAULT NULL,
  `idButaca` int(11) NOT NULL,
  `idViaje` int(11) NOT NULL,
  PRIMARY KEY (`idPasaje`),
  KEY `fk_pasaje_butaca1` (`idButaca`),
  KEY `fk_pasaje_cliente1` (`idUsuario`),
  KEY `fk_pasaje_viaje1` (`idViaje`),
  CONSTRAINT `fk_pasaje_butaca1` FOREIGN KEY (`idButaca`) REFERENCES `butaca` (`idButaca`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_pasaje_cliente1` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_pasaje_viaje1` FOREIGN KEY (`idViaje`) REFERENCES `viaje` (`idViaje`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=321 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pasaje`
--

LOCK TABLES `pasaje` WRITE;
/*!40000 ALTER TABLE `pasaje` DISABLE KEYS */;
/*!40000 ALTER TABLE `pasaje` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `idUsuario` int(11) NOT NULL AUTO_INCREMENT,
  `dni` int(11) DEFAULT NULL,
  `nombre` varchar(30) DEFAULT NULL,
  `apellido` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`idUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (62,123,'admin','admin');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vagon`
--

DROP TABLE IF EXISTS `vagon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vagon` (
  `idVagon` int(11) NOT NULL AUTO_INCREMENT,
  `numeroVagon` int(11) DEFAULT NULL,
  `estadoVagon` int(11) DEFAULT NULL,
  `idClase` int(11) NOT NULL,
  `idFerrocarril` int(11) NOT NULL,
  PRIMARY KEY (`idVagon`),
  KEY `fk_vagon_clase` (`idClase`),
  KEY `fk_vagon_ferrocarril1` (`idFerrocarril`),
  CONSTRAINT `fk_vagon_clase` FOREIGN KEY (`idClase`) REFERENCES `clase` (`idClase`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_vagon_ferrocarril1` FOREIGN KEY (`idFerrocarril`) REFERENCES `ferrocarril` (`idFerrocarril`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vagon`
--

LOCK TABLES `vagon` WRITE;
/*!40000 ALTER TABLE `vagon` DISABLE KEYS */;
INSERT INTO `vagon` VALUES (19,1,3,1,1),(20,1,3,1,1),(21,1,1,1,1);
/*!40000 ALTER TABLE `vagon` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vagonxviaje`
--

DROP TABLE IF EXISTS `vagonxviaje`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vagonxviaje` (
  `idVagon` int(11) NOT NULL,
  `idViaje` int(11) NOT NULL,
  PRIMARY KEY (`idVagon`,`idViaje`),
  KEY `fk_vagon_has_viaje_vagon1_idx` (`idVagon`),
  KEY `fk_vagon_has_viaje_viaje1` (`idViaje`),
  CONSTRAINT `fk_vagon_has_viaje_vagon1` FOREIGN KEY (`idVagon`) REFERENCES `vagon` (`idVagon`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_vagon_has_viaje_viaje1` FOREIGN KEY (`idViaje`) REFERENCES `viaje` (`idViaje`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vagonxviaje`
--

LOCK TABLES `vagonxviaje` WRITE;
/*!40000 ALTER TABLE `vagonxviaje` DISABLE KEYS */;
/*!40000 ALTER TABLE `vagonxviaje` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `viaje`
--

DROP TABLE IF EXISTS `viaje`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `viaje` (
  `idViaje` int(11) NOT NULL AUTO_INCREMENT,
  `fechaHora` datetime DEFAULT NULL,
  `cantidadPasajesLibres` int(11) DEFAULT NULL,
  `cantidadVagones` int(11) DEFAULT NULL,
  `TerminalSalida` varchar(30) DEFAULT NULL,
  `TerminalLlegada` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`idViaje`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `viaje`
--

LOCK TABLES `viaje` WRITE;
/*!40000 ALTER TABLE `viaje` DISABLE KEYS */;
/*!40000 ALTER TABLE `viaje` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-06-04 23:28:57
