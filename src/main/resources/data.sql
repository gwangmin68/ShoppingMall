use shopping;

insert into user(account, password, username, telephone, phone, postcode, address, email)
values
       ('user1', '1234', 'test1', '010-0000-0001', '010-0000-0001', '1', 'address1', 'user1@dgsw.hs.kr'),
       ('user2', '1234', 'test2', '010-0000-0002', '010-0000-0002', '2', 'address2', 'user2@dgsw.hs.kr'),
       ('user3', '1234', 'test3', '010-0000-0003', '010-0000-0003', '3', 'address3', 'user3@dgsw.hs.kr'),
       ('user4', '1234', 'test4', '010-0000-0004', '010-0000-0004', '4', 'address4', 'user4@dgsw.hs.kr'),
       ('user5', '1234', 'test5', '010-0000-0005', '010-0000-0005', '5', 'address5', 'user5@dgsw.hs.kr');

insert into product(name, content, price)
values
        ('product1', 'This is product1', 10000),
        ('product2', 'This is product2', 20000),
        ('product3', 'This is product3', 30000);

insert into user_attach(userId, filename, filepath)
values
        (1, 'user1-attach', 'path/user1-attach'),
        (2, 'user2-attach', 'path/user2-attach'),
        (3, 'user3-attach', 'path/user3-attach'),
        (4, 'user4-attach', 'path/user4-attach'),
        (5, 'user5-attach', 'path/user5-attach');

insert into product_attach(productId, filename, filepath)
values
        (1, 'product1-attach', 'path/product1-attach'),
        (2, 'product2-attach', 'path/product2-attach'),
        (3, 'product3-attach', 'path/product3-attach'),
        (4, 'product4-attach', 'path/product4-attach'),
        (5, 'product5-attach', 'path/product5-attach');