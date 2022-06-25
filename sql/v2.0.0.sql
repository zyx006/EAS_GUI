create database if not exists education_administration_system default character set utf8mb4 collate utf8mb4_0900_ai_ci;

use education_administration_system;

create table if not exists Faculty(
    id char(15) primary key comment '职工号',
    name varchar(15) not null comment '姓名',
    password varchar(40) not null comment '密码(SHA加密)',
    sex char(5) not null comment '性别',
    birth date comment '出生年月日',
    department varchar(30) not null comment '部门/所在系',
    title varchar(15) comment '职称'
);

create table if not exists Student(
    id char(15) primary key comment '学号',
    name varchar(15) not null comment '姓名',
    password varchar(40) not null comment '密码(SHA加密)',
    sex char(5) not null comment '性别',
    birth date comment '出生年月日',
    department varchar(30) not null comment '所在系',
    grade int not null comment '年级',
    stuClass varchar(20) not null comment '班级'
);

create table if not exists Course(
    id char(8) primary key comment '课程号',
    name varchar(30) not null comment '课程名',
    credit int not null comment '学分',
    cnt int not null comment '选课人数'
);

create table if not exists SelectCourse(
    courseId char(8) comment '课程号',
    studentId char(15) comment '学生学号',
    grade decimal(5,2) comment '成绩',
    PRIMARY KEY(courseId,studentId),
    foreign key(courseId) references Course(id),
    foreign key(studentId) references Student(id)
    on update cascade
    on delete cascade
);

create table if not exists TeachCourse(
    courseId char(8) comment '课程号',
    facultyId char(15) comment '教师工号',
    location varchar(40) comment '授课地点',
    primary key(courseId,facultyId),
    foreign key(courseId) references Course(id),
    foreign key(facultyId) references Faculty(id)
    on update cascade
    on delete cascade
);
