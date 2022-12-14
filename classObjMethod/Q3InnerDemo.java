class Outer 
{
    int outer_x = 100;
    void test() 
    {
        Inner inner = new Inner();
        inner.display();
    }
    class Inner 
    {
        int y = 10; 
        void display() 
        {
            System.out.println("display: outer_x = " + outer_x);
        }
    }
    /*void showy() 
    {
        System.out.println("inner y="+y); // error, y not known here!
    }*/
}
class Q3InnerDemo 
{
    public static void main(String args[]) 
    {
        Outer outer = new Outer();
        outer.test();
    }
}