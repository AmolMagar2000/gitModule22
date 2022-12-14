import java.util.*;
class Array3{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
			System.out.println("enter size of array and array element");
			int n= sc.nextInt();
			int arr[]= new int[n];
			for (int x=0; x<n;x++){
			arr[x]=sc.nextInt();
			}
			System.out.println("The array created is: "+Arrays.toString(arr));
			System.out.println("enter number");
			int num= sc.nextInt();
			for(int i=0;i<n;i++){
				for(int j=i;j<n;j++){
					if((arr[i]+arr[j])==num && i!=j){
						System.out.println("the number whose sum is given are:"+arr[i]+" and "+arr[j] );
					}
				}
				
			}
	}
}