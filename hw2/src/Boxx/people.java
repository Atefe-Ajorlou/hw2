package Boxx;

public class people {
	public abstract class people {

		 public static void main(String[] args) {
		  
		  
		  
		 }
		 
		 public static abstract class Person {
		  
		  private String name;
		  
		  public String getName() {
		   return name;
		  }

		  public void setName(String name) {
		   this.name = name;
		  }

		  public abstract String notif();
		  
		  public void awake() {
		   System.out.print("Time to wakeup");
		  }
		  
		 }
		 
		 public static class Student extends Person{
		  
		  private String sms;
		  
		  
		  
		  
		  @Override
		  public String notif() {
		   return this.sms;
		  }
		  
		 }
		 
		 public static class Teacher extends Person{
		  
		  private String call;
		  
		  
		  
		  public String notif() {
		   return this.call;
		  }
		  
		  
		  public static class Manager extends Person{
		   
		   public String notif() {
		    return "come";
		   }
		  
		 }
		 
		}

}
