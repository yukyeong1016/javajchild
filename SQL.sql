create table admin(
	adminid varchar2(30) PRIMARY KEY,
	adminpassword varchar2(30) not null,
	adminaddress varchar2(50)
)

create table bookingclient(
	phonenumber varchar2(30) PRIMARY KEY,
	password varchar2(20) not null,
	name varchar2(20) not null,
	address varchar2(40),
	starttime DATE,
	endtime DATE,
	adminid varchar2(30) references admin(adminid)
	)

	create table seat(
	seatnumber number PRIMARY KEY,
	seatpartition number,
	adminid varchar2(30) references admin(adminid)
	)
		
create table pay(
	paynum number primary key,
	phonenumber varchar(30) references bookingclient(phonenumber),
	seatnumber number references seat(seatnumber))

create sequence seatnum;
	
	
insert into seat values(

seatnum.nextval, 1, 'admin')

insert into seat values(

seatnum.nextval, 1, 'admin')
insert into seat values(

seatnum.nextval, 1, 'admin')
insert into seat values(

seatnum.nextval, 1, 'admin')
insert into seat values(

seatnum.nextval, 1, 'admin')
insert into seat values(

seatnum.nextval, 1, 'admin')
insert into seat values(

seatnum.nextval, 1, 'admin')
insert into seat values(

seatnum.nextval, 1, 'admin')
insert into seat values(

seatnum.nextval, 1, 'admin')
insert into seat values(

seatnum.nextval, 1, 'admin')
insert into seat values(

seatnum.nextval, 1, 'admin')
insert into seat values(

seatnum.nextval, 1, 'admin')

insert into seat values(

seatnum.nextval, 0, 'admin')
insert into seat values(

seatnum.nextval, 0, 'admin')
insert into seat values(

seatnum.nextval, 0, 'admin')
insert into seat values(

seatnum.nextval, 0, 'admin')
insert into seat values(

seatnum.nextval, 0, 'admin')
insert into seat values(

seatnum.nextval, 0, 'admin')
insert into seat values(

seatnum.nextval, 0, 'admin')
insert into seat values(

seatnum.nextval, 0, 'admin')
insert into seat values(

seatnum.nextval, 0, 'admin')
insert into seat values(

seatnum.nextval, 0, 'admin')
insert into seat values(

seatnum.nextval, 0, 'admin')
insert into seat values(

seatnum.nextval, 0, 'admin')
insert into seat values(

seatnum.nextval, 0, 'admin')


insert into admin values(
'admin', 'wkflsdl', 'SMHRD'
)








