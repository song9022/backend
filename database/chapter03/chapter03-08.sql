--Documents\dev\database\workspace\chapter03\chapter03-08.sql
-- �������� Ǯ��
-- �������� �� ���ž�
select sum(saleprice)
from customer, orders
where customer.custid=orders.custid
and customer.name like '������';

-- �������� ������ ������ ��
select count(*)
from customer c, orders o
where c.custid=o.custid
and c.name like '������';

-- �������� ������ ������ ���ǻ� ��
select count(distinct publisher)
from customer c, orders o, book b
where c.custid=o.custid
and o.bookid=b.bookid
and c.name like '������';

--�������� ������ ������ �̸�, ����, ������ �ǸŰ��� ����
select bookname, price, price-saleprice
from customer c, orders o, book b
where c.custid=o.custid
and o.bookid=b.bookid
and c.name like '������';

-- �������� �������� ���� ������ �̸�
select distinct b.bookname
from book b, orders o, customer c
where b.bookid=o.bookid
and c.custid=o.custid
and c.name!='������';

-- ���� �̸��� ���� ���ž�
select name,sum(saleprice)
from orders o, customer c
where o.custid=c.custid
group by name;

select *
from orders o, customer c
where o.custid=c.custid;

--���� �̸��� ���� ������ ���� ���
select c.name, b.bookname
from book b, orders o, customer c
where b.bookid=o.bookid
and o.custid=c.custid;

--������ ���ݰ� �ǸŰ����� ���̰� ���� ���� �ֹ�
select *
from book b, orders o
where b.bookid=o.bookid
and price-saleprice=(
    select max(price-saleprice)
    from book b, orders o
    where b.bookid=o.bookid
);

--������ �Ǹž� ��պ��� �ڽ��� ���ž� ����� �� ���� ���� �̸�
select name,avg(saleprice)
from customer c, orders o
where c.custid=o.custid
group by name
having avg(saleprice)>( --������ �Ǹž� ���
    select avg(saleprice)
    from orders
);

-- Ű���� �Ҹ��� �� �����̴��� �Ǵ��ϱ� ������
-- Ű���� �Ҹ��� ũ�� ���ŵ� �˴ϴ�
-- ���ڵ� ä��, ī�� ä��, �ٸ� ���� Ű���� �Ҹ��� ���� ������

-- �������� ������ ������ ���ǻ�� ���� ���ǻ翡�� ������ ������ ���� �̸�
select c.name
from customer c, orders o, book b
where c.custid=o.custid
and o.bookid=b.bookid
and c.name not like '������'
and publisher in ( --�������� ������ ������ ���ǻ�
    select b.publisher
    from customer c,orders o, book b
    where c.custid=o.custid
    and o.bookid=b.bookid
    and name like '������'
);

-- �� �� �̻��� ���� �ٸ� ���ǻ翡�� ������ ������ ���� �̸�
select c1.name
from customer c1
where 2>=( --������ ���ǻ� ����
    select count(distinct b.publisher)
    from customer c2,orders o, book b
    where c2.custid=o.custid
    and o.bookid=b.bookid
    and c2.name like c1.name
);

-- �� �� �̻��� ���� �ٸ� ���ǻ翡�� ������ ������ ���� �̸�
select name,count(distinct b.publisher)
from customer c2,orders o, book b
where c2.custid=o.custid
and o.bookid=b.bookid
group by name
having count(distinct b.publisher)>=2;

-- �� �� �̻��� ���� �ٸ� ���ǻ翡�� ������ ������ ���� �̸�
select c.name,count(b.publisher)
from customer c,orders o, book b
where c.custid=o.custid
and b.bookid=o.bookid
group by name
having count(distinct b.publisher)>=2;

-- ��ü ���� 30% �̻��� ������ ����
select bookname
from book b1
where (
    (select count(b2.bookid)
    from book b2, orders o
    where b2.bookid=o.bookid
    and b1.bookid=b2.bookid)
    >=0.3*(
        select count(*)
        from customer
        )
);
select count(*) from customer;
select count(bookid) from orders
group by bookid;














