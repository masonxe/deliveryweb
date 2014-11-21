# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table usuario (
  id                        bigint not null,
  email                     varchar(255),
  clave                     varchar(255),
  nombres                   varchar(255),
  apellidos                 varchar(255),
  constraint pk_usuario primary key (id))
;

create sequence usuario_seq;




# --- !Downs

drop table if exists usuario cascade;

drop sequence if exists usuario_seq;

