# Write your MySQL query statement below
SELECT 
        DISTINCT 
        Product.product_id
      , Product.product_name
FROM
        Product
INNER JOIN
        Sales
ON
        Product.product_id = Sales.product_id
WHERE
        NOT EXISTS (
                        SELECT 1
                        FROM Sales
                        WHERE product_id = Product.product_id
                        AND (sale_date < '2019-01-01' OR sale_date > '2019-03-31')
        )
