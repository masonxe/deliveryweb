# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table comida (
  id                        bigint not null,
  nombre                    varchar(255),
  foto                      varchar(255),
  descripcion               varchar(255),
  restaurant_id             bigint,
  constraint pk_comida primary key (id))
;

create table restaurant (
  id                        bigint not null,
  nombre                    varchar(255),
  direccion                 varchar(255),
  telefono                  varchar(255),
  constraint pk_restaurant primary key (id))
;

create table usuario (
  id                        bigint not null,
  email                     varchar(255),
  clave                     varchar(255),
  nombres                   varchar(255),
  apellidos                 varchar(255),
  constraint pk_usuario primary key (id))
;

create sequence comida_seq;

create sequence restaurant_seq;

create sequence usuario_seq;

alter table comida add constraint fk_comida_restaurant_1 foreign key (restaurant_id) references restaurant (id);
create index ix_comida_restaurant_1 on comida (restaurant_id);



# --- !Downs

drop table if exists comida cascade;

drop table if exists restaurant cascade;

drop table if exists usuario cascade;

drop sequence if exists comida_seq;

drop sequence if exists restaurant_seq;

drop sequence if exists usuario_seq;

