class Demo{

	public static void main(String[]args){

		int arr[]={-2,-3,-1,-4};
		int len=arr.length;
		int max=Integer.MIN_VALUE;

		for(int i=0;i<len;i++){

			int sum=0;
			
			for(int j=i;j<len;j++){

				sum=sum+arr[j];
			
				if(sum>max){

					max=sum;
				}
			}
		}
		System.out.println(max);
	}
}