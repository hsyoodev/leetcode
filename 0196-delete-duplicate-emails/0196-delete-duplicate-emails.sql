/* Write your PL/SQL query statement below */
DELETE
FROM
        Person
WHERE
        (id, email) NOT IN (
                                SELECT
                                        MIN(id)
                                      , email
                                FROM
                                        Person
                                GROUP BY
                                        email
                           );
