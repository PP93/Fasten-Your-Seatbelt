CREATE TABLE `employeeID` ( 
`employeeID` INT( 3 ) NOT NULL AUTO_INCREMENT primary key,
`name` CHAR( 20 ) NOT NULL ,
`lastname` CHAR( 20 ) NOT NULL ,
`username` CHAR( 20 ) NOT NULL ,
`password` CHAR( 20 ) NOT NULL ,
`email` CHAR( 50 ) NOT NULL ,
`phonenumber` CHAR( 30 ) NOT NULL ,
`function` CHAR( 50 ) NOT NULL ,
);

CREATE TABLE `client` ( 
`clientID` INT( 3 ) NOT NULL AUTO_INCREMENT primary key,
`name` CHAR( 20 ) NOT NULL ,
`lastname` CHAR( 20 ) NOT NULL ,
`phonenumber` CHAR( 30 ) NOT NULL ,
`email` CHAR( 50 ) NOT NULL ,
`country` CHAR( 20 ) NOT NULL ,
`address` CHAR( 50 ) NOT NULL ,
`city` CHAR( 50 ) NOT NULL ,
`zipcode` CHAR( 20 ) NOT NULL ,
`shippingcountry` CHAR( 50 ) NOT NULL ,
`shippingaddress` CHAR( 50 ) NOT NULL ,
`shippingcity` CHAR( 50 ) NOT NULL ,
`shippingzipcode` CHAR( 50 ) NOT NULL 

);