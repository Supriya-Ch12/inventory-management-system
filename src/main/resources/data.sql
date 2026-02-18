-- 1. Insert Suppliers first (The Parent)
INSERT INTO suppliers (id, supplier_name, contact_email)
VALUES (1, 'TechCentral', 'supply@tech.com')
ON CONFLICT (id) DO NOTHING;

-- 2. Insert Products second (The Child)
INSERT INTO products (name, stock_quantity, price, supplier_id)
VALUES ('Mechanical Keyboard', 100, 89.99, 1),
       ('Wireless Mouse', 200, 25.00, 1)
ON CONFLICT DO NOTHING;

-- 3. Insert Customers
INSERT INTO customers (first_name, last_name, email)
VALUES ('Supriya', 'V', 'priyachh12@gmail.com')
ON CONFLICT (email) DO NOTHING;