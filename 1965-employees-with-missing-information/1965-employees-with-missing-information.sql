# Write your MySQL query statement below
(
    SELECT
            E.employee_id
    FROM
            Employees E
    LEFT OUTER JOIN
            Salaries S
    ON
            E.employee_id = S.employee_id
    WHERE
            S.employee_id IS NULL
)
UNION ALL
(
    SELECT
            S.employee_id
    FROM
            Employees E
    RIGHT OUTER JOIN
            Salaries S
    ON
            E.employee_id = S.employee_id
    WHERE
            E.employee_id IS NULL
)
ORDER BY
        employee_id;
