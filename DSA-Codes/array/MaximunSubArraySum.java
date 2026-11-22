class Demo{

	public static void main(String[]args){

		int arr[]={-2,-3,4,-1,-2,1,5,-3};
		int len=arr.length;
		int max=0;

		for(int i=0;i<len;i++){

			for(int j=i;j<len;j++){
				
				int sum=0;
				for(int k=i;k<=j;k++){

					sum=sum+arr[k];
				}
				if(sum>max){

					max=sum;
				}
			}
		}
		System.out.println(max);
	}
}