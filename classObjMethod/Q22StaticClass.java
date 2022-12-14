//22. Java Program to Check the Accessibility of Static and Non-Static Variable by a Static Method

class Q22StaticClass{
	int a=5;
	static int b=10;
	
	static void method1(){
		StaticClass obj1=new StaticClass();
		System.out.println("value of Non Static in static method A: " + obj1.a);//cannot access non static memebers
		System.out.println("value of  Static A in static method :" + b);
		
	}
	
	public static void main(String args[]){
		StaticClass obj=new StaticClass();
		System.out.println("value of Non Static A " + obj.a);
		System.out.println("value of  Static in main method B " + b);
		method1();
		
		
		
	}
}