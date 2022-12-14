abstract class car{
	abstract void engineCC();
	//car(){}
}
class maruti800 extends car{
	public void engineCC(){
		System.out.println("maruti800 Engine 500cc ");
	}
}
class nano extends car{
	
	public void engineCC(){
		System.out.println("nano Engine 400cc");
	}
		
}
class Q2Abstract{
	public static void main(String args[]){
		car c= new nano();
		c.engineCC();
		c=new maruti800();
		c.engineCC();
		
		
	}
}