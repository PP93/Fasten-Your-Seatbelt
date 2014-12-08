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
 `dateretrieved` CHAR(20) NULL,
 `status` CHAR(20) NULL,
 `clientID` INT(3) NULL
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

INSERT INTO client
(name, lastname, phonenumber, email, country, address, city, zipcode, shippingcountry, shippingaddress, shippingcity, shippingzipcode)
VALUES ('Floris', 'van Lent', '0613371337', 'floris.van.lent@hva.nl', 'Nederland', 'Pindakaaslaan 2', 'Amsterdam', '1337 WC', 'Nederland', 'Pindakaaslaan 2', 'Amsterdam', '1337 WC');

INSERT INTO client
(name, lastname, phonenumber, email, country, address, city, zipcode, shippingcountry, shippingaddress, shippingcity, shippingzipcode)
VALUES ('Lars', 'Cornelissen', '0612345678', 'lars.cornelissen@hva.nl', 'Nederland', 'Pindakaaslaan 3', 'Amsterdam', '1337 IQ', 'Nederland', 'Pindakaaslaan 3', 'Amsterdam', '1337 IQ');

INSERT INTO baggage
(flightnumber, brand, color, weight, description, dateadded, dateretrieved, status, clientID)
VALUES ('MH16', 'Samsonite', 'Blauw', '10 kg', 'Er staat vet groot "FLORIS" op', '2014-12-8', '2014-12-9', 'Retrieved', '1');

INSERT INTO baggage
(flightnumber, dateadded, status, clientID)
VALUES ('MH18', '2014-12-1', 'Permanently lost', '2');

INSERT INTO baggage
(flightnumber, dateadded, status, clientID)
VALUES ('MH19', '2014-12-7', 'Missing', '2');