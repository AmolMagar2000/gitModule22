//18. Java Program to Illustrates Use of Chaining Constructor

class Q18ConstructorChaining{
	int rollNo;
	String name;
	ConstructorChaining(){ 
		this.rollNo=10;
		   
	}
	
	ConstructorChaining(String name){ 
		this();//call default constructor 
		this.name=name;   
	}
	public static void main(String args[]){
		ConstructorChaining obj =new ConstructorChaining("YJB");
		System.out.println("Roll No : "+obj.rollNo +" name "+obj.name);
		
	}
}

