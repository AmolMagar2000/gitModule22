 import java.util.Scanner;
 class Test
{
    float areacircle()
    {   
        System.out.print("enter the radius :");
        Scanner s = new Scanner(System.in);
        float r = s.nextFloat();
        float ar;
        ar = (r * r) * 22 / 7;
        return ar;
    }
}
class Q12MethodDemo
{
    public static void main(String args[]) 
    {
        Test obj = new Test();
        float area=obj.areacircle();
		System.out.println("area of the circle is : "+area+" sq units.");
    }
}