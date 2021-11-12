CREATE TABLE CATEGORI (
    categoriid int IDENTITY(1,1) PRIMARY KEY,
    categoriname varchar(100) UNIQUE
);

CREATE TABLE PRODUCT (
    productid int IDENTITY(1,1) PRIMARY KEY,
    productname varchar(100),
    productdescription varchar(100),
    categoriid int,
    stock int,
    FOREIGN KEY (categoriid) REFERENCES CATEGORI(categoriid)
);
