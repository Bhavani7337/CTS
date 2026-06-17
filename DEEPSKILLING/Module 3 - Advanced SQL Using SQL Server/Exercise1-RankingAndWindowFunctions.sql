CREATE DATABASE OnlineRetailStore;
USE OnlineRetailStore;

CREATE TABLE Products (
    ProductID INT PRIMARY KEY,
    ProductName VARCHAR(100),
    Category VARCHAR(50),
    Price DECIMAL(10,2)
);

INSERT INTO Products VALUES
(1,'Laptop','Electronics',80000),
(2,'Phone','Electronics',60000),
(3,'Tablet','Electronics',40000),
(4,'TV','Electronics',80000),
(5,'Shirt','Fashion',2000),
(6,'Jeans','Fashion',3000),
(7,'Jacket','Fashion',5000),
(8,'Shoes','Fashion',5000);

SELECT * FROM Products;

SELECT *
FROM (
    SELECT
        ProductID,
        ProductName,
        Category,
        Price,
        ROW_NUMBER() OVER (
            PARTITION BY Category
            ORDER BY Price DESC
        ) AS RowNum
    FROM Products
) RankedProducts
WHERE RowNum <= 3;

SELECT *
FROM (
    SELECT
        ProductID,
        ProductName,
        Category,
        Price,
        RANK() OVER (
            PARTITION BY Category
            ORDER BY Price DESC
        ) AS RankNum
    FROM Products
) RankedProducts
WHERE RankNum <= 3;

SELECT *
FROM (
    SELECT
        ProductID,
        ProductName,
        Category,
        Price,
        DENSE_RANK() OVER (
            PARTITION BY Category
            ORDER BY Price DESC
        ) AS DenseRankNum
    FROM Products
) RankedProducts
WHERE DenseRankNum <= 3;