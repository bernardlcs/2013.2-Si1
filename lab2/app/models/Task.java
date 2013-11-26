package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import play.data.validation.Constraints.*;

@Entity 
public class Task extends Model{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	public Long id;
	@Required
	public String tarefa;
	
	@Required
	public String projeto;
	
	@Required
	public String prioridade;
	
	
	public static Finder<Long,Task> find = new Finder(Long.class, Task.class );
	
	public static List<Task> all(){
		return find.all();
	}
	public static List<Task> tareCom(){
		return find.all();
	}
	
	public static void  create(Task task){
		task.save();
	}
	
	public static void delete(Long id){
		find.ref(id).delete();
	}
	
	public static void tarefaCompleta(Long id){
		tareCom().add(find.ref(id));
	}
	
	

}
