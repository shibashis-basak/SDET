REM   Script: Activity_1_2_3
REM   Activity_1_2_3

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

