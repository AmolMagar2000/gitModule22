//26. Java Program to Calculate Sum of Two Byte Values using Type Casting


class Q26SumByte{
	
	 void add(byte a,byte b){
		 
		 int sum=(int)a+(int)b;
		 System.out.println(sum);
	 }
	
	public static void main(String args[]){
		
		byte a=10;
		byte b=30;
		
		
		SumByte obj=new SumByte();
		System.out.println("Sum of Byte value is: ");
		obj.add(a,b);
		
	}
}