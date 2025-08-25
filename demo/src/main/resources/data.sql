
Truncate Donor;
INSERT INTO Donor (name, age, phone_number, blood_group, health_issues) VALUES
('Surya Vardhan', 30, '1234567890', 'O+', 'None'),
('Alice Johnson', 25, '9876543210', 'A-', 'Asthma'),
('Michael Brown', 40, '5551234567', 'B+', 'Diabetes'),
('Emma Wilson', 35, '4449876543', 'AB-', 'None'),
('David Clark', 28, '6667778888', 'O-', 'Hypertension'),
('Sophia Martinez', 32, '9990001111', 'A+', 'None'),
('Chris Evans', 45, '1231231234', 'B-', 'Allergy'),
('Olivia Taylor', 29, '3213214321', 'AB+', 'None');


Truncate Receptor;
INSERT INTO Receptor (name, age, phone_number, organ_required, patient_life_span) VALUES
('Jane Smith', 45, '0987654321', 'Kidney', 12),
('Robert Lee', 50, '1112223333', 'Liver', 8),
('Linda Davis', 60, '2223334444', 'Heart', 5),
('James Miller', 55, '3334445555', 'Lung', 10),
('Patricia Garcia', 47, '4445556666', 'Pancreas', 7),
('Mark Wilson', 53, '5556667777', 'Kidney', 9),
('Laura Martinez', 41, '6667778888', 'Liver', 6),
('Kevin Brown', 58, '7778889999', 'Heart', 11);

Truncate Credentials;
INSERT INTO credentials (username, password) VALUES
  ('alice', 'alice123'),
  ('bob', 'bobSecure!'),
  ('charlie', 'charliePass'),
  ('RK','123');


