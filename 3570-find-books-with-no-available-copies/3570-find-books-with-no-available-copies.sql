# Write your MySQL query statement below
SELECT
        l.book_id
      , l.title
      , l.author
      , l.genre
      , l.publication_year
      , l.total_copies AS current_borrowers
FROM
        library_books l
WHERE
        l.total_copies = (
                            SELECT COUNT(*)
                            FROM borrowing_records b
                            WHERE l.book_id = b.book_id
                            AND b.return_date IS NULL
                         )
ORDER BY
        current_borrowers DESC, title;
