//21. Java Program to Allocate and Initialize Super Class Members using Constructor

class Q21SuperClass{
	int a;
	int b;
	SuperClass(int a){
		this.a=a;
	}
	int add(){
		
		return a+b;
	}
	
	
}

class SuperClassDemo extends SuperClass{
	
	SuperClassDemo(int a1,int b1){
		super(a1);
		super.b=b1;
		
		System.out.println("Addition is "+ super.add());
	}
	
	
	public static void main(String args[]){
		SuperClassDemo obj=new SuperClassDemo(11,50);
		
		System.out.println("Addition is "+ obj.add());
		
	}
}