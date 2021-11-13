CREATE TABLE CATEGORY (
    categoryid int IDENTITY(1,1) PRIMARY KEY,
    categoryname varchar(100) UNIQUE
);

CREATE TABLE PRODUCT (
    productid int IDENTITY(1,1) PRIMARY KEY,
    productname varchar(100),
    productdescription varchar(100),
    categoryid int,
    stock int,
    FOREIGN KEY (categoryid) REFERENCES CATEGORY(categoryid)
);
