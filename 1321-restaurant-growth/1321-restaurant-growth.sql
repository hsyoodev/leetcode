# Write your MySQL query statement below
SELECT
        visited_on
      , (
            SELECT SUM(amount)
            FROM Customer
            WHERE visited_on BETWEEN DATE_SUB(C.visited_on, INTERVAL 6 DAY) AND C.visited_on
        ) AS amount
      , ROUND
        (
                (
                    SELECT SUM(amount) / 7
                    FROM Customer
                    WHERE visited_on BETWEEN DATE_SUB(C.visited_on, INTERVAL 6 DAY) AND C.visited_on
                )
              , 2
        ) AS average_amount
FROM 
        Customer C
WHERE 
        visited_on >= (
                        SELECT DATE_ADD(MIN(visited_on), INTERVAL 6 DAY)
                        FROM Customer
                      )
GROUP BY 
        visited_on;
