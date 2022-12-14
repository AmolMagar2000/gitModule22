class counter{
	static int count=0;
	counter(){
	 count++;
	}
	public static void printCount(){
		System.out.println("no of obj created= "+count);
	}
}
class Q8ObjCounter{
	public static void main(String args[]){
		counter c= new counter();
		counter c1= new counter();
		counter c2= new counter();
		c.printCount();
	}
}