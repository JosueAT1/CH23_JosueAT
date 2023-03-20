-- USE business;

-- Revisar employee
select * from employee;

-- ALIAS - cambia temporalmente el nombre de nuestras columnas
select last_name as 'Apellido' from employee;

-- ALIAS ++
select 
	employee_id as 'ID',
    first_name as 'Nombre',
    last_name as 'Apellido',
    departament as 'Departamento'
FROM employee;

-- Filtrar por nombre
-- BUSCAR A Monika
SELECT * FROM employee
WHERE first_name = 'Monika';

-- Filtran doble
SELECT * FROM employee
WHERE salary = 500000 AND first_name = 'Vivek';

-- Filtran por NOT
SELECT * FROM employee
WHERE NOT first_name = 'Barrack';

-- Filtrar por doble negacion 
SELECT * FROM employee
WHERE NOT first_name = 'Santiago' AND NOT first_name = 'Ian';

-- Ordenamientos
-- ORDER BY 
-- DEFAULT es orden Ascendente
SELECT * FROM employee
ORDER BY department ASC;

-- DEFAULT es orden descendente
SELECT * FROM employee
ORDER BY department DESC;

SELECT * FROM employee
ORDER BY department ASC, last_name DESC;

-- GROUP BY
SELECT * FROM employee
GROUP BY salary;

-- IN
SELECT * FROM employee
WHERE employee_id IN (1, 3, 7, 8, 5);

-- BETWEEN
SELECT * FROM employee
WHERE salary BETWEEN 200000 AND 500000;

-- BETWEEN NOT
SELECT * FROM employee
WHERE salary NOT BETWEEN 200000 AND 500000;

-- LIMIT
SELECT * FROM employee
LIMIT 5;

-- LIMIT + OFFSET
SELECT * FROM employee
LIMIT 3 OFFSET 3;

-- LIKE 
SELECT * FROM employee
WHERE last_name LIKE '%B';

SELECT * FROM employee
WHERE last_name LIKE '%A';

SELECT * FROM employee
WHERE last_name LIKE BINARY '%a';

-- LIKE++
SELECT * FROM employee
WHERE join_date LIKE '%02%';

-- UPDATE INFO
UPDATE employee
	SET salary = 300000
WHERE employee_id = 5;

SELECT * FROM employee;