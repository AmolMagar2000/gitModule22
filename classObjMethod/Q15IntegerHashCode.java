//declare a class
 class Password{
  //declare attributes
  private String password;
  private String retypedpassword;

  //setters and getters
  Password(String x){
    this.password = x;
  }
  public String getpassword()
  {
    return this.password;
  }
  //Override the predefined hashCode function
  @Override
  public int hashCode(){
    return (int) password.hashCode();
  }
  //Override the predefined equals function
  @Override
  public boolean equals(Object x){
    if (x == null)
      return false;
    Password y = (Password) x;
    return y.getpassword() == this.getpassword() ;
  }

}
//declare a separate class to compare two objects
public class Q15IntegerHashCode{
 
  public static void main(String args[])
  {
    //declare two objects
    Password p1 = new Password("ABC");
    Password p2 = new Password("ABC");
    //compare and print
    System.out.println("Hash for password 1: ");
    System.out.println(p1.hashCode());
    System.out.println("Hash for password 2: ");
    System.out.println(p2.hashCode());

    System.out.println("Equal? ");
    System.out.println(p1.equals(p2));
  } 
}