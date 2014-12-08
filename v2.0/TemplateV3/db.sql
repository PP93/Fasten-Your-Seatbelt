 CREATE TABLE `employee` (
 `employeeID` INT(3) NOT NULL AUTO_INCREMENT primary key,
 `name` CHAR(20) NOT NULL ,
 `lastname` CHAR(20) NOT NULL,
 `username` CHAR(20) NOT NULL,
 `password` CHAR(20) NOT NULL,
 `email` CHAR(50) NOT NULL,
 `phonenumber` CHAR(30) NOT NULL,
 `function` CHAR(50) NOT NULL
 );
 
 CREATE TABLE `client` (
 `clientID` INT(3) NOT NULL AUTO_INCREMENT primary key,
 `name` CHAR(20) NOT NULL ,
 `lastname` CHAR(20) NOT NULL ,
 `phonenumber` CHAR(30) NOT NULL ,
 `email` CHAR(50) NOT NULL ,
 `country` CHAR(20) NOT NULL ,
 `address` CHAR(50) NOT NULL ,
 `city` CHAR(50) NOT NULL ,
 `zipcode` CHAR(20) NOT NULL ,
 `shippingcountry` CHAR(50) NULL ,
 `shippingaddress` CHAR(50) NULL ,
 `shippingcity` CHAR(50) NULL ,
 `shippingzipcode` CHAR(50) NULL 
 );
 
 CREATE TABLE `baggage` (
 `baggageID` INT(3) NOT NULL AUTO_INCREMENT primary key,
 `flightnumber` CHAR(20) NOT NULL ,
 `brand` CHAR(20) NULL ,
 `color` CHAR(30) NULL ,
 `weight` CHAR(50) NULL ,
 `description` VARCHAR(200) NULL,
 `dateadded` CHAR(20) NULL,
 `dateretrieved` CHAR(20) NULL
 );
 
 CREATE TABLE `log` (
 `logID` INT(6) NOT NULL AUTO_INCREMENT primary key,
 `employeeID` INT(3) NOT NULL,
 `timestamp` TIMESTAMP(0),
 `action` CHAR(255) NOT NULL,
 `tab` CHAR(255) NOT NULL
 );

INSERT INTO employee
(name, lastname, username, password, email, phonenumber, function)
VALUES ('Jan', 'Janssen', 'appmanager1', 'appmanager123', 'jan@corendon.nl', '0612300321', 'application manager');

INSERT INTO employee
(name, lastname, username, password, email, phonenumber, function)
VALUES ('Henk', 'de Vries', 'manager1', 'manager123', 'henk@corendon.nl', '0687654321', 'manager'); 

INSERT INTO employee
(name, lastname, username, password, email, phonenumber, function)
VALUES ('Evert', 'Smit', 'serdesemp1', 'serdesemp123', 'evert@corendon.nl', '0612344321', 'service desk employee');