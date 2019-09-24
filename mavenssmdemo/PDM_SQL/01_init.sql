drop table if exists tb_user;
CREATE TABLE tb_user(
    id int(11) NOT NULL AUTO_INCREMENT,
    user_name varchar(40) NOT NULL,
    password varchar(40) NOT NULL,
    age int(4) NOT NULL,
    PRIMARY KEY(id))
     ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
