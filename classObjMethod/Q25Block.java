//25. Java Program to Check Whether Which One is Executed First, Static Block or the Static Method


class Q25Block{
	
	Block(){
		System.out.println("Inside the Constructor block");
		
	}
	
	static{
		
		System.out.println("Inside the static block"); //Executed without object and call only once
	}
	
	{
		
		System.out.println("Inside the non-static block");
	}
	
	public static void main(String args[]){
		Block obj=new Block();//Static then non-static then constructor
		Block obj1=new Block(); ///How many object ==Non static and constructor call
	}
}