REM   Script: Activities_1_2_3_4_5
REM   Activities 1-5

CREATE TABLE salesman (  
    salesman_id int,  
    name varchar(20),  
    city varchar(20),  
    commission int  
);

DESCRIBE salesman


INSERT INTO salesman VALUES(5001, 'James Hoog', 'New York', 15);

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT INTO salesman VALUES(5005, 'Pit Alex', 'London', 11);

INSERT INTO salesman VALUES(5006, 'McLyon', 'Paris', 14);

INSERT INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13);

INSERT INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12);

SELECT * FROM salesman;

SELECT salesman_id, city FROM salesman;

SELECT * FROM salesman WHERE city='Paris';

SELECT salesman_id, commission FROM salesman WHERE name='Paul Adam';

ALTER TABLE salesman add (grade int);

UPDATE salesman SET grade=100;

SELECT * FROM salesman;

UPDATE salesman SET grade=200 WHERE city='Rome';

SELECT * FROM salesman;

UPDATE salesman SET grade=300 WHERE name='James Hoog';

SELECT * FROM salesman;

UPDATE salesman SET name='Pierre' WHERE name='McLyon';

SELECT * FROM salesman;

