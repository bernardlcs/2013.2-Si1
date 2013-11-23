package controllers;

import play.*;
import play.data.Form;
import play.mvc.*;

import views.html.*;
import models.*;


public class Application extends Controller {
	
	static Form<Task> taskForm = Form.form(Task.class);

    public static Result index() {
        return redirect(routes.Application.tasks());
    }
    
      
    public static Result newTasks(){
    	return TODO;
    }
    public static Result deleteTask(Long id){
    	return TODO;
    }
    
    public static Result tasks() {
		  return ok(
		    views.html.index.render(Task.all(), taskForm));
		}

}
