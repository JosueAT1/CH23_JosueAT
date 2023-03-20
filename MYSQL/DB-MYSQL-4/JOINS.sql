-- INNER JOIN
-- T.STUDENT T.COUNTRIES

SELECT * FROM students;
SELECT * FROM countries;
SELECT * FROM idtypes;
SELECT * FROM courses_has_students;
SELECT * FROM courses;
SELECT * FROM modules;




-- Encontrar a que pais pertencen
SELECT students.*, countries.name, countries.code -- .* para traer todo de una tabla
FROM students
INNER JOIN countries
ON 
students.nationality = countries.idCountries;

SELECT 
students.idStudent AS 'ID', 
students.name AS 'Nombre', 
students.last_name AS 'Apellido', 
countries.name AS 'Pais de origen', 
countries.code AS 'Codigo del pais' -- .* para traer todo de una tabla
FROM students
INNER JOIN countries
ON 
students.nationality = countries.idCountries;

-- Encontramos que tipo de ID tiene la raza
SELECT
students.idStudent AS 'ID',
students.name AS 'Nombre',
students.last_name AS 'Apellido',
idtypes.name AS 'Tipo de ID de registro'
FROM students
INNER JOIN idtypes
ON students.IdType_id = idtypes.id_idTypes;

-- Abreviaciones
SELECT
	t1.name, 
	t2.name, 
	t2.code
FROM students t1
INNER JOIN countries t2
ON t1.nationality = t2.idCountries;

-- Estudiantes que esten registrades en un curso.
-- Nombre, id, apellido, curso al que estan registrades
SELECT 
	students.name,
    students.idStudent,
    students.last_name,
    courses_has_students.course_code
FROM students t1
INNER JOIN courses_has_students
ON students.idStudent = courses_has_students.students_id_student;

SELECT 
	t1.name,
    t1.last_name,
    t2.course_code,
    t3.name,
    t3.credits
FROM students t1
INNER JOIN courses_has_students t2
ON t1.idStudent = t2.students_id_student
INNER JOIN courses t3
ON t2.course_code = t3.code;

-- GROUP BY sirve para agrupar datos agregados/coincidentes
SELECT 
	t1.course_code As 'Codigo del curso',
    t2.code AS 'Codigo de curso',
    t2.name AS 'Curso'
FROM courses_has_students t1
INNER JOIN courses t2
ON t1.course_code = t2.code
GROUP BY t2.code;

-- Encontrar estudiantes que sean del pais 125
-- Contar estudiantes que pertenezcan al curso JAVA-1
-- Contar estudiantes por cada modulo
-- Encontrar estudiantes SIN curso

SELECT 
	students.name,
	countries.idCountries
FROM students
INNER JOIN countries
ON students.nationality = countries.idCountries
WHERE idCountries = 125;


SELECT 
	students.name,
	courses_has_students.course_code
FROM students
INNER JOIN courses_has_students
ON students.idStudent = courses_has_students.students_id_student
WHERE course_code = 'JAVA-1';

SELECT 
	students.name,
	courses_has_students.course_code
FROM students
INNER JOIN courses_has_students
ON students.idStudent = courses_has_students.students_id_student
WHERE course_code IS NULL;

SELECT
	t4.name AS 'modulo',
	count(t1.idStudent) AS 'Numero de estudiantes'
FROM students t1
JOIN courses_has_students t2
ON t1.idStudent = t2.students_id_student
JOIN courses t3
ON t2.course_code = t3.code
JOIN modules t4
ON t3.module_code = t4.code
group by t4.code
order by count(t1.idStudent);


	
	





