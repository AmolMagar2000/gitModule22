//17. Java Program to Illustrate Use of Constructor

class Q17ConstructorClass{
	int rollNo;
	String name;
	ConstructorClass(){ //To initialize default value
		this.rollNo=10;
		name="XYZ";   //this.name="XYZ" //if same variable name is not then no need to use this keyword
	}
	public static void main(String args[]){
		ConstructorClass obj =new ConstructorClass();
		System.out.println("Roll No : "+obj.rollNo +" name "+obj.name);
		
	}
}