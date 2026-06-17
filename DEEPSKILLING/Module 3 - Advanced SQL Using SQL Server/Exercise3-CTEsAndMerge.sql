WITH RECURSIVE Calendar AS (
    SELECT DATE('2025-01-01') AS DateValue

    UNION ALL

    SELECT DATE_ADD(DateValue, INTERVAL 1 DAY)
    FROM Calendar
    WHERE DateValue < '2025-01-31'
)
SELECT * FROM Calendar;

CREATE TABLE StagingProducts (
    ProductID INT PRIMARY KEY,
    ProductName VARCHAR(100),
    Category VARCHAR(50),
    Price DECIMAL(10,2)
);

INSERT INTO StagingProducts VALUES
(1,'Laptop','Electronics',85000),
(2,'Phone','Electronics',62000),
(9,'Smart Watch','Electronics',15000);

INSERT INTO Products(ProductID, ProductName, Category, Price)
SELECT ProductID, ProductName, Category, Price
FROM StagingProducts
ON DUPLICATE KEY UPDATE
    ProductName = VALUES(ProductName),
    Category = VALUES(Category),
    Price = VALUES(Price);
    
SELECT * FROM Products;