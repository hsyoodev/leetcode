# Write your MySQL query statement below
SELECT
        MAX(num) AS num
FROM
        MyNumbers A
WHERE
        (
            SELECT
                    COUNT(*)
            FROM
                    MyNumbers B
            WHERE
                    B.num = A.num
        ) = 1