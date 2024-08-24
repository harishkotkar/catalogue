-- -- Create Product table if it doesn't exist
-- CREATE TABLE IF NOT EXISTS product (
--     id BIGINT AUTO_INCREMENT PRIMARY KEY,
--     name VARCHAR(255) NOT NULL,
--     price DECIMAL(19, 2) NOT NULL,
--     description VARCHAR(1024),
--     category VARCHAR(255),
--     brand VARCHAR(255)
--     );
--
-- -- Insert data into Product table, ensuring that the references are valid
-- INSERT INTO product (name, price, description, category, brand)
-- VALUES ('Samsung Galaxy S21', 799.99, 'Latest Samsung smartphone','Electronics', 'Samsung');
--
-- INSERT INTO product (name, price, description, category, brand)
-- VALUES ('Samsung Galaxy S21', 799.99, 'Latest Samsung smartphone','Electronics', 'Apple');


-- Create Product table if it doesn't exist
CREATE TABLE IF NOT EXISTS product (
                                       id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                       name VARCHAR(255) NOT NULL,
    price DECIMAL(19, 2) NOT NULL,
    description VARCHAR(1024),
    category VARCHAR(255),
    brand VARCHAR(255)
    );

-- Insert data into Product table
INSERT INTO product (name, price, description, category, brand)
VALUES ('Samsung Galaxy S21', 799.99, 'Latest Samsung smartphone with 5G capability', 'Electronics', 'Samsung');

INSERT INTO product (name, price, description, category, brand)
VALUES ('Apple iPhone 12', 999.99, 'Latest Apple smartphone with A14 Bionic chip', 'Electronics', 'Apple');

INSERT INTO product (name, price, description, category, brand)
VALUES ('Sony WH-1000XM4', 349.99, 'Noise-canceling over-ear headphones', 'Electronics', 'Sony');

INSERT INTO product (name, price, description, category, brand)
VALUES ('Kindle Paperwhite', 129.99, 'E-reader with built-in light', 'Books', 'Amazon');

INSERT INTO product (name, price, description, category, brand)
VALUES ('The Great Gatsby', 10.99, 'Classic novel by F. Scott Fitzgerald', 'Books', 'Penguin Classics');

INSERT INTO product (name, price, description, category, brand)
VALUES ('Yoga Mat', 25.99, 'Durable and non-slip yoga mat', 'Fitness', 'Liforme');

INSERT INTO product (name, price, description, category, brand)
VALUES ('Instant Pot Duo', 89.99, '7-in-1 multi-use programmable pressure cooker', 'Home Appliances', 'Instant Pot');

INSERT INTO product (name, price, description, category, brand)
VALUES ('Dyson V11 Torque Drive', 599.99, 'Cordless vacuum cleaner with powerful suction', 'Home Appliances', 'Dyson');

INSERT INTO product (name, price, description, category, brand)
VALUES ('Nikon D3500', 499.99, 'Beginner-friendly DSLR camera with 24.2 MP', 'Electronics', 'Nikon');

INSERT INTO product (name, price, description, category, brand)
VALUES ('Samsung 65" QLED TV', 1399.99, '65-inch 4K QLED Smart TV', 'Electronics', 'Samsung');