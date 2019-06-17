use shopping;

insert into user(account, password, username, email)
values
       ('user1', '1234', 'test1', 'user1@dgsw.hs.kr'),
       ('user2', '1234', 'test2', 'user2@dgsw.hs.kr'),
       ('user3', '1234', 'test3', 'user3@dgsw.hs.kr'),
       ('user4', '1234', 'test4', 'user4@dgsw.hs.kr'),
       ('user5', '1234', 'test5', 'user5@dgsw.hs.kr');

insert into product(name, explain, price)
values
        ('상품1', '상품1입니다', 10000),
        ('상품2', '상품2입니다', 20000),
        ('상품3', '상품3입니다', 30000),