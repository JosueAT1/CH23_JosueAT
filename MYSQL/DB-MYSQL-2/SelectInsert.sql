-- Selecciona todo de una tabla
SELECT * FROM users;

-- Selecciona solo una columna
SELECT first_name FROM users;

-- Insertar datos a tabla pets
INSERT INTO `pets`
(first_name, fav_food, `type`, users_idusers)
VALUES
('Skyla', 'Tacos', 'Perro', 1),
('Griselo', 'Fresas', 'Nejo', 2),
('Nicky', 'Caldito con tortillitas', 'Doggo', 3),
('Pepperoni', 'Huesitos de manzanas', 'Doggo', 3);

-- Seleccionar todo pets
SELECT * FROM `pets`;

-- Filtrar por FK para identificar a owners
SELECT * FROM `pets`
WHERE users_idusers = 3;