package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;
import views.html.trivial;

public class Application extends Controller {

	public static Result index() {
		return ok(index.render());
	}
	
	public static Result trivial() {
		return ok(trivial.render());
	}

}
