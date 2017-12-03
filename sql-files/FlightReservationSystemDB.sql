CREATE TABLE flight_database.`Address` (
	`street` varchar(45) DEFAULT NULL,
    `unit` int(10) DEFAULT NULL,
    `id` int(10) NOT NULL AUTO_INCREMENT,
    `city` varchar(45) DEFAULT NULL,
    `state` varchar(45) DEFAULT NULL,
    `country` varchar(45) DEFAULT NULL,
    `zipcode` int(10) DEFAULT NULL,
    PRIMARY KEY  (`id`)
    ) ;

    CREATE TABLE flight_database.`Person` (
	`firstName` varchar(45) DEFAULT NULL,
    `lastName` varchar(45) DEFAULT NULL,
    `id` int(10) NOT NULL,
   `gender` varchar(45) DEFAULT NULL,
   `dob` date DEFAULT NULL,
   `email` varchar(45) NOT NULL,
   `password` varchar(45) DEFAULT NULL,
    PRIMARY KEY  (`email`),
    FOREIGN KEY ( `id`)  REFERENCES flight_database.address( `id`)
    ) ;
    
    create table flight_database.`Passenger` (
    `email` varchar(50) not null,
    `visatype` varchar(10) default null,
    `passportno` varchar(10) default null,
    `mealtype` varchar(10) default null,
    `tickettype` varchar(10) default null,
    primary key (`email`)
    );
    
    create table flight_database.`Customer` (
    `email` varchar(50) not null,
    `noofreservations` varchar(10) default null,
    primary key (`email`)
    );
    
    create table flight_database.`Passenger_Customer` (
    `pemail` varchar(50) not null,
    `cemail` varchar(50) not null,
    primary key(`pemail`,`cemail`),
    foreign key(`pemail`) references `Passenger`(`email`),
    foreign key(`cemail`) references `Customer`(`email`)
    
    );
    
    desc flight_database.person;