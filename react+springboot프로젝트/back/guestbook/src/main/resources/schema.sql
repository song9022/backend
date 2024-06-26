CREATE DATABASE guestbook_test;

USE guestbook_test;

CREATE TABLE guestbook_entries (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    message TEXT NOT NULL,
    date_created TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);