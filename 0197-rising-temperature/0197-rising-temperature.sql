/* Write your PL/SQL query statement below */
SELECT
        B.id
FROM
        weather A
INNER JOIN
        weather B
ON
        A.recordDate = B.recordDate - 1
WHERE
        A.temperature < B.temperature;
