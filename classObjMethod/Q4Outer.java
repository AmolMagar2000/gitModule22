public class Q4Outer{  
	  static int data=30;  
	  static class Inner{  
	   static void msg(){System.out.println("data is "+data);}  
	  }  
  public static void main(String args[]){  
	  Q4Outer.Inner.msg();//no need to create the instance of static nested class  
	  }  
}  