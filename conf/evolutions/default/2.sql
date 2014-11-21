# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups
insert into usuario values (1, 'meison@gmail.com', '123', 'Meison', 'Chirinos');
insert into usuario values (2, 'alex12@aaa.com', '123', 'Alex', 'Perez');
insert into usuario values (3, 'jaime@aaa.com', '123', 'Alex', 'Perez');

insert into restaurant values (1, 'Altomayo', 'Jr. Luna 122', '234-3322');
insert into restaurant values (2, 'El perico', 'Jr. Torre Tagle 322', '264-3322');
insert into restaurant values (3, 'La Trinidad', 'Jr. Moquegua 223', '534-3322');

insert into comida values (1, 'Pollo a la brasa', 'images/1.png', 'Exquisito pollo acompañado de abundantes papas fritas', 1);
insert into comida values (2, 'Caldo de Gallina', 'images/2.png', 'Exquisito caldo de gallina', 1);
insert into comida values (3, 'Carapulcra', 'images/3.png', 'Exquisita carapulcra', 2);