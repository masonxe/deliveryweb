package models;

import play.db.ebean.*;
import javax.persistence.*;
import java.util.List;


@Entity
@SequenceGenerator(name="generator", sequenceName="comida_seq")
@Table(name="comida")
public class Comida extends Model{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator")
    public Long id;
    public String nombre;
    public String foto;
    public String descripcion;

    @ManyToOne
    public Restaurant restaurant;

    public static Finder<Long,Comida> find = new Finder<>(Long.class, Comida.class);
}
