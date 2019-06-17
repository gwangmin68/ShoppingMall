use shopping;

drop table if exists product;
drop table if exists user;


create table user (
    id bigint primary key auto_increment,
    account varchar(100) not null unique,
    password varchar(100),
    username varchar(30),
    email varchar(50) not null unique,
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

create table product(
    id bigint primary key auto_increment,
    name varchar(255),
    explain text,
    price int,
    created datetime default current_timestamp,
    updated datetime default current_timestamp on update current_timestamp
) engine=InnodB default charset=utf8mb4;

create table basket(
    id bigint primary key auto_increment,
    user_id bigint,
    product_id bigint
) engine=InnodB default charset=utf8mb4;