# Proyecto

### Insertar datos
INSERT INTO doctors (create_at, first_name, last_name, name)
VALUES ('2022-10-21', 'Hernandez', 'Rivera', 'Jacinto'),
('2022-10-21', 'Perez', 'Carmona', 'Pedro'),
('2022-10-21', 'Gutierrez', 'Alvarado', 'Andres'),
('2022-10-21', 'Cortes', 'Rangel', 'Ramon');

INSERT INTO offices (create_at, flat, office_number)
VALUES ('2022-10-21', 1, 10),
('2022-10-21', 1, 5),
('2022-10-21', 3, 4),
('2022-10-21', 2, 2);

### Endpoints

Get
http://localhost:90/consultation

Post
http://localhost:90/consultation

{\
    "consultationDate": "2022-11-05",\
    "patientName": "Angel Alberto",\
    "doctorId": 3,\
    "officeId": 2\
}

