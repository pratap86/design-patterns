CREATE TABLE EMPLOYEE (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  email VARCHAR(250) DEFAULT NULL
);
create table ticket
(
	id INT AUTO_INCREMENT  PRIMARY KEY,
	movie VARCHAR(20),
	screen VARCHAR(20),
	seat VARCHAR(20)
);