# Write your MySQL query statement below
SELECT 
        Custom_Activity.machine_id
      , ROUND(AVG(Custom_Activity.processing_time), 3) AS processing_time
FROM
        (
            SELECT
                    machine_id
                  , MAX(timestamp) - MIN(timestamp) AS processing_time
            FROM
                    Activity
            GROUP BY
                    machine_id, process_id
        ) Custom_Activity
GROUP BY
        Custom_Activity.machine_id;
