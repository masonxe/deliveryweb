package models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.List;


@Entity
@SequenceGenerator(name="generator", sequenceName="restaurant_seq")
@Table(name="restaurant")
public class Restaurant extends Model{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator")
    public Long id;
    public String nombre;
    public String direccion;
    public String telefono;

    @JsonIgnore
    @OneToMany(mappedBy = "restaurant")
    public List<Comida> listaComidas;

    public static Finder<Long, Restaurant> find = new Finder<>(Long.class, Restaurant.class);
}
