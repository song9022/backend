--Documents\dev\database\workspace\chapter03\chapter03-09.sql

--���� ����
--���̺��� ������ �����̹Ƿ� ���̺� ���� ���տ����� �̿��Ͽ�
--������, ������, �������� ���� �� �ִ�
-- sql���� ���տ���
-- ������ union
-- ������ minus
-- ������ intersect

--������ �ֹ����� ���� ���� �̸��� ���̽ÿ�.
select name
from customer
minus
select name
from customer
where custid in(select custid from orders);

-- exists
-- exists�� ��� �μ����ǹ� �����̴�.
-- ���ǿ� �´� ������ �����ϸ� ����� ���� ��Ų��
-- not exists�� �μ����ǹ��� ��� ���� ���ǿ� �������� ���� ���� ���̴�

--�ֹ��� �ִ� ���� �̸��� �ּҸ� ���̽ÿ�.
select name,address
from customer c
where exists (select *
    from orders o
    where c.custid=o.custid);










