# Write your MySQL query statement below
WITH
    CTE1 AS (
        SELECT
                visited_on
              , SUM(amount) AS amount
        FROM
                Customer
        GROUP BY
                visited_on
    )
  , CTE2 AS (
        SELECT
                visited_on
              , SUM(amount) OVER(ORDER BY visited_on rows between 6 preceding and current row) AS amount
              , RANK() OVER(ORDER BY visited_on) AS RN
        FROM
                CTE1
    )
SELECT
        visited_on
      , amount
      , ROUND(amount / 7, 2) AS average_amount
FROM
        CTE2
WHERE
        rn >= 7;
