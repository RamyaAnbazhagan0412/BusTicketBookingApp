DROP TABLE bus_ticket_booking_app_registration;
CREATE TABLE bus_ticket_booking_app_registration
(
s_no INT AUTO_INCREMENT UNIQUE PRIMARY KEY,
full_name  VARCHAR(50)NOT NULL,
email_id VARCHAR(50)NOT NULL UNIQUE,
PASSWORD VARCHAR(50)NOT NULL UNIQUE,
phone_number BIGINT NOT NULL UNIQUE
);

SELECT*FROM bus_ticket_booking_app_registration;
INSERT INTO bus_ticket_booking_app_registration(full_name,email_id,PASSWORD,phone_number)VALUES('Ramya','aya0412@gmail.com','2vtdjh58726','9940889046');
INSERT INTO bus_ticket_booking_app_registration(full_name,email_id,PASSWORD,phone_number)VALUES('Ram','aram0412@gmail.com','2xhjh58726','9940995046');
INSERT INTO bus_ticket_booking_app_registration(full_name,email_id,PASSWORD,phone_number)VALUES('R','ar0412@gmail.com','2xhjh2986','9909995046');
