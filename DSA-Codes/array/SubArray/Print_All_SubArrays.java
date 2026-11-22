class Demo{

	public static void main(String[]args){

		int arr[]={3,2,1};
		int len=arr.length;
	
	
		for(int i=0;i<len;i++){

			for(int j=i;j<len;j++){

				for(int k=i;k<=j;k++){

					System.out.print(arr[k]);
				}
				System.out.println();
			}
		}
	}
}