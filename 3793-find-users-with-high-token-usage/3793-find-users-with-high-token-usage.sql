/* Write your PL/SQL query statement below */
SELECT
        *
FROM
        (
            SELECT
                    user_id
                  , COUNT(*) AS prompt_count
                  , ROUND(AVG(tokens), 2) AS avg_tokens
            FROM
                    prompts
            GROUP BY
                    user_id
            HAVING
                    COUNT(*) >= 3
        ) A
WHERE
        EXISTS (
                    SELECT 
                            1
                    FROM
                            prompts
                    WHERE
                            user_id = A.user_id
                    AND
                            tokens > A.avg_tokens
               )
ORDER BY
        A.avg_tokens DESC, A.user_id;
