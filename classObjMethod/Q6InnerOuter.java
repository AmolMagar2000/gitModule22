class BankAccount{
	private static double pAmount=20000;
	private static double nOfY=2;
	private static int rate=12;
	
static class Interest{
	public static void Calculate(){
		double interestAmount = (pAmount*rate*nOfY)/100;
		System.out.println("total interest on "+pAmount+" for "+nOfY+" years is "+interestAmount+"rs");
	}
}
}
class Q6InnerOuter{
	public static void main(String[] args){
		BankAccount.Interest bi= new BankAccount.Interest();
		bi.Calculate();
	}
}