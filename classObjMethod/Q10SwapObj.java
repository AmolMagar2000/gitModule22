class Car {
    int no;
    Car(int no) {
	this.no = no; 	//2
	}
}
class Q10SwapObj {
    public static void swap(Car c1, Car c2)
    {
        int temp = c1.no;
        c1.no = c2.no;
        c2.no = temp;
    }
 
    
    //Main driver method
    public static void main(String[] args)
    {
        // Creating car class objects(creating cars)
        Car c1 = new Car(1);
        Car c2 = new Car(2);
 
        // Calling method 1
        swap(c1, c2);
 
        System.out.println("c1.no = " + c1.no);
        System.out.println("c2.no = " + c2.no);
    }
}