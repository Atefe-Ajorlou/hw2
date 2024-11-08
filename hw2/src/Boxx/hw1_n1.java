package Boxx;

public class hw1_n1 {
	public class Boxx {

		 public static void main(String[] args) {
		  
		  
		  Box obj = new Box();
		  obj.setItem("apple");
		  System.out.println(obj.getItem());
		  
		  
		  Box obj3 = new Box();
		  obj3.setItem(2);
		  System.out.println(obj3.getItem());
		  
		  
		 }

		 public static class Box {
		  
		  private Object item;

		  public Object getItem() {
		   return item;
		  }

		  public void setItem(Object item) {
		   this.item = item;
		  }
		  
		  
		 }
		}
}
