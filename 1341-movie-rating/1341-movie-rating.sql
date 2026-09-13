# Write your MySQL query statement below
(
    SELECT
            U.name AS results
    FROM
            MovieRating M
    INNER JOIN 
            Users U
    ON
            M.user_id = U.user_id
    GROUP BY
            M.user_id
    ORDER BY
            COUNT(DISTINCT M.movie_id) DESC, U.name
    LIMIT
            1
)
UNION ALL
(
    SELECT
            M2.title AS results
    FROM
            MovieRating M1
    INNER JOIN 
            Movies M2
    ON
            M1.movie_id = M2.movie_id
    AND
            DATE_FORMAT(M1.created_at, '%Y-%m') = '2020-02'
    GROUP BY
            M1.movie_id
    ORDER BY
            ROUND(AVG(M1.rating), 1) DESC, M2.title
    LIMIT 
            1
)
        