# Write your MySQL query statement below
SELECT
        P1.product_id
      , IFNULL(SUM(CASE WHEN P2.product_id IS NOT NULL THEN P1.new_price END), 10) AS price
FROM
        Products P1
LEFT OUTER JOIN
        (
            SELECT
                    product_id
                  , MAX(change_date) AS max_change_date
            FROM
                    Products
            WHERE
                    change_date <= '2019-08-16'
            GROUP BY
                    product_id
        ) P2
ON
        P1.product_id = P2.product_id
WHERE
        P1.change_date = P2.max_change_date
OR
        P2.max_change_date IS NULL           
GROUP BY
        P1.product_id;
