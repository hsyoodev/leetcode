# Write your MySQL query statement below
SELECT
        ROUND(COUNT(DISTINCT player_id) / (SELECT COUNT(DISTINCT player_id) FROM Activity), 2) AS fraction
FROM
        Activity
WHERE
        (player_id, event_date) IN (
                                        SELECT
                                                player_id
                                              , (ADDDATE(MIN(event_date), 1)) AS min_event_date
                                        FROM
                                                Activity
                                        GROUP BY
                                                player_id
                                   );
