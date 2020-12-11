REM   Script: Activities_9_10_11
REM   Activities 9-11

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

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

SELECT DISTINCT salesman_id FROM orders;

SELECT order_no, order_date FROM orders ORDER BY order_date;

SELECT order_no, purchase_amount FROM orders ORDER BY purchase_amount DESC;

SELECT * FROM orders WHERE purchase_amount<500;

SELECT * FROM orders WHERE purchase_amount BETWEEN 1000 AND 2000;

SELECT SUM(purchase_amount) FROM orders;

SELECT AVG(purchase_amount) FROM orders;

SELECT MAX(purchase_amount) FROM orders;

SELECT MIN(purchase_amount) FROM orders;

SELECT COUNT(*) FROM orders;

SELECT MAX(purchase_amount) FROM orders GROUP BY customer_id ORDER BY customer_id, MAX(purchase_amount);

SELECT MAX(purchase_amount), customer_id FROM orders GROUP BY customer_id ORDER BY customer_id, MAX(purchase_amount);

SELECT MAX(purchase_amount), customer_id FROM orders GROUP BY customer_id ORDER BY customer_id;

SELECT MAX(purchase_amount), customer_id FROM orders WHERE order_date='2012/08/17' GROUP BY salesman_id;

SELECT salesman_id, order_date, MAX(purchase_amount) AS "Max Amount" FROM orders  
WHERE order_date=To_DATE('2012/08/17', 'YYYY/MM/DD') GROUP BY salesman_id, order_date;

SELECT customer_id, order_date, MAX(purchase_amount) FROM orders GROUP BY customer_id, order_date HAVING MAX(purchase_amount) IN(2030, 3450, 5760, 6000);

create table customers ( 
    customer_id int primary key, customer_name varchar(32), 
    city varchar(20), grade int, salesman_id int);

INSERT INTO customers VALUES(3002, 'Nick Rimando', 'New York', 100, 5001);

INSERT INTO customers VALUES(3002, 'Nick Rimando', 'New York', 100, 5001);

INSERT INTO customers VALUES(3007, 'Brad Davis', 'New York', 200, 5001);

INSERT INTO customers VALUES(3005, 'Graham Zusi', 'California', 200, 5002);

INSERT INTO customers VALUES(3008, 'Julian Green', 'London', 300, 5002);

INSERT INTO customers VALUES(3004, 'Fabian Johnson', 'Paris', 300, 5006);

INSERT INTO customers VALUES(3009, 'Geoff Cameron', 'Berlin', 100, 5003);

INSERT INTO customers VALUES(3003, 'Jozy Altidor', 'Moscow', 200, 5007);

INSERT INTO customers VALUES(3001, 'Brad Guzan', 'London', 300, 5005);

SELECT a.customer_name AS "Customer Name", b.name AS "Salesman", b.commission  
FROM customers a JOIN salesman b  
ON a.salesman_id=b.salesman_id;

SELECT a.customer_name, a.city, a.grade, b.name AS "Salesman", b.city  
FROM customers a LEFT JOIN salesman b  
ON a.salesman_id=b.salesman_id ON a.grade<300  
ORDER BY a.customer_id;

SELECT a.customer_name, b.name AS "Salesman", b.commission 
FROM customers a JOIN salesman b  
ON a.salesman_id=b.salesman_id AND b.commission>12;

SELECT o.order_no, o.order_date, o.purchase_amount, s.name AS "Salesman", c.customer_name AS "Customer", s.commission 
FROM orders o JOIN salesman s  
ON o.salesman_id=s.salesman_id 
JOIN customers c 
ON o.customer_id=c.customer_id;

SELECT*  
FROM orders  
WHERE salesman_id=(SELECT salesman_id FROM orders WHERE customer_id=3007);

SELECT * 
FROM orders 
WHERE salesman_id=(SELECT salesman_id FROM salesman WHERE city='New York');

SELECT COUNT(*), grade 
FROM customers 
WHERE grade=(SELECT avg(grade) FROM customers WHERE city='New York' );

SELECT grade, COUNT(*) FROM customers 
GROUP BY grade HAVING grade>(SELECT AVG(grade) FROM customers WHERE city='New York');

create table customers ( 
    customer_id int primary key, customer_name varchar(32), 
    city varchar(20), grade int, salesman_id int);

INSERT INTO customers VALUES(3002, 'Nick Rimando', 'New York', 100, 5001);

SELECT a.customer_name AS "Customer Name", b.name AS "Salesman", b.commission  
FROM customers a JOIN salesman b  
ON a.salesman_id=b.salesman_id;

SELECT a.customer_name, a.city, a.grade, b.name AS "Salesman", b.city  
FROM customers a LEFT JOIN salesman b  
ON a.salesman_id=b.salesman_id ON a.grade<300  
ORDER BY a.customer_id;

SELECT a.customer_name, b.name AS "Salesman", b.commission 
FROM customers a JOIN salesman b  
ON a.salesman_id=b.salesman_id AND b.commission>12;

SELECT o.order_no, o.order_date, o.purchase_amount, s.name AS "Salesman", c.customer_name AS "Customer", s.commission 
FROM orders o JOIN salesman s  
ON o.salesman_id=s.salesman_id 
JOIN customers c 
ON o.customer_id=c.customer_id;

CT*  


FROM orders  


WHERE salesman_id=(SELECT salesman_id FROM orders WHERE customer_id=3007); 


SELECT*  
FROM orders  
WHERE salesman_id=(SELECT salesman_id FROM orders WHERE customer_id=3007);

SELECT a.customer_name, a.city, a.grade, b.name AS "Salesman", b.city  
FROM customers a LEFT JOIN salesman b  
ON a.salesman_id=b.salesman_id ON a.grade<300  
ORDER BY a.customer_id;

SELECT*  
FROM orders  
WHERE salesman_id=(SELECT salesman_id FROM orders WHERE customer_id=3007);

SELECT * 
FROM orders 
WHERE salesman_id=(SELECT salesman_id FROM salesman WHERE city='New York');

SELECT COUNT(*), grade 
FROM customers 
WHERE grade=(SELECT avg(grade) FROM customers WHERE city='New York' );

SELECT grade, COUNT(*)  
FROM customers 
GROUP BY grade  
HAVING grade>(SELECT AVG(grade) FROM customers WHERE city='New York');

SELECT order_no, purchase_amount, order_date, salesman_id FROM orders 
WHERE salesman_id IN( SELECT salesman_id FROM salesman 
WHERE commission=( SELECT MAX(commission) FROM salesman));

SELECT c.customer_name, c.city, c.grade, s.name AS "Salesman", s.city  
FROM customers c LEFT JOIN salesman s 
ON c.salesman_id = s.salesman_id ON c.grade<300  
ORDER BY c.customer_id;

SELECT c.customer_name, c.city, c.grade, s.name AS "Salesman", s.city  
FROM customers c JOIN salesman s 
ON c.salesman_id = s.salesman_id ON c.grade<300  
ORDER BY c.customer_id;

SELECT *  
FROM orders  
WHERE salesman_id=(SELECT salesman_id FROM orders WHERE customer_id=3007);

SELECT COUNT(*), grade 
FROM customers 
WHERE grade=(SELECT avg(grade) FROM customers WHERE city='New York' );

SELECT * 
FROM orders 
WHERE salesman_id=(SELECT salesman_id FROM salesman WHERE city='New York');

SELECT grade, COUNT(*)  
FROM customers 
GROUP BY grade  
HAVING grade>(SELECT AVG(grade) FROM customers WHERE city='New York');

SELECT  grade 
FROM customers 
WHERE grade=(SELECT avg(grade) FROM customers WHERE city='New York' );

SELECT avg(grade) FROM customers WHERE city='New York';

SELECT  grade 
FROM customers 
WHERE grade>(SELECT avg(grade) FROM customers WHERE city='New York' );

ELECT grade, COUNT(*)  


FROM customers 


GROUP BY grade  


HAVING grade>(SELECT AVG(grade) FROM customers WHERE city='New York');


SELECT grade, COUNT(*)  
FROM customers 
GROUP BY grade  
HAVING grade>(SELECT AVG(grade) FROM customers WHERE city='New York');

SELECT c.customer_name, c.city, c.grade, s.name AS "Salesman", s.city  
FROM customers c LEFT JOIN salesman s;

SELECT c.customer_name, c.city, c.grade, s.name AS "Salesman", s.city  
FROM customers c LEFT JOIN salesman s;

SELECT a.customer_name AS "Customer Name", b.name AS "Salesman", b.commission  
FROM customers a JOIN salesman b  
ON a.salesman_id=b.salesman_id;

SELECT a.customer_name, b.name AS "Salesman", b.commission 
FROM customers a JOIN salesman b;

SELECT c.customer_name, c.city, c.grade, s.name AS "Salesman", s.city  
FROM customers c LEFT JOIN salesman s 
ON c.salesman_id = s.salesman_id ON c.grade<300 ;

SELECT c.customer_name, c.city, c.grade, s.name AS "Salesman", s.city  
FROM customers c LEFT JOIN salesman s 
ON c.salesman_id = s.salesman_id ON c.grade<300;

SELECT a.customer_name, b.name AS "Salesman", b.commission 
FROM customers a JOIN salesman b  
ON a.salesman_id=b.salesman_id AND b.commission>12;

SELECT c.customer_name, s.name AS "Salesman", s.commission 
FROM customers c JOIN salesman s  
ON c.salesman_id=s.salesman_id AND s.commission>12;

SELECT a.customer_name, a.city, a.grade, b.name AS "Salesman", b.city FROM customers a  
LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id WHERE a.grade<300  
ORDER BY a.customer_id;

SELECT a.customer_name, a.city, a.grade, b.name AS "Salesman", b.city  
FROM customers a LEFT OUTER JOIN salesman b  
ON a.salesman_id=b.salesman_id  
WHERE a.grade<300  
ORDER BY a.customer_id;

SELECT a.customer_name, a.city, a.grade, b.name AS "Salesman", b.city  
FROM customers a LEFT OUTER JOIN salesman b  
ON a.salesman_id=b.salesman_id  
AND; a.grade<300  
ORDER BY a.customer_id;

SELECT a.customer_name, a.city, a.grade, b.name AS "Salesman", b.city  
FROM customers a LEFT OUTER JOIN salesman b  
ON a.salesman_id=b.salesman_id  
AND a.grade<300  
ORDER BY a.customer_id;

SELECT a.customer_name, a.city, a.grade, b.name AS "Salesman", b.city  
FROM customers a LEFT OUTER JOIN salesman b  
ON a.salesman_id=b.salesman_id  
WHERE a.grade<300  
ORDER BY a.customer_id;

SELECT order_no, purchase_amount, order_date, salesman_id FROM orders 
WHERE salesman_id IN( SELECT salesman_id FROM salesman 
WHERE commission = (SELECT MAX(commission) FROM salesman));

SELECT customer_id, customer_name FROM customers a 
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.customer_id = b.customer_id) 
UNION 
SELECT salesman_id, name FROM salesman a 
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.salesman_id = b.salesman_id) 
ORDER BY customer_nam;

SELECT customer_id, customer_name FROM customers a 
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.customer_id = b.customer_id) 
UNION 
SELECT salesman_id, name FROM salesman a 
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.salesman_id = b.salesman_id) 
ORDER BY customer_name;

SELECT a.salesman_id, name, order_no, 'highest on', order_date FROM salesman a, orders b 
WHERE a.salesman_id=b.salesman_id 
AND b.purchase_amount=(SELECT MAX(purchase_amount) FROM orders c WHERE c.order_date = b.order_date) 
UNION 
SELECT a.salesman_id, name, order_no, 'lowest on', order_date FROM salesman a, orders b 
WHERE a.salesman_id=b.salesman_id 
AND b.purchase_amount=(SELECT MIN(purchase_amount) FROM orders c WHERE c.order_date = b.order_date);

