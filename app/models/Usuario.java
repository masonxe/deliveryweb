package models;

import play.db.ebean.*;

import javax.persistence.*;

@Entity
@SequenceGenerator(name="generator", sequenceName="usuario_seq")
@Table(name="usuario")
public class Usuario extends Model {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator")
    public Long id;

    public String email;
    public String clave;
    public String nombres;
    public String apellidos;

    public static Finder<Long,Usuario> find = new Finder<>(Long.class, Usuario.class);


}
