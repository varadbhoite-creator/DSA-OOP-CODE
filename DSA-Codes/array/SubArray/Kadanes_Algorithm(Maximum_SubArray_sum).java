class Demo{

	public static void main(String[]args){

		int arr[]={1,2,3,4};
		int len=arr.length;
		int sum=0;
		int max=Integer.MIN_VALUE;
	
		for(int i=0;i<len;i++){

			sum=sum+arr[i];
			if(sum>max){

				max=sum;
			}
			if(sum<0){

				sum=0;
			}
		}
		System.out.println(max);
	}
}