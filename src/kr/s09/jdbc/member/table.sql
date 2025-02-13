create table member(
 me_id varchar2(10) primary key,
 me_passwd varchar2(10) not null,
 me_name varchar2(30) not null,
 me_phone varchar2(13) not null, 
 me_ragdate date default SYSDATE not null
);