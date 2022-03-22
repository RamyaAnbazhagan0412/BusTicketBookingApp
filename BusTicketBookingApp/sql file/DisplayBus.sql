DROP TABLE bus_ticket_booking_app_display;
CREATE TABLE bus_ticket_booking_app_display
(
bus_id INT PRIMARY KEY AUTO_INCREMENT,
bus_name VARCHAR(100)NOT NULL UNIQUE,
bus_from VARCHAR(100)NOT NULL,
bus_to VARCHAR(100)NOT NULL,
bus_date DATE NOT NULL,
bus_timing VARCHAR(5)
);
INSERT INTO bus_ticket_booking_app_display (bus_name,bus_from,bus_to,bus_date,bus_timing )VALUES('kumaran bus services','chengalpattu','mathurantagam',NOW(),'7:00'),
('PKR travels','chengalpattu','mathurantagam',NOW(),'7:00'),
('Diya','chengalpattu','mathurantagam',NOW(),'7:00'),
('Blue bus services','chengalpattu','mathurantagam',NOW(),'7:00'),
('Sundhara Travels','chengalpattu','mathurantagam',NOW(),'7:00'),
('Mayilvaganan','chengalpattu','mathurantagam',NOW(),'7:00'),
('Sithivinayagar','chengalpattu','mathurantagam',NOW(),'7:00'),
('vetri vel','chengalpattu','mathurantagam',NOW(),'7:00'),
('Jegan services','chengalpattu','mathurantagam',NOW(),'7:00'),
('Pratheep travels','chengalpattu','mathurantagam',NOW(),'7:00'),
('V travels','chengalpattu','mathurantagam',NOW(),'7:00');
SELECT *FROM bus_ticket_booking_app_display;
SELECT *FROM bus_ticket_booking_app_display WHERE bus_from = 'chengalpattu';