create table stock (stock_id number primary key, stock_code varchar2(10), stock_name varchar2(50));

create table stock_daily_record (daily_record_id number primary key, price_open number, price_close number, price_change number, volume number, record_date date, stock_id number, foreign key(stock_id) references stock(stock_id));

insert into stock values (001, 'CODE001', 'GOLDMAN SACH');
insert into stock values (002, 'CODE002', 'BARCLAY');
insert into stock values (003, 'CODE003', 'BLOOMBERG');
insert into stock values (004, 'CODE004', 'MORGAN STANELY');

INSERT INTO STOCK_DAILY_RECORD values(1, 100, 102, 2, 300, TO_DATE('08/19/2015', 'MM/DD/YYYY'), 001);
INSERT INTO STOCK_DAILY_RECORD values(2, 102, 104, 2, 300, sysdate, 001);
INSERT INTO STOCK_DAILY_RECORD values(3, 90, 93, 3, 200, TO_DATE('08/19/2015', 'MM/DD/YYYY'), 002);
INSERT INTO STOCK_DAILY_RECORD values(4, 93, 102, 9, 300, sysdate, 002);
INSERT INTO STOCK_DAILY_RECORD values(5, 100, 90, 10, 300, TO_DATE('08/19/2015', 'MM/DD/YYYY'), 003);
INSERT INTO STOCK_DAILY_RECORD values(6, 90, 102, 12, 300, sysdate, 003);
INSERT INTO STOCK_DAILY_RECORD values(7, 80, 85, 5, 300, TO_DATE('08/18/2015', 'MM/DD/YYYY'), 004);
INSERT INTO STOCK_DAILY_RECORD values(8, 85, 102, 17, 300, TO_DATE('08/19/2015', 'MM/DD/YYYY'), 004);
INSERT INTO STOCK_DAILY_RECORD values(9, 102, 102, 0, 300, sysdate, 004);
