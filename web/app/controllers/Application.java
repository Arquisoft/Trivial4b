package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;
import views.html.login;
import views.html.trivial;
import views.html.estadisticas;

public class Application extends Controller {

	public static Result index() {
		return ok(index.render());
	}

	public static Result login() {
		return ok(login.render());
	}
	
	public static Result trivial() {
		return ok(trivial.render());
	}

	public static Result pantallaAdministracion() {
		return ok(estadisticas.render());
	}

}
