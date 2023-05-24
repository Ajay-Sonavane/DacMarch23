class SecondLargestElement{

     public static int getNumber(int [] arr){
	 int temp;
	        for (int i =0;i<arr.length;i++){
			    for (int j =i+1;j<arr.length;j++){
				    if (arr[i]>arr[j]){
					 temp = arr[i];
					 arr[i] = arr[j];
					 arr [j] = temp;
					}
				}
			}
			return arr[arr.length-2];
	 }
     public static void main (String args []){
	        
			int [] arr = { 3,5,2,8,8,7,7,7};
			System.out.println("The second largest element is " + getNumber(arr));
	 }

}