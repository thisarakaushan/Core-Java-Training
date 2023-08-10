use letsupgrade;

CREATE TABLE books (
    Title VARCHAR(255),
    Author VARCHAR(255),
    Published_Year INT
);

INSERT INTO books (Title, Author, Published_Year) VALUES
    ('Harry Potter', 'J.K. Rowling', 1997),
    ('The Great Gatsby', 'F. Scott Fitzgerald', 1925),
    ('To Kill a Mockingbird', 'Harper Lee', 1960);
    
select * from books;

SELECT Title, Author, Published_Year
FROM books;
