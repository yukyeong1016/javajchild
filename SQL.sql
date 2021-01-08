create table bookingroomadmin(
	adminid varchar2(30) PRIMARY KEY,
	adminpassword varchar2(30) not null,
	adminaddress varchar2(50)
);

create table bookingroomclient(
	phonenumber varchar2(30) PRIMARY KEY,
	password varchar2(20) not null,
	name varchar2(20) not null,
	address varchar2(40),
	adminid varchar2(30),
	paytime number
	);

	create table bookingroomseat(
	seatnumber number PRIMARY KEY,
	seatpartition number,
	starttime DATE,
	endtime DATE,
	adminid varchar2(30)
	);
		
create table bookingroompay(
	paynum number primary key,
	phonenumber varchar(30), 
	seatnumber number,
	paytime number);


create sequence bookingseatnum;
	
	
insert into bookingroomseat values(
bookingseatnum.nextval, 1, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 1, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 1, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 1, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 1, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 1, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 1, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 1, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 1, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 1, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 1, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 1, null,null, 'admin');

insert into bookingroomseat values(
bookingseatnum.nextval, 0, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 0, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 0, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 0, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 0, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 0, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 0, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 0, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 0, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 0, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 0, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 0, null,null, 'admin');
insert into bookingroomseat values(
bookingseatnum.nextval, 0, null,null, 'admin');




insert into bookingroomadmin values(
'admin', 'wkflsdl', 'SMHRD'
);


alter table bookingroomclient add constraint fk_admin_client foreign key(adminid) references bookingroomadmin(adminid);
alter table bookingroomseat add constraint fk_admin_seat foreign key(adminid) references bookingroomadmin(adminid);
alter table bookingroompay add constraint fk_phonenumber foreign key(phonenumber) references bookingroomclient(phonenumber);
alter table bookingroompay add constraint fk_seatnumber foreign key(seatnumber) references bookingroomseat(seatnumber);



