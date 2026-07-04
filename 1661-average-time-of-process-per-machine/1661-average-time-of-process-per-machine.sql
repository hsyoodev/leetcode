# Write your MySQL query statement below
SELECT
        A.machine_id
      , ROUND(SUM(B.timestamp - A.timestamp) / COUNT(*), 3) AS processing_time
FROM
        Activity A
INNER JOIN
        Activity B
ON
        A.machine_id = B.machine_id
AND
        A.process_id = B.process_id
WHERE
        A.activity_type = 'start'
AND
        B.activity_type = 'end'
GROUP BY
        A.machine_id;
