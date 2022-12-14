class Array2{
	public static void main(String [] args){
		int arr[]={1,2,3,4,5,6};
		int arr1[]={2,3,4,5,6,7};
		int arr2[]={1,2,3,4,5,6};
		int track=0;
		
		//boolean result= Arrays.equal(arr,arr1);
		
		for(int i=0;i<arr.length;i++){			
				if(arr[i]==arr2[i]){
					
				}
				else{
					track++;
				}	
		}
		if(track==0){
			System.out.println("arr and arr1 are equal");
		}
		else{
					System.out.println("arr and arr1 are not equal");
					
		}
	}
}