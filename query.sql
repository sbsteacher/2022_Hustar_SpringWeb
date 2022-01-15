create table t_user(
   iuser int unsigned primary key auto_increment,
   userid varchar(20) unique not null,
   userpw varchar(100) not null,
   nm varchar(5) not null,
   gender tinyint unsigned check(gender in (0, 1)),
   profileimg varchar(30),
   rdt datetime default current_timestamp
);

create table t_board(
    iboard int unsigned auto_increment,
    title varchar(100) not null,
    ctnt text not null,
    iuser int unsigned not null,
    hits int unsigned default 0,
    rdt datetime default current_timestamp,
    mdt datetime default current_timestamp,
    primary key(iboard),
    foreign key (iuser) references t_user(iuser)
);