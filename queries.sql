-- creating the database:
CREATE TABLE users
(
    id       int(11) auto_increment,
    email    varchar(255) unique not null,
    username varchar(255)        not null,
    password varchar(60)         not null,
    primary key (id)
);


-- some users so it's not empty
insert into users(email, username, password)
values ('patryk@lewciu.com', 'patrys', 'ptysptys1');

insert into users(email, username, password)
values ('marcin@pciu.com', 'marcis', 'ptysptys1');

insert into users(email, username, password)
values ('jurek@scziu.com', 'jureczek', 'ptysptys1');

insert into users(email, username, password)
values ('zbyszek@kwaku.com', 'zbych', 'ptysptys1');

insert into users(email, username, password)
values ('jolka@pamietasz.com', 'jolus', 'ptysptys1');

insert into users(email, username, password)
values ('zosia@samosia.com', 'zos', 'ptysptys1');