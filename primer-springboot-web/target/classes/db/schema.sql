create table if not exists libros(
  id int PRIMARY KEY AUTO_INCREMENT,
  titulo varchar(100) not null,
  autor varchar(100) not null,
  editorial varchar(50) not null,
  fecha date not null,
  tematica varchar(50) not null
  );

CREATE TABLE if not exists usuarios (
  id int PRIMARY KEY AUTO_INCREMENT,
  usuario varchar(30) not null unique,
  password varchar(30) not null
  );

