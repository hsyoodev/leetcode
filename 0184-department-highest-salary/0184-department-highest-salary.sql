/* Write your PL/SQL query statement below */
WITH
    Custom AS
    (
        SELECT
                A.name AS Employee
              , B.name AS Department
              , A.departmentId
              , A.salary
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
        (departmentId, salary) IN (
                                    SELECT
                                            departmentId
                                          , MAX(salary)
                                    FROM
                                            CUSTOM
                                    GROUP BY
                                            departmentId
                                  );
