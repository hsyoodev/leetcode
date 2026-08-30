# Write your MySQL query statement below
WITH 
    CTE AS
    (
        SELECT
                RANK() OVER(PARTITION BY customer_id ORDER BY order_date) AS rn
            , customer_id
            , order_date
            , customer_pref_delivery_date
        FROM
                Delivery
    )
  , T AS
    (
        SELECT
                COUNT(*) as immediate_count
        FROM
                CTE
        WHERE
                rn = 1
        AND
                order_date = customer_pref_delivery_date
    )
SELECT
        ROUND((SELECT immediate_count FROM T) / COUNT(DISTINCT customer_id), 4) * 100 AS immediate_percentage
FROM
        Delivery;
