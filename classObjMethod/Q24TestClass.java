//24. Java Program to Demonstrate Usage of a Static Variable in the Test Class


class Q24TestClass{

	static int b=10;
	
	int method1(){
		
		
		return b;
	
	}

	public static void main(String args[]){
		TestClass obj=new TestClass();
		System.out.println("value b before changing :" + b);
		b=15;
		System.out.println("value of  Static after changing " + obj.method1());
		
		
		
		
	}
}