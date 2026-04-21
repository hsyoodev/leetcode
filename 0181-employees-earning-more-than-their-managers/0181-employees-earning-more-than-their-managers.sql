/* Write your PL/SQL query statement below */
SELECT
        A.name AS Employee
FROM
        Employee A
INNER JOIN
        Employee B
ON
        A.managerId = B.id
AND
        A.salary > B.salary;
