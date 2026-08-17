# Write your MySQL query statement below
(
    SELECT
            CASE
                WHEN id IN (SELECT MAX(id) FROM Seat) THEN id
                ELSE id + 1
            END AS id
        , student
    FROM
            Seat
    WHERE
            MOD(id, 2) = 1
)
UNION ALL
(
    SELECT
            (id - 1) AS id
          , student
    FROM
            Seat
    WHERE
            MOD(id, 2) = 0
)
ORDER BY
        id;
