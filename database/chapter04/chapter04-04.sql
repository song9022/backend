--Documents\dev\database\workspace\chapter04\chapter04-04.sql

-- 인덱스
-- 1. 데이터베이스의 물리적 저장
-- 실제 데이터가 저장되는 곳이 보조기억장치다
-- 보조기억장치는 일반적으로 하드디스크, ssd, usb메모리등이 있다
-- dbms가 하드디스크에 데이터를 저장하고 읽어 올 때는 
-- 근본적인 속도 문제;가 발생할 수밖에 없다

-- 인덱스와 B-tree
-- 인덱스 index , 색인
-- 자료를 쉽고 빠르게 찾을 수 있도록 만든 데이터 구조이다
-- B-tree
-- 각 노드는 키값과 포인터를 가진다
-- 키 값은 오름차순으로 저장되어 있으며
-- 키 값 좌우에 있는 포인터는 각각 키 값보다 작은 값과 큰 값을
-- 가진 다음 노드를 가리킨다
-- 키 값을 비교하여 다음 단계의 노드를 쉽게 찾을 수 있다

-- 데이터베이스의 sql문 처리 속도를 올리는 것을 데이터베이스 튜닝
-- 데이터를 나누어서 데이터 단위를 작게 만드는 것이 가장 좋은 튜닝이나
-- 그전에 데이터가 조금 많아서 속도를 올리기 위해 인덱스를 생성할 수 있다

-- 인덱스의 생성
-- 인덱스는 데이터 검색을 빠리 하기 위해 사용한다
-- 인덱스를 생성했다고 해서 데이터 검색이 무조건 빨라지는 것은 아니다
-- 데이터의 양이 별로 없거나 데이터값이 몇 종류 안되어
-- 선택도가 높으면 인덱스가 없는게 더 빠를 수 있다
-- 선택도란 1/서로 다른 값의 개수
-- 예를 들어 100개의 행을 가진 테이블 값이 남,여
-- 두 가지라면 선택도가 높다고 할 수 있다
-- 의미 없이 인덱스를 생성하면 검색이 더 느려지고 저장 공간만 낭비하게 된다
-- 인덱스 생성에 앞서 고려사항을 충분히 살펴 봐야 한다
-- 고려사항
-- 인덱스는 where절에 자주 사용되는 속성이어야 한다
-- 인덱스는 조인에 자주 사용되는 속성이어야 한다
-- 단일 테이블에 인덱스가 많으면 속도가 느려질 수 있다
-- ( 테이블당 4~5개 정도  권장)
-- 속성이 가공되는 경우 사용하지 않는다
-- 속성의 선택도가 낮을 때 유리하다 ( 속성의 모든 값이 다른 경우)

-- 인덱스 생성 문법
-- create [reverse][unique] index [인덱스 이름]
-- on 테이블이름(컬럼[asc|desc][{,컬럼 [asc|desc]}...])[;]
-- reserse는 역순으로 인덱스를 생성
-- unique는 테이블의 속성값에 대하여 중복이 없는 유일한 인덱스를 생성하는 것

-- book 테이블의 bookname 열의 대상으로 인덱스 ix_book을 생성하시오
create index ix_book on book (bookname);

-- book 테이블의 publisher, price열을 대상으로 인덱스 ix_book2를 생성
create index ix_book2 on book(publisher, price);

select * from book
where publisher='대한미디어' and price>=30000;

-- f10 키를 누르면 개체 탐색기를 열수 있다
-- 생성된 인덱스를 활용하여 sql문을 처리하는지 확인 할 수 있다

-- 인덱스의 재구성과 삭제
-- B-tree 인덱스는 데이터의 수정, 삭제, 삽입이 잦으면
-- 노드의 갱신이 주기적으로 일어나 단편화 현상이 나타난다
-- 단편화란 삭제된 레코드의 인덱스 값 자리가 비게 되는 상태를 말한다
-- 검색시 성능 저하로 이어진다
-- 인덱스 다시 생성해 줘야 한다
-- 인덱스 재구성 문법
-- alter [revers][unique]index 인덱스 이름
-- [on {only} 테이블이름 (컬럼이름 [{,컴럼이름}...)] rebuild[;]

-- 인덱스 ix_book을 재생성하시오
alter index ix_book rebuild;

-- 하나의 테이블에 인덱스가 많으면 데이터베이스 성능에 좋지 않다
-- 인덱스 삭제를 해야 한다
-- drop index 인덱스이름[;]

-- 인덱스 ix_book를 삭제하시오
drop index ix_book;










