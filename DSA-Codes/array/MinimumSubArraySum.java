class Demo{

	public static void main(String[]args){

		int arr[]={3,-4,2,-3,-1};
		int len=arr.length;
		int min=arr[0];

		for(int i=0;i<len;i++){

			for(int j=i;j<len;j++){
				
				int sum=0;
				for(int k=i;k<=j;k++){

					sum=sum+arr[k];
				}
				if(sum<min){

					min=sum;
				}
			}
		}
		System.out.println(min);
	}
}