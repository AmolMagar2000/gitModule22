interface shape{
	  void setValue();
	  void getArea();
	
}
class circle implements shape{
	double pi=3.14;
	int r;
	public void setValue(){
		r=5;
	}
	public void getArea(){
		System.out.println("Area of circle ="+(pi*r*r));
	}
}
class rectangle extends circle{
	int len, breadth;
	
	public void setValue(int len, int breadth){
		this.len=len;
		this.breadth=breadth;
		super.setValue();
	}
		
	public void getArea(){
		System.out.println("Area of rectangle= "+(len*breadth));
		super.getArea();
	}
}
class Q7Interface{
	public static void main(String[] args){
		rectangle rec= new rectangle();
		rec.setValue(8,6);
		rec.getArea();
		
	}
}