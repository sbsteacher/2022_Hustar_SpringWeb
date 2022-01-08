create table t_user(
   iuser int unsigned primary key auto_increment,
   userid varchar(20) unique not null,
   userpw varchar(100) not null,
   nm varchar(5) not null,
   gender tinyint unsigned check(gender in (0, 1)),
   profileimg varchar(30),
   rdt datetime default current_timestamp
);