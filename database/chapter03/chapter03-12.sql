--Documents\dev\database\workspace\chapter03\chapter03-12.sql

-- ���� ���� Ǯ��

-- [���� ������ ���̽�]
-- ���� ���̺�
create table theater(
    ttid number primary key,
    ttname varchar2(30),
    ttlocation varchar2(30)
);
-- �󿵰� ���̺�
-- ��ȭ ������ 20000���� ���� �ʾƾ� �Ѵ�
create table cinema(
    ttid number,
    cid number,
    moviename varchar2(40),
    movieprice number check(movieprice<20000),
    chairnumber number,
    primary key (ttid,cid)
);
-- ���� ���̺� ����
-- �󿵰� ��ȣ�� 1���� 10�����̴�
-- ���� ����� ���� �¼���ȣ�� �� �� �������� �ʾƾ� �Ѵ�
create table reservation(
    ttid number,
    cid number check(cid>=1) check(cid<=10),
    cusid number,
    seatnumber number unique,
    rdate date,
    primary key(ttid,cid,cusid)
);
-- �� ���̺� ����
-- ���ڿ��� ũ��: ����Ʈ
-- ��) varchar2(20)
-- 20byte -> �����ڵ�(unicode)�� �ѱ��ڿ� 2byte
-- 10�������� ���� �� �ִ� ũ��
create table movie_customer(
    cusid number primary key,
    cusname varchar2(50),
    cusaddr varchar2(300)
);

-- [�Ǹſ� �����ͺ��̽�]
-- �Ǹſ� ���̺� ����
create table sales_person(
    name varchar2(100) primary key,
    age number,
    salary number
);

--�ֹ� ���̺� ����
drop table sales_order;
create table sales_order(
    onumber number,
    custname varchar2(50),
    salesperson varchar(50),
    amount number,
    primary key (onumber),
    foreign key(custname) references sales_customer(name),
    foreign key(salesperson) references sales_person(name)
);
-- �� ���̺� ����
create table sales_customer(
    name varchar2(50) primary key,
    city varchar2(50),
    industrytype varchar2(50)
);

-- [��� ������Ʈ �����ͺ��̽�]
-- ���� ���̺� ����
create table b_employee(
    empno number primary key,
    name varchar2(50),
    phoneno varchar2(20),
    address varchar2(100),
    sex char(1),
    position varchar2(50),
    deptno number
);

-- �μ� ���̺� ����
create table b_department(
    deptno number primary key,
    deptname varchar2(50),
    manager number
);
-- ������Ʈ ���̺� ����
create table b_project(
    projno number primary key,
    projname varchar2(50),
    deptno number
);

-- �۾� ���̺� ����
create table b_works(
    empno number,
    projno number,
    hours_worked number,
    primary key(empno, projno),
    foreign key(empno) references b_employee(empno),
    foreign key(projno) references b_project(projno)
);






















