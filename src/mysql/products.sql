CREATE DATABASE products_ex CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

USE products_ex;

# * products:
#   * id: int
#   * name: varchar(100)
#   * description: varchar(1000)
#   * price: decimal (2 decimal places)

CREATE TABLE products(
    id INT AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    description VARCHAR(1000),
    price DECIMAL(9,2),
    PRIMARY KEY (id)
);

# * orders:
#   * id:int
#   * description: varchar(1000)

CREATE TABLE orders(
    id INT AUTO_INCREMENT,
    description VARCHAR(1000),
    PRIMARY KEY (id)
);

# * clients:
#   * id: int
#   * name: varchar(100)
#   * surname: varchar(100)

CREATE TABLE IF NOT EXISTS clients(
    id INT AUTO_INCREMENT,
    name VARCHAR(100),
    surname VARCHAR(100),
    PRIMARY KEY (id)
);

# * client_address:
#   * client_id: int
#   * city: varchar(100)
#   * street: varchar(100)
#   * house_nr: varchar(10)

CREATE TABLE client_address(
    id INT AUTO_INCREMENT,
    client_id INT NOT NULL UNIQUE ,
    city VARCHAR(100),
    street VARCHAR(100),
    house_nr VARCHAR(10),
    PRIMARY KEY (id),
    FOREIGN KEY (client_id) REFERENCES clients(id) ON DELETE CASCADE
);

INSERT INTO clients(name, surname) VALUES
('Janusz', 'Nowak'),
('Tomasz', 'Kowalski');

INSERT INTO client_address(client_id, city, street, house_nr) VALUES
(1, 'Wrocław', 'Kiełbaśnicza', '2'),
(2, 'Warszawa', 'Lotnicza', '16/3a');

# * opinions:
#   * description: string

CREATE TABLE opinions(
    id INT AUTO_INCREMENT,
    product_id INT NOT NULL,
    description VARCHAR(1000) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (product_id) REFERENCES products(id)
);

INSERT INTO products(name, description, price) VALUES ('Miś', 'Pluszowy miś', 25.00);
INSERT INTO opinions(product_id, description) VALUES (1, 'Rzeczywiście fajny, miękki'),
                                                     (1, 'Mój miał urwane oczko');

# * categories:
#   * id: int
#   * name: string

CREATE TABLE categories(
    id INT AUTO_INCREMENT,
    name VARCHAR(255) UNIQUE,
    PRIMARY KEY (id)
);

# * categories_sub:
#   * id: int
#   * main_id: int -- relacja z id głównej kategorii
#   * name: string

CREATE TABLE categories_sub(
    id INT AUTO_INCREMENT,
    main_id INT NOT NULL,
    name VARCHAR(255),
    PRIMARY KEY (id),
    FOREIGN KEY (main_id) REFERENCES categories(id),
    UNIQUE (main_id, name)
);

INSERT INTO categories(name) VALUE ('motoryzcja');
INSERT INTO categories_sub(main_id, name) VALUES (1, 'kola');
INSERT INTO categories_sub(main_id, name) VALUES (1, 'lakier');
INSERT INTO categories_sub(main_id, name) VALUES (1, 'szyby');

# połącz tabele products i orders relacją wiele do wielu,

CREATE TABLE products_orders(
    id INT AUTO_INCREMENT,
    product_id INT NOT NULL,
    order_id INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (product_id) REFERENCES products(id),
    FOREIGN KEY (order_id) REFERENCES orders(id)
);

INSERT INTO orders(description) VALUES ('Zamówienie 1'), ('Zamówienie 2');
INSERT INTO products_orders(product_id, order_id) VALUES (1, 1), (1, 1), (1, 1), (1, 2);

# zamówienia dla produktu o id równym 1,

SELECT o.* FROM orders o JOIN products_orders po ON po.order_id = o.id WHERE po.product_id = 1;

SELECT o.*
FROM orders o
         JOIN products_orders po ON po.order_id = o.id
WHERE po.product_id = 1;

# zamówienia dla produktu o nazwie 'Miś'

SELECT o.*
FROM orders o
         JOIN products_orders po ON po.order_id = o.id
         JOIN products p ON po.product_id = p.id
WHERE p.name = 'Miś';

# produkty dla zamówienia o id równym 1.

SELECT p.*
FROM products p
         JOIN products_orders po ON po.product_id = p.id
WHERE po.order_id = 1;

# produkty dla zamówienia z opisem zawierającym słowo "PILNE"

SELECT p.*
FROM products p
         JOIN products_orders po ON po.product_id = p.id
         JOIN orders o ON po.order_id = o.id
WHERE o.description LIKE '%PILNE%';


# wszystkie produkty, które mają opinie oraz wszystkie dostępne dla nich opinie (nie powinny występować wartości null),

SELECT * FROM products p JOIN opinions o on p.id = o.product_id;

# pobierz wszystkie produkty razem z opiniami, niezależnie od tego czy mają opinie (mogą występować wartości null),

SELECT * FROM products p LEFT JOIN opinions o on p.id = o.product_id;

# pobierz wszystkie opinie dla produktu o id = 1, wynik ma zawierać również wszystkie dane dotyczące produktu.

SELECT * FROM products p JOIN opinions o on p.id = o.product_id WHERE o.product_id = 1;


# wszystkie podkategorie kategorii o id = 1, pobrane za pomocą odpowiedniego złączenia,

SELECT * FROM categories_sub cs JOIN categories c on cs.main_id = c.id WHERE c.id = 1;

# id oraz nazwę kategorii, ale tylko tych kategorii, które mają podkategorie (skorzystaj z DISTINCT).

SELECT DISTINCT c.* FROM categories c JOIN categories_sub cs on c.id = cs.main_id;

# TESTY DLA JAVY

INSERT INTO clients(name, surname) VALUES (?, ?);

