CREATE DATABASE cinemas_ex CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

USE cinemas_ex;

# * cinemas:
#   * id: int
#   * name: varchar(100)
#   * address: varchar(200)

CREATE TABLE cinemas(
    id INT AUTO_INCREMENT,
    name VARCHAR(100),
    address VARCHAR(200),
    PRIMARY KEY (id)
);

# * movies:
#   * id: int
#   * title: varchar(100)
#   * description: varchar(1000)
#   * rating: decimal (2 decimal places)

CREATE TABLE movies(
    id INT AUTO_INCREMENT,
    title VARCHAR(100) NOT NULL,
    description VARCHAR(1000),
    rating DECIMAL(4,2) CHECK (rating BETWEEN 0.01 AND 10.00),
    PRIMARY KEY (id)
);

# * tickets:
#   * id: int
#   * quantity: int
#   * price: decimal (2 decimal places)
#   * status: int (1 - opłacony, 0 - nie opłacony)

CREATE TABLE tickets(
    id INT AUTO_INCREMENT,
    quantity INT DEFAULT 1,
    price DECIMAL(9,2),
    # status INT DEFAULT 0,
    # status INT DEFAULT 0 CHECK (status IN (0,1)),
    status BIT DEFAULT 0,
    PRIMARY KEY (id)
);

# * payments:
#   * id: int
#   * type: char(10) (Zakładamy, że są trzy typy płatności: `cash`, `transfer` lub `card`).
#   * payment_date: date

CREATE TABLE payments(
    id INT AUTO_INCREMENT,
#     type CHAR(10) NOT NULL,
#     type CHAR(10) NOT NULL CHECK (type IN ('cash','transfer','card')),
    type ENUM ('cash','transfer','card'),
    payment_date DATE,
    PRIMARY KEY (id)
);

# Dodaj do tabeli tickets kolumnę priceUSD, przechowującą cenę biletu w USD.

ALTER TABLE tickets ADD COLUMN price_usd DECIMAL(9,2);

# Dodaj do tabeli movies kolumnę director typ char(80), przechowującą imię i nazwisko reżysera.

ALTER TABLE movies ADD COLUMN director CHAR(80);

# Zmień w tabeli movies kolumnę director na typ varchar(50).

ALTER TABLE movies MODIFY COLUMN director VARCHAR(50);

# ALTER TABLE movies RENAME COLUMN director TO dir;
# ALTER TABLE movies RENAME COLUMN dir TO director;

#  Usuń kolumnę priceUSD z tabeli tickets.

ALTER TABLE tickets DROP COLUMN price_usd;

# Dodające do tabeli movies kolumnę watchCount, przechowującą ilość wyświetleń filmu.

ALTER TABLE movies ADD COLUMN watch_count INT DEFAULT 0;

# Dodające do tabeli movies kolumnę isTop, przechowującą wartość tinyint (domyślnie wartość 0) o tym czy film jest hitem.

ALTER TABLE movies ADD COLUMN is_top BIT DEFAULT 0;

# Dodające do tabeli cinemas kolumnę openTime, przechowującą godzinę otwarcia.

ALTER TABLE cinemas ADD COLUMN open_time TIME DEFAULT '08:00:00';

# Dodające do tabeli cinemas kolumnę closeTime, przechowującą godzinę zamknięcia.

ALTER TABLE cinemas ADD COLUMN close_time TIME DEFAULT '23:59:00';

# liczbę wszystkich biletów,

SELECT COUNT(*) FROM tickets;

# liczbę wszystkich płatności, grupując je po kolumnie type,

SELECT type, COUNT(*) FROM payments GROUP BY type;

# średnią cenę biletu,

SELECT AVG(price / quantity) FROM tickets;

# pięć ostatnich płatności, zaczynając od drugiej,

SELECT * FROM payments ORDER BY payment_date DESC LIMIT 5 OFFSET 1;

# listę wszystkich płatności (pogrupowanych po kolumnie type), których liczba będzie większa niż 2,

SELECT type, COUNT(*) FROM payments GROUP BY type HAVING COUNT(*) > 2;

SELECT type, COUNT(*) as size FROM payments GROUP BY type HAVING size > 2;

# sumę ilości SUM(quantity) wszystkich biletów, których cena jest większa niż 23,15.

SELECT sum(quantity) FROM tickets WHERE price > 23.15;

# wszystkie filmy na literę W,

SELECT * FROM movies WHERE title LIKE 'W%';

# wszystkie bilety, których cena jest większa niż 15.30,

SELECT * FROM tickets WHERE price > 15.30;

# wszystkie bilety, których liczba jest większa niż 3,

SELECT * FROM tickets WHERE quantity > 3;

# wszystkie filmy, które mają rating większy niż 6.5,

SELECT * FROM movies WHERE rating > 6.5;

# film z największą wartością rating (wykorzystaj ORDER BY oraz LIMIT).

SELECT * FROM movies ORDER BY rating DESC LIMIT 1;

# zmieniające adres na Stadion Narodowy dla kin, których nazwa kończy się na z,

UPDATE cinemas SET address = 'Stadion Narodowy' WHERE name LIKE '%z';

# usuwające płatności, których data jest starsza niż 4 dni od aktualnego czasu (z dokładnością do sekundy), Wybierz i wykorzystaj w tym celu odpowiednie funkcje MySQL. Zestawienie dostępnych funkcji: Date and Time Functions

DELETE FROM payments WHERE CURRENT_TIMESTAMP > (payment_date + interval 4 day + interval 8 minute);

# zmieniające rating filmu na 5.4 dla filmów, których opis jest dłuższy niż 40 znaków – poszukaj funkcji MySQL, która sprawdza liczbę znaków,

UPDATE movies SET rating = 5.4 WHERE char_length(description) > 40;

# zmniejszające cenę biletu o 50%, jeśli ich liczba jest większa niż 10, zapisz je jako pojedyncze zapytanie SQL.

UPDATE tickets SET price = price * 0.5 WHERE quantity > 10;

# płatność musi być przypisana do biletu (dodaj klucz obcy do tabeli payments)

ALTER TABLE payments ADD COLUMN ticket_id INT;

ALTER TABLE payments ADD FOREIGN KEY (ticket_id) REFERENCES tickets(id);

SELECT * FROM tickets JOIN payments ON tickets.id = payments.ticket_id;

INSERT INTO payments(type, payment_date, ticket_id) VALUES ('cash', '2021-05-03', 1);
INSERT INTO payments(type, payment_date, ticket_id) VALUES ('transfer', '2021-05-08', 6);

# połącz tabele cinemas i movies relacją wiele do wielu (film może być wyświetlany w wielu kinach, kino może mieć wiele filmów).

CREATE TABLE cinemas_movies(
    id INT AUTO_INCREMENT,
    cinema_id INT NOT NULL ,
    movie_id INT NOT NULL ,
    PRIMARY KEY (id),
    FOREIGN KEY (cinema_id) REFERENCES cinemas(id),
    FOREIGN KEY (movie_id) REFERENCES  movies(id),
    UNIQUE (cinema_id, movie_id)
);

INSERT INTO cinemas_movies (movie_id, cinema_id) VALUES (1,5);
# INSERT NA PODSTAWIE ZAPYTANIA
INSERT INTO cinemas_movies (movie_id, cinema_id) SELECT 1,5;

INSERT INTO cinemas_movies (movie_id, cinema_id)
    (
        SELECT (
                   SELECT id
                   FROM movies
                   ORDER BY RAND()
                   LIMIT 1
               ),
               (
                   SELECT id
                   FROM cinemas
                   ORDER BY RAND()
                   LIMIT 1
               )
        FROM movies
    );

# Wszystkie bilety które zostały opłacone gotówką (czyli type = cash).

SELECT * FROM tickets, payments;
SELECT * FROM tickets JOIN payments ON tickets.id = payments.ticket_id WHERE payments.type = 'cash';

# Użycie aliasów
SELECT * FROM tickets AS t JOIN payments AS p ON t.id = p.ticket_id WHERE p.type = 'cash';

# Krótsze użycie aliasów
SELECT * FROM tickets t JOIN payments p ON t.id = p.ticket_id WHERE p.type = 'cash';

# Tylko część o biletach
SELECT t.* FROM tickets t JOIN payments p ON t.id = p.ticket_id WHERE p.type = 'cash';

# Wszystkie bilety które nie zostały jeszcze opłacone.

SELECT * FROM tickets t LEFT JOIN payments p ON t.id = p.ticket_id WHERE p.id IS NULL;

# Tylko część o biletach
SELECT t.* FROM tickets t LEFT JOIN payments p ON t.id = p.ticket_id WHERE p.id IS NULL;


# kina w którym wyświetlany jest film o id równym 1,

SELECT c.* FROM cinemas c JOIN cinemas_movies cm on c.id = cm.cinema_id WHERE cm.movie_id = 1;

# filmy wyświetlane w kinie o id równym 1.

SELECT m.* FROM movies m JOIN cinemas_movies cm on m.id = cm.movie_id WHERE cm.cinema_id = 1;





