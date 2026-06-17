CREATE TABLE Sales (
    ProductName VARCHAR(100),
    SaleMonth VARCHAR(10),
    Quantity INT
);
INSERT INTO Sales VALUES
('Laptop','Jan',10),
('Laptop','Feb',15),
('Laptop','Mar',12),

('Phone','Jan',20),
('Phone','Feb',18),
('Phone','Mar',25);

SELECT
    ProductName,

    SUM(CASE WHEN SaleMonth='Jan' THEN Quantity ELSE 0 END) AS Jan,

    SUM(CASE WHEN SaleMonth='Feb' THEN Quantity ELSE 0 END) AS Feb,

    SUM(CASE WHEN SaleMonth='Mar' THEN Quantity ELSE 0 END) AS Mar

FROM Sales
GROUP BY ProductName;

SELECT ProductName,'Jan' AS Month, Jan AS Quantity
FROM (
    SELECT
        ProductName,
        SUM(CASE WHEN SaleMonth='Jan' THEN Quantity ELSE 0 END) AS Jan,
        SUM(CASE WHEN SaleMonth='Feb' THEN Quantity ELSE 0 END) AS Feb,
        SUM(CASE WHEN SaleMonth='Mar' THEN Quantity ELSE 0 END) AS Mar
    FROM Sales
    GROUP BY ProductName
) p

UNION ALL

SELECT ProductName,'Feb',Feb
FROM (
    SELECT
        ProductName,
        SUM(CASE WHEN SaleMonth='Jan' THEN Quantity ELSE 0 END) AS Jan,
        SUM(CASE WHEN SaleMonth='Feb' THEN Quantity ELSE 0 END) AS Feb,
        SUM(CASE WHEN SaleMonth='Mar' THEN Quantity ELSE 0 END) AS Mar
    FROM Sales
    GROUP BY ProductName
) p

UNION ALL

SELECT ProductName,'Mar',Mar
FROM (
    SELECT
        ProductName,
        SUM(CASE WHEN SaleMonth='Jan' THEN Quantity ELSE 0 END) AS Jan,
        SUM(CASE WHEN SaleMonth='Feb' THEN Quantity ELSE 0 END) AS Feb,
        SUM(CASE WHEN SaleMonth='Mar' THEN Quantity ELSE 0 END) AS Mar
    FROM Sales
    GROUP BY ProductName
) p;

