create table salary(
 name varchar2(10) primary key,
 pay number not null; 
); 

INSERT INTO salary VALUES ('SMITH',1000);
INSERT INTO salary VALUES ('PETER',2000);
INSERT INTO salary VALUES ('JOHN',3000);
COMMIT;	
-- COMMIT안하면 데이터 추가 적용 안됨

create or replace procedure adjust(n in varchar2,
								   rate in float)
is
 newpay float;
begin
 SELECT pay INTO newpay FROM salary WHERE name = n;
 newpay := newpay + newpay * rate;
 UPDATE salary SET pay = newpay WHERE name = n;
 COMMIT;
 
 exception when others then
  dbms_output.put_line('error');
  ROLLBACK;
end;