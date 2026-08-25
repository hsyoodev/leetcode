# Write your MySQL query statement below
SELECT
        U.user_id AS buyer_id
      , U.join_date
      , COUNT(
                CASE
                    WHEN YEAR(O.order_date) = '2019' THEN 1
                END
             ) AS orders_in_2019
FROM
        Users U
LEFT OUTER JOIN
        Orders O
ON 
        U.user_id = O.buyer_id
GROUP BY
        U.user_id, U.join_date;
