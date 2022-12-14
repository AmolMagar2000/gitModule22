abstract class Features{
	abstract void set();
	public void call(){
		System.out.println("Feature method call");
	}
}
class advance extends Features{
		advance(){
			super.call();
		}
		public void set(){
			this.call();
			System.out.println("must to be override abstract");
		}
		public void call(){
			
		System.out.println("class advance");
		}
}
class Q1Abstract{
	public static void main(String args[]){
		Features adv= new advance();
		adv.set();
	}
}