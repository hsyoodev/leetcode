# Write your MySQL query statement below
SELECT
        customer_id
      , COUNT(*) AS count_no_trans
FROM
        Visits
WHERE
        NOT EXISTS (
                        SELECT 1
                        FROM Transactions
                        WHERE Transactions.visit_id = Visits.visit_id
                   )
GROUP BY
        customer_id;
