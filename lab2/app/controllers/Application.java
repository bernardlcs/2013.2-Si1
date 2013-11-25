package controllers;

import play.*;
import play.data.Form;
import play.mvc.*;

import views.html.*;
import models.*;
import play.db.*;
import play.db.ebean.Model;



public class Application extends Controller {
	
	
	static Form<Task> taskForm = Form.form(Task.class);

    public static Result index() {
        return redirect(routes.Application.tasks());
    }
    
      
    public static Result newTasks(){
    	Form<Task> filledForm = taskForm.bindFromRequest();
    	if(filledForm.hasErrors()) {
    	    return badRequest(
    	      views.html.index.render(Task.all(), filledForm)
    	    );
    	  } else {
    	    Task.create(filledForm.get());
    	    return redirect(routes.Application.tasks());  
    	  }
    	
    }
    public static Result deleteTask(Long id){
    	Task.delete(id);
    	return redirect(routes.Application.tasks());
    }
    
    public static Result tasks() {
		  return ok(views.html.index.render(Task.all(), taskForm));
		}

}
