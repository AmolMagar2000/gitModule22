
import java.util.Scanner;
public class Q9passReturn 
{
    int length, breadth, area;
    Q9passReturn area1(Q9passReturn object1)
    {
        object1 = new Q9passReturn();
        object1.length = this.length;
        object1.breadth = this.breadth;
        object1.area = object1.length * object1.breadth;
        return object1;
    }
    Q9passReturn area2(Q9passReturn object2)
    {
        object2 = new Q9passReturn();
        object2.length = this.length + 5;
        object2.breadth = this.breadth + 6;
        object2.area = object2.length * object2.breadth;
        return object2;
    }
    public static void main(String[] args) 
    {
         Q9passReturn obj = new Q9passReturn();
         Scanner s = new Scanner(System.in);
         System.out.print("Enter length:");
         obj.length = s.nextInt();
         System.out.print("Enter breadth:");
         obj.breadth = s.nextInt(); 
         Q9passReturn a = obj.area1(obj);
         Q9passReturn b = obj.area2(obj);
         System.out.println("Area:"+a.area);
         System.out.println("Area:"+b.area);
    }
}