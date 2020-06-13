create database bd_turismoPeru;

use bd_turismoPeru;

create table tb_categoria(
idcategoria int primary key,
descripcion varchar(100) not null
);

insert into tb_categoria values(1,"Lima - Huaraz");
insert into tb_categoria values(2,"Lima - Cuzco");
insert into tb_categoria values(3,"Cajamarca - Baños del inca");
insert into tb_categoria values(4,"Ventanillas de otuzco");
insert into tb_categoria values(5,"Lurin - Posada del niño");

create table tb_paquetes(
codigo int auto_increment primary key,
descripcion varchar(200) null,
dias int null,
precio decimal null,
idcategoria int references tb_categoria
);
insert into tb_paquetes(descripcion,dias,precio,idcategoria) values("Paquete para Casados s/niños",4,230,1);
select * from tb_categoria;
select * from tb_paquetes;