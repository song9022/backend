-- pdb1_mdguest�������� ����
-- book ���̺� ��ȸ
select * from book;

-- ���� mdguest����ڰ� book���̺��� ������ ���� �ʱ� ������
-- ���� ������ ������ �߻��Ѵ�
-- ��Ű��.���̺��̸� �������� ����ؾ� �Ѵ�
select * from madang.book;

-- customer ���̺� ��ȸ
select * from madang.customer;

-- with grant option�� �޾ұ� ������ mdguest�� 
-- customer���̺��� select, update ������ �ٸ� ����ڿ��� �ο� �� �� �ִ�

-- (mdguest ��������)
-- madang.book ���̺�� madang.customer ���̺��� select ������
-- mdguest2�� �ο��Ͻÿ�.
grant select on madang.customer to mdguest2;

select * from madang.book;





