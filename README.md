# Webpro-Project
Bs.c.IT 2
- Chonticha Sae-jiw    60130500018
- Thanatcha Sukapunpan 60130500039  
- Budsakorn Porananun  60130500047

## database

DROP TABLE ACCOUNT;
DROP TABLE CATEGORY;
DROP TABLE CUSTOMER;
DROP TABLE ORDER_DETAIL;
DROP TABLE ORDER_lIST;
DROP TABLE PRODUCT;

CREATE TABLE CATEGORY
(CATEGORY_ID INT,CATEGORY_NAME VARCHAR(45),
PRIMARY KEY (CATEGORY_ID));


CREATE TABLE PRODUCT
(PRODUCT_ID VARCHAR(45),PRODUCT_NAME VARCHAR(45),CATEGORY_ID INT,PRICE DOUBLE,
PRIMARY KEY (PRODUCT_ID),
FOREIGN KEY (CATEGORY_ID) REFERENCES CATEGORY(CATEGORY_ID));


create table Account
(EMAIL VARCHAR(45),
PASSWORD VARCHAR(45),
DATE_REGIS timestamp,
ACTIVATE_KEY VARCHAR(45),
ACTIVATE_TIMESTAMP timestamp,
PRIMARY KEY (email));

CREATE TABLE CUSTOMER
(NAME VARCHAR(45),
LASTNAME VARCHAR(45),
CUST_ID INT,
GENDER VARCHAR(45),
AGE INT,
EMAIL VARCHAR(45) , 
PRIMARY KEY (CUST_ID)
FOREIGN KEY (EMAIL) REFERENCES ACCOUNT(email));



CREATE TABLE ORDER_LIST
(ORDER_ID INT,TIME_STAMP VARCHAR(45),CUST_ID int,
PRIMARY KEY (ORDER_ID),
FOREIGN KEY (CUST_ID) REFERENCES    customer(CUST_ID));


CREATE TABLE ORDER_DETAIL
(ORDER_DETAILNO INT,ORDER_ID INT,PRODUCT_ID VARCHAR(45),AMOUNT INT,TOTAL_PRICE INT,
PRIMARY KEY (ORDER_DETAILNO),
FOREIGN KEY (ORDER_ID) REFERENCES  ORDER_LIST(ORDER_ID) ,
FOREIGN KEY (PRODUCT_ID) REFERENCES    PRODUCT(PRODUCT_ID));



INSERT INTO CATEGORY
VALUES (1,'Vegetables');
INSERT INTO CATEGORY
VALUES (2,'Fruits');
INSERT INTO CATEGORY
VALUES (3,'Dried Fruits');
INSERT INTO CATEGORY
VALUES (4,'Juices');

insert into product
values ('F03','Strawberry',2,160);
insert into product
values ('F04','Apple',2,70);
insert into product
values ('F05','Grapes',2,200);
insert into product
values ('F06','Mango',2,65);
insert into product
values ('F07','Pineapple',2,20);
insert into product
values ('F08','Watermelon',2,15);

insert into product
values ('V01','Broccoli',1,50);
insert into product
values ('V02','Carrot',1,30);
insert into product
values ('V03','Tomato',1,25);
insert into product
values ('V04','Corn',1,30);
insert into product
values ('V05','Chinese Cabbage',1,10);
insert into product
values ('V06','Pea',1,90);
insert into product
values ('V07','Sweet Pepper',1,30);
insert into product
values ('V08','Garlic',1,60);
