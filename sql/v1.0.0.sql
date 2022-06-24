create database if not exists education_administration_system default character set utf8mb4 collate utf8mb4_0900_ai_ci;

use education_administration_system;

create table if not exists Faculty(
    id char(15) primary key comment '职工号',
    name varchar(15) not null comment '姓名',
    password varchar(40) not null comment '密码(SHA加密)',
    department varchar(30) not null comment '部门/所在系',
    title varchar(15) comment '职称'
);

create table if not exists Student(
    id char(15) primary key comment '学号',
    name varchar(15) not null comment '姓名',
    password varchar(40) not null comment '密码(SHA加密)',
    department varchar(30) not null comment '所在系',
    grade int not null comment '年级',
    stuClass varchar(20) not null comment '班级'
);
