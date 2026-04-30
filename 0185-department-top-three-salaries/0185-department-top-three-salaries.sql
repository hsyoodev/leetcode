/* Write your PL/SQL query statement below */
WITH 
    CUSTOM AS
    (
        SELECT
                DENSE_RANK() OVER(PARTITION BY A.departmentId ORDER BY A.salary DESC) AS rank
              , B.name AS Department
              , A.name AS Employee
              , A.salary AS Salary
        FROM
                Employee A
        INNER JOIN
                Department B
        ON 
                A.departmentId = B.id
    )
SELECT
        Department
      , Employee
      , Salary
FROM
        CUSTOM
WHERE
        rank <= 3;
