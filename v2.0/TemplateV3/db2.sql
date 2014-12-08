-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema fys
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema fys
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `fys` DEFAULT CHARACTER SET latin1 ;
USE `fys` ;

-- -----------------------------------------------------
-- Table `fys`.`client`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `fys`.`client` (
  `clientID` INT(3) NOT NULL AUTO_INCREMENT,
  `name` CHAR(20) NOT NULL,
  `lastname` CHAR(20) NOT NULL,
  `phonenumber` CHAR(30) NOT NULL,
  `email` CHAR(50) NOT NULL,
  `country` CHAR(20) NOT NULL,
  `address` CHAR(50) NOT NULL,
  `city` CHAR(50) NOT NULL,
  `zipcode` CHAR(20) NOT NULL,
  `shippingcountry` CHAR(50) NULL DEFAULT NULL,
  `shippingaddress` CHAR(50) NULL DEFAULT NULL,
  `shippingcity` CHAR(50) NULL DEFAULT NULL,
  `shippingzipcode` CHAR(50) NULL DEFAULT NULL,
  `baggageID` INT(11) NULL DEFAULT NULL,
  `flightnumber` INT(30) NOT NULL,
  PRIMARY KEY (`clientID`),
  INDEX `flightnumber_idx` (`flightnumber` ASC))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `fys`.`baggage`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `fys`.`baggage` (
  `baggageID` INT(3) NOT NULL AUTO_INCREMENT,
  `flightnumber` INT(30) NULL DEFAULT NULL,
  `brand` CHAR(20) NULL DEFAULT NULL,
  `color` CHAR(30) NULL DEFAULT NULL,
  `weight` CHAR(50) NULL DEFAULT NULL,
  `description` VARCHAR(200) NULL DEFAULT NULL,
  `state` CHAR(20) NULL DEFAULT NULL,
  `clientID` INT(11) NULL DEFAULT NULL,
  `dateadded` CHAR(45) NOT NULL,
  `dateretrieved` CHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`baggageID`),
  INDEX `clientID_idx` (`clientID` ASC),
  INDEX `flightnumber_idx` (`flightnumber` ASC),
  CONSTRAINT `clientID`
    FOREIGN KEY (`clientID`)
    REFERENCES `fys`.`client` (`clientID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `flightnumber`
    FOREIGN KEY (`flightnumber`)
    REFERENCES `fys`.`client` (`flightnumber`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `fys`.`employee`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `fys`.`employee` (
  `employeeID` INT(3) NOT NULL AUTO_INCREMENT,
  `name` CHAR(20) NOT NULL,
  `lastname` CHAR(20) NOT NULL,
  `username` CHAR(20) NOT NULL,
  `password` CHAR(20) NOT NULL,
  `email` CHAR(50) NOT NULL,
  `phonenumber` CHAR(30) NOT NULL,
  `function` CHAR(50) NOT NULL,
  PRIMARY KEY (`employeeID`))
ENGINE = MyISAM
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `fys`.`log`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `fys`.`log` (
  `logID` INT(6) NOT NULL AUTO_INCREMENT,
  `employeeID` INT(3) NOT NULL,
  `timestamp` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `action` CHAR(255) NOT NULL,
  `tab` CHAR(255) NOT NULL,
  PRIMARY KEY (`logID`))
ENGINE = MyISAM
AUTO_INCREMENT = 8
DEFAULT CHARACTER SET = latin1;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
