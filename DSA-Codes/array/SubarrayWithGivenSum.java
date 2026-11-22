class Demo{

	public static void main(String[]args){

		int arr[]={1,2,3,7,5};
		int sum=12;
		int len=arr.length;	
		int add=0;

		for(int i=0;i<len;i++){

			for(int j=i;j<len;j++){

				for(int k=i;k<=j;k++){

					add=add+arr[k];
				}
				if(add==sum){

					for(int k=i;k<=j;k++){

						System.out.print(arr[k]);
					}
					System.out.println();
				}
				add=0;
			}
		}
	}
}