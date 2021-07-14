CREATE DATABASE IF NOT EXISTS mydb;
USE mydb;

CREATE TABLE credit (
  id INT NOT NULL AUTO_INCREMENT,
  creditName VARCHAR(45) NOT NULL,
  PRIMARY KEY (id));

INSERT INTO credit(id, creditName) VALUES
(1,"A");

CREATE TABLE customer (
  id INT NOT NULL AUTO_INCREMENT,
  creditId INT NOT NULL,
  firstName VARCHAR(45) NOT NULL,
  surname VARCHAR(45) NOT NULL,
  pesel VARCHAR(45) NOT NULL,
  PRIMARY KEY (id));

INSERT INTO customer(id, creditId, firstName, surname, pesel) VALUES
(1,1,"Jakub","Pralat","99999912345");

CREATE TABLE product (
  id INT NOT NULL AUTO_INCREMENT,
  creditId INT NOT NULL,
  name VARCHAR(45) NOT NULL,
  value INT NOT NULL,
  PRIMARY KEY (id));

INSERT INTO product(id, creditID, name, value) VALUES
(1,1,"car",69);