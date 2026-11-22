class Demo{

	public static void main(String[]args){

		int arr[]={1,2,3};
		int len=arr.length;
		int sum=0;

		for(int i=0;i<len;i++){

			for(int j=i;j<len;j++){

				for(int k=i;k<=j;k++){

					sum=sum+arr[k];
				}
				System.out.println(sum);	
				sum=0;
			}
		}
	}
}