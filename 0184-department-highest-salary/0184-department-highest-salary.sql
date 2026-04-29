/* Write your PL/SQL query statement below */
SELECT
        B.name AS Department
      , A.name AS Employee
      , A.salary AS Salary
FROM
        Employee A
INNER JOIN 
        Department B
ON
        A.departmentId = B.id
AND
        A.salary IN (
                        SELECT
                                MAX(salary)
                        FROM
                                Employee
                        WHERE
                                departmentId = A.departmentId
                    );
