# Write your MySQL query statement below
SELECT
        DISTINCT num AS ConsecutiveNums
FROM
        (
            SELECT
                    id
                  , num
                  , LAG(num, 1) OVER() AS prev1
                  , LAG(num, 2) OVER() AS prev2
            FROM
                    Logs
        ) L
WHERE
        L.num = L.prev1
AND
        L.num = L.prev2;
