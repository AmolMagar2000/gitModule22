class Q5Outer{
	static private int a=10;
	static Q5Outer.inner obj;
	void call(int b){
		System.out.println("b= "+b);
	}
	static class inner{
		static int b=5;
		void show(){
			System.out.println("a ="+a);
			Q5Outer obj1= new Q5Outer();
			obj1.call(this.b);
		}
	}
	public static void main(String [] args){
	obj= new Q5Outer.inner();
	obj.show();
	}
}