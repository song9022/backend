--Documents\dev\database\workspace\chapter03\chapter03-07.sql
--�μ�����
--sql�� ���� �� �ٸ� sql���� �ۼ� �Ѵ�
--��)������ ���� ��� ������ �̸��� ���ΰ�?
--���� ��� ���� ���ϱ�
select max(price)
from book;
--���� ��� �������� ������ �̸� ���ϱ�
select bookname
from book
where price=35000;

--���� ��� ������ �̸��� ���̽ÿ� (�μ����� ���
select bookname -----------------2
from book
where price=
(select max(price) from book); --1
-- ��ȣ�� ��� sql���� ��ø��Ű�� ���� �μ�����(subquery)��� �Ѵ�
-- �μ����Ǵ� ���ǰ� ��ø�Ǿ� �ִٴ� �ǹ̿��� ��ø����(nested  query)��� �Ѵ�
-- �μ������� ���� ������ where���� �μ����Ǹ� ���� ó���ϰ� ��ü���Ǹ� ó���Ѵ�

-- �μ����Ǵ� sql���̴�
-- sql���� ����� ���̺�
-- ���̺��� ����� �� ���� �� �ϳ��� �ȴ�
-- ������-���Ͽ�(1x1), ������-������(nx1),������-������(1xn),������-���߿�(nxn)

-- �μ������� ����� ������-���Ͽ��� ���� ���� ���� ��ȯ�ϸ�
-- �տ��� ��� inŰ���带 ����Ѵ�

--��) ������ ������ ���� �ִ� ���� �̸��� �˻��Ͻÿ�
--������ �������� ���� �ִ� �� ��ȸ
select custid
from orders;

select name
from customer
where custid in (1,2,3,4);

--������ ������ ���� �ִ� ���� �̸��� �˻��Ͻÿ�.
select name
from customer
where custid in (select custid
                    from orders);
                    
-- �� �� �̻��� ��ø�� �μ����ǵ� �����ϴ�

-- ���ѹ̵��� ������ ������ ������ ���� �̸��� ���̽ÿ�.
select name
from customer
where custid in (select custid
                    from orders
                    where bookid in(select bookid
                                    from book
                                    where publisher='���ѹ̵��'));
-- ���� ������ ���� �������Ǹ� ���� �����ϰ� �� ����� �̿��Ͽ�
-- ���� �μ����Ǹ� �����Ѵ�

-- ���ǻ纰�� ���ǻ��� ��� ���� ���ݺ��� ��� ������ ���Ͻÿ�
select b1.bookname
from book b1
where b1.price>(select avg(b2.price)
                from book b2
                where b2.publisher=b1.publisher);
-- ���̺��� ��Ī�� �ټ� �ִ�







