package controllers;

import models.Comida;
import models.Restaurant;
import models.Usuario;
import play.*;
import play.libs.Json;
import play.mvc.*;

import views.html.*;

import java.util.List;

public class Application extends Controller {

    public static Result index() {
        List<Comida> listaComidas = Comida.find.all();
        return ok(index.render("Encuentra tus platos favoritos", listaComidas));
    }

    public static Result getRestaurant(Long id) {
        Restaurant r = Restaurant.find.byId(id);
        return ok(restaurant.render("Encuentra tus platos favoritos", r));
    }


    @BodyParser.Of(BodyParser.Json.class)
    public static Result getUsuario(Long id){
        return ok(Json.toJson(Usuario.find.byId(id)));
    }

    @BodyParser.Of(BodyParser.Json.class)
    public static Result login() {
        Usuario u = Json.fromJson(request().body().asJson(), Usuario.class);
        Usuario uLogin = Usuario.find.where().eq("email", u.email).eq("clave", u.clave).findUnique();
        return ok(Json.toJson(uLogin.email));
    }

    @BodyParser.Of(BodyParser.Json.class)
    public static Result crearUsuario() {
        Usuario newUser = Json.fromJson(request().body().asJson(), Usuario.class);
        newUser.save();
        return ok(Json.toJson(newUser.id));
    }

}
