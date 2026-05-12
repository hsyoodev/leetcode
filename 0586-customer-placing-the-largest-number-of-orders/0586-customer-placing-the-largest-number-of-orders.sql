/* Write your PL/SQL query statement below */
SELECT
        customer_number
FROM
        (
            SELECT 
                    customer_number
                  , RANK() OVER (ORDER BY COUNT(*) DESC) AS RANK 
            FROM 
                    Orders
            GROUP BY 
                    customer_number
        )
WHERE 
        RANK = 1;
