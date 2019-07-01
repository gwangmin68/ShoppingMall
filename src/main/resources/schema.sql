use shopping;

drop table if exists product;
drop table if exists user;
drop table if exists user_attach;
drop table if exists product_attach;
drop table if exists basket;

create table user (
    id bigint primary key auto_increment,
    account varchar(100) not null unique,
    password varchar(100),
    username varchar(30),
    telephone varchar(100),
    phone varchar(100),
    postcode varchar(100),
    address varchar(100),
    email varchar(50) not null unique,
    created datetime default current_timestamp,
    updated datetime default current_timestamp on update current_timestamp
) engine=InnodB default charset=utf8mb4;

create table product(
    id bigint primary key auto_increment,
    name varchar(255),
    content text,
    price int,
    created datetime default current_timestamp,
    updated datetime default current_timestamp on update current_timestamp
) engine=InnodB default charset=utf8mb4;

create table user_attach(
    id bigint primary key auto_increment,
    userId bigint,
    filename text,
    filepath text,
    created datetime default current_timestamp,
    updated datetime default current_timestamp on update current_timestamp
) engine=InnodB default charset=utf8mb4;

create table product_attach(
    id bigint primary key auto_increment,
    productId bigint,
    filename text,
    filepath text,
    created datetime default current_timestamp,
    updated datetime default current_timestamp on update current_timestamp
) engine=InnodB default charset=utf8mb4;

create table basket(
                       id bigint primary key auto_increment,
                       user_id bigint,
                       product_id bigint,
                       product_cnt int
) engine=InnodB default charset=utf8mb4;