/*SQL query-based questions along with their respective SQL queries*/

/*1. Retrieve all columns from the "employees" table*/

SELECT * FROM employees;

/*2. Display the names and ages of employees from the "employees" table*/

SELECT NAME, age FROM employees;

/*3. Find the total number of employees in the "employees" table*/

SELECT COUNT(*) AS total_employees FROM employees;

/*4. Show the unique cities where employees are located from the "employees" table*/

SELECT DISTINCT city FROM employees;

/*5. Retrieve the employees with a salary higher than $50,000 from the "employees" table*/

SELECT * FROM employees WHERE salary > 50000;

/*6. List the names of employees in ascending order based on their ages from the "employees" table*/

SELECT NAME FROM employees ORDER BY age ASC;

/*7. Calculate the average salary of all employees in the "employees" table*/

SELECT AVG(salary) AS average_salary FROM employees;

/*8. Find the employees who joined the company after January 1st, 2023, from the "employees" table*/

SELECT * FROM employees WHERE join_date > '2023-01-01';

/*9. Display the names of employees whose names start with 'J' from the "employees" table*/

SELECT NAME FROM employees WHERE NAME LIKE 'j%';

/*10. Retrieve the highest and lowest salary from the "employees" table*/

SELECT 
    MAX(salary) AS highest_salary, MIN(salary) AS lowest_salary
FROM
    employees;


/*Please keep in mind that these examples assume there is a table named "employees" with r
elevant columns like name, age, salary, city, and join_date.
Here are a few more SQL query-based examples*/

/*11. Retrieve the names and salaries of employees who work in the "Sales" department from the 
"employees" table*/

SELECT NAME, salary FROM employees WHERE department = 'Sales';

/*12. Display the top 5 highest-paid employees from the "employees" table*/

SELECT NAME, salary FROM employees ORDER BY salary DESC LIMIT 5;

/*13. Find the average age of employees who work in the "Engineering" department from the 
"employees" table*/

SELECT AVG(age) AS average_age FROM employees 
WHERE department = 'Engineering';

/*14. List the names of employees who have not been assigned to any department from the 
"employees" table*/

SELECT NAMES FROM employees WHERE department IS NULL;

/*15. Retrieve the employees whose names contain "deep" from the "employees" table*/

SELECT * FROM employees WHERE NAME LIKE '%deep%';

/*16. Show the number of employees in each department from the "employees" table*/

SELECT department, COUNT(*) AS number_employees 
FROM employees
GROUP BY department;

/*17. Calculate the total salary expense for the company from the "employees" table*/

SELECT SUM(salary) AS total_salary_expense FROM employees;

/*18. Find the names and salaries of employees who earn more than the average salary from the 
"employees" table*/

SELECT NAME,salary FROM employees 
WHERE salary > (SELECT AVG(salary) FROM employees);

/*19. Display the names of employees in alphabetical order from the "employees" table*/

SELECT NAME FROM employees ORDER BY NAME ASC;

/*20. Retrieve the employees who joined the company in the year 2022 from the "employees" table*/

SELECT * FROM employees WHERE YEAR(join_date) = 2022;

/*Feel free to use and modify these examples to suit your specific database and data requirements. 
If you have any more SQL-related questions or need further assistance, just let us  know!*/
 
/*SQL query examples that involve the GROUP BY and HAVING clauses*/

/*21. Retrieve the total sales amount for each product category from the "sales" table*/

SELECT product_category, SUM(sales_amount) AS total_sales_amount
FROM sales
GROUP BY product_category;

/*22. Show the average salary for each job title from the "employees" table, considering only 
job titles with more than five employees*/

SELECT job_title, AVG(salary) AS average_salary
FROM employees
GROUP BY job_title
HAVING COUNT(*) > 5;

/*23. Find the number of orders placed by each customer from the "orders" table, only including 
customers who placed more than ten orders*/

SELECT customer_id, COUNT(*) AS number_orders
FROM orders
GROUP BY customer_id
HAVING COUNT(*) > 10;

/*24. Display the total revenue for each year from the "sales" table, only considering years with 
revenue greater than $1 million*/

SELECT YEAR(sale_date) AS sales_year, SUM(revenue) 
AS total_revenue FROM sales
GROUP BY sales_year
HAVING SUM(revenue) > 1000000;

/*25. Retrieve the product names and their prices from the "products" table, excluding products 
with prices below $50, and group them by their respective categories*/

SELECT product_name, product_category, price
FROM products
WHERE price > 50
GROUP BY product_name, product_category, price;

/*26. Show the names of employees and the number of tasks assigned to them from the "tasks" table, 
but only for employees with more than five assigned tasks*/

SELECT employee_name, COUNT(*) AS number_tasks_assigned
FROM tasks
GROUP BY employee_name
HAVING COUNT(*) > 5;

/*27. Find the department names and their average employee salaries, considering only departments 
with an average salary greater than $60,000*/

SELECT department_name, AVG(salary) AS average_salary
FROM employees
GROUP BY department_name
HAVING AVG(salary) > 60000;

/*28. Display the number of employees hired in each year, only including years with more than ten 
new hires, from the "employees" table*/

SELECT YEAR(join_date) AS hire_year, COUNT(*) AS number_hires
FROM employees
GROUP BY hire_year
HAVING COUNT(*) > 10;

/*29. Retrieve the customer names and the total number of products they have ordered from the "orders" 
table, but only for customers who ordered more than 50 products*/

SELECT customer_name, COUNT(*) AS number_product_ordered
FROM orders
GROUP BY customer_name
HAVING COUNT(*) > 50;

/*30. Show the names of products and the number of units sold for each product, only considering 
products with more than 100 units sold from the "sales" table*/

SELECT product_name, SUM(units_sold) AS total_units_sold
FROM sales
GROUP BY product_name
HAVING su (units_sold) > 100;

/*The GROUP BY clause is used to group rows based on a specified column or expression, while the 
HAVING clause is used to filter the grouped results. 
These clauses are powerful for aggregating and analyzing data within SQL queries.*/

/*SQL query examples that involve the ORDER BY clause*/

/*31. Retrieve all columns from the "products" table, ordered by product name in ascending order*/

SELECT * FROM products ORDER BY product_name ASC;

/*32. Show the names and salaries of employees from the "employees" table, ordered by salary in 
descending order*/

SELECT NAME, salary FROM employees ORDER BY salary DESC;


/*33. Find the customer names and their total order amounts from the "orders" table, ordered by order 
amount in descending order*/

SELECT customer_name, SUM(order_amount) AS total_order_amount
FROM orders
GROUP BY customer_name
ORDER BY total_order_amount DESC;

/*34. Display the product names and prices from the "products" table, ordered by price in ascending order*/

SELECT product_name, price FROM products ORDER BY price ASC;

/*35. Retrieve the employee names and the number of tasks assigned to them from the "tasks" table, 
ordered by the number of tasks in descending order*/

SELECT employee_name, COUNT(*) AS number_tasks_assigned
FROM tasks
GROUP BY employee_name
ORDER BY number_tasks_aasigned DESC;

/*36. Show the customer names and the order dates from the "orders" table, ordered by order date in 
ascending order*/

SELECT customer_name, order_date FROM orders 
ORDER BY order_date ASC;

/*37. Find the product names and the quantity in stock from the "products" table, ordered by quantity 
in stock in descending order*/

SELECT product_name, quantity_in_stock 
FROM products 
ORDER BY quantity_in_stock DESC;

/*38. Display the employee names and their hire dates from the "employees" table, ordered by hire date 
in ascending order*/

SELECT NAME, hire_date FROM employees ORDER BY hire_date ASC;

/*39. Retrieve the customer names and the total number of products they have ordered from the "orders" 
table, ordered by the number of products in descending order*/

SELECT customer_name, COUNT(*) AS number_products_ordered
FROM orders
GROUP BY customer_name
ORDER BY number_products_ordered DESC;

/*40. Show the names of employees from the "employees" table, ordered by the length of their names in 
ascending order*/

SELECT NAME FROM employees ORDER BY LENGTH(NAME) ASC;

/*The ORDER BY clause is used to sort the result set of a query based on specified columns or expressions.
It allows you to arrange data in ascending or descending order, providing valuable control over the
presentation of your results.
Subqueries, also known as nested queries or inner queries, are queries embedded within another query. 
They can be used in various SQL statements like SELECT, INSERT, UPDATE, DELETE, and more. Here are 
some SQL query examples that involve subqueries*/

/*41. Retrieve the names of employees who have a salary greater than the average salary in the 
"employees" table*/

SELECT NAME FROM employees
WHERE salary > (SELECT AVG(salary) FROM employees);

/*42. Show the names of products that are currently out of stock from the "products" table*/

SELECT product_name FROM products
WHERE quantity_in_stock = 0;

/*43. Find the employees who work in the same department as "John Smith" from the "employees" table*/

SELECT NAME FROM employees
WHERE department = 
(SELECT department FROM employees 
WHERE NAME = 'John Smith');

/*44. Retrieve the orders placed by customers who have ordered more than ten products from the "orders" 
table*/

SELECT * FROM orders
WHERE customer_id IN 
(SELECT customer_id FROM orders 
GROUP BY customer_id 
HAVING COUNT(*) > 10);

/*45. Show the names of employees who earn more than the highest-paid employee in the "employees" table*/

SELECT NAME FROM employees
WHERE salary > (SELECT MAX(salary) FROM employees);

/*46. Find the product names and their prices from the "products" table, where the price is greater than 
the average price of products*/

SELECT product_name, price
FROM products
WHERE price > (SELECT AVG(price) FROM products);

/*47. Display the customer names and the total order amounts from the "orders" table, where the order 
amount is greater than the average order amount*/

SELECT customer_name, SUM(order_amount) AS total_order_amount
FROM orders GROUP BY customer_name
HAVING SUM(order_amount) > (SELECT AVG(order_amount) FROM orders);

/*48. Retrieve the employee names and their hire dates from the "employees" table, where the hire date 
is earlier than the hire date of "John Doe"*/

SELECT NAME, hire_date
FROM employees
WHERE hire_date < 
(SELECT hire_date FROM employee WHERE NAME = 'John Doe');

/*49. Show the product names and their respective category names from the "products" and "categories" 
tables using a subquery*/

SELECT product_name, 
(SELECT category_name FROM categories 
WHERE categories.category_id = product.category_id)
AS category_name FROM products;

/*50. Find the customers who have not placed any orders from the "customers" table*/

SELECT * FROM customers
WHERE customer_id NOT IN 
(SELECT DISTINCT customer_id FROM orders);

/*Subqueries provide a powerful way to combine and filter data from multiple tables or to perform 
complex calculations. They are a fundamental part of SQL and can help you write more efficient and 
concise queries. If you have more questions or need further assistance, feel free to ask!
SQL offers various string functions to manipulate text data within queries. 
Here are some examples of SQL string functions*/

/*51. CONCAT: Concatenate two or more strings together.*/

SELECT CONCAT(first_name, ' ', last_name) AS full_name
FROM employees;

/*52. UPPER: Convert a string to uppercase.*/

SELECT UPPER(product_name) AS uppercase_name FROM products;

/*53. LOWER: Convert a string to lowercase.*/

SELECT LOWER(city) AS lowercase_city FROM customers;

/*54. SUBSTRING: Extract a portion of a string based on a specified starting position and length.*/

SELECT SUBSTRING(product_name, 1, 5) AS first_five_chars FROM products;

/*55. LENGTH: Find the length of a string.*/

SELECT product_name, LENGTH(product_name) AS name_length

FROM products;

/*56. TRIM: Remove leading and trailing spaces from a string.*/

SELECT TRIM(' ' FROM product_name) AS trimmed_name
FROM products;

/*57. LEFT: Extract a specified number of characters from the beginning of a string.*/

SELECT LEFT(product_name, 3) AS first_three_chars FROM products;

/*58. RIGHT: Extract a specified number of characters from the end of a string.*/

SELECT RIGHT(product_code, 2) AS last_two_chars FROM products;

/*59. REPLACE: Replace occurrences of a substring within a string with another substring.*/

SELECT REPLACE(DESCRIPTION, 'old_value', 'new_value') 
AS updated_description FROM products;

/*60. INSTR/CHARINDEX: Find the position of a substring within a string.*/

SELECT product_name, INSTR(product_name, 'search_string') 
AS POSITION FROM products;

/*These are just a few examples of the many string functions available in SQL. They can help you manipulate, format, and extract information from text data efficiently within your queries. If you have more questions or need further assistance, feel free to ask!
Here are some basic SQL clauses with examples*/

/*61. SELECT clause: Used to retrieve data from a database table.*/

SELECT column1, column2 FROM TABLE_NAME;

/*62. FROM clause: Specifies the table(s) from which to retrieve data.*/

SELECT column1, column2 FROM employees;

/*63. WHERE clause: Filters rows based on specified conditions.*/

SELECT column1, column2 FROM employees
WHERE department = 'Sales';

/*64. ORDER BY clause: Sorts the result set based on specified columns or expressions.*/

SELECT column1, column2 FROM products
ORDER BY product_name ASC;

/*65. GROUP BY clause: Groups rows based on specified columns or expressions.*/

SELECT department, COUNT(*) AS number_employees 
FROM employees   
GROUP BY department;

/*66. HAVING clause: Filters the grouped rows based on specified conditions.*/

SELECT department, AVG(salary) AS average_salary
FROM employees GROUP BY department
HAVING AVG(salary) > 50000;

/*67. JOIN clause: Combines rows from two or more tables based on a related column between them.*/

SELECT employee.name, department.department_name
FROM employees
JOIN departments ON employee.department_id = department.department_id;

/*68. INSERT INTO clause: Inserts new rows into a table.*/

INSERT INTO employees(NAME, age, salary)
VALUES('John Doe', 30, 50000);

/*69. UPDATE clause: Modifies existing rows in a table.*/

/*query 1*/
UPDATE employees SET salary = 60000
WHERE department = 'Sales';

/*query 2*/
UPDATE student SET(firstname = UPPER(firstname)) AND 
(lastname = UPPER(lastname)) WHERE gender = 'female';

/*query 3*/
UPDATE student CASE
WHEN gender = 'male' 
THEN CONCAT('Mr.', firstname)
WHEN gender = 'female' 
THEN CONCAT('Ms.', firstname); 


/*query 4*/
/*Permant*/
UPDATE student SET gender = UPPER(gender);

/*Temporary*/
SELECT UPPER(gender) AS gender FROM student;

/*70. DELETE FROM clause: Deletes rows from a table based on specified conditions.*/

DELETE FROM employees WHERE age > 65; 


/*Truncate vs Delete*/

/*Truncate and Delete are both SQL commands used to remove data from a table, but they have different
behaviors and use cases.

TRUNCATE:
●TRUNCATE is a DDL (Data Definition Language) command.
●It removes all rows from a table, but the table structure, including columns and indexes, remains 
intact.
●It is a faster operation compared to DELETE because it does not generate individual row deletion 
logs and is more efficient for large tables.
●TRUNCATE cannot be used on tables with foreign key constraints, as it does not invoke any triggers 
or fire any constraints.
●The operation cannot be rolled back (in most database systems), and the data cannot be recovered 
once it is truncated.
Example:*/ 

TRUNCATE TABLE employees;

/*DELETE:
●DELETE is a DML (Data Manipulation Language) command.
●It removes specific rows from a table based on a given condition, using a WHERE clause.
●DELETE generates individual row deletion logs and can be slower for large tables compared to TRUNCATE.
●DELETE can be used on tables with foreign key constraints, and it will respect triggers and constraints during the operation.
●The operation can be rolled back (if within a transaction), and the deleted data can be recovered (until the transaction is committed).
Example:*/
DELETE FROM employees WHERE department = 'HR';


/*SQL joins
Let's assume we have two tables: "employees" and "departments".
INNER JOIN:
●Returns only the rows with matching values in both tables.*/

SELECT employees.name, departments.department_name
FROM employees
INNER JOIN departments ON employees.department_id = departments.id;

/*LEFT JOIN (or LEFT OUTER JOIN):
●Returns all rows from the left table and the matching rows from the right table.*/

SELECT employees.name, departments.department_name
FROM employees
LEFT JOIN departments ON employees.department_id = departments.id;

/*RIGHT JOIN (or RIGHT OUTER JOIN):
●Returns all rows from the right table and the matching rows from the left table.*/

SELECT employees.name, departments.department_name
FROM employees
RIGHT JOIN departments ON employees.department_id = departments.id;

/*FULL OUTER JOIN:
●Returns all rows when there is a match in either the left or the right table.*/

SELECT employees.name, departments.department_name
FROM employees
FULL OUTER JOIN departments ON employees.department_id = departments.id;

/*SELF JOIN:
●Joins a table with itself, useful for comparing rows within the same table.*/

SELECT e1.name AS employee_name, e2.name AS manager_name
FROM employees e1
INNER JOIN employees e2 ON e1.manager_id = e2.employee_id;

/*CROSS JOIN:
●Generates the Cartesian product of two tables, all possible combinations of rows from both tables.*/

SELECT employees.name, departments.department_name
FROM employees
CROSS JOIN departments;

/*NATURAL JOIN:
●Performs an implicit join based on all columns with the same name in both tables.*/

SELECT name, department_name
FROM employees
NATURAL JOIN departments;