class Demo{

	public static void main(String[]args){

		int arr[]={1,-2,5,-1,2};
		int len=arr.length;
		int max=Integer.MIN_VALUE;
		int sum=0;
		int start1=0;
		int start=0;
		int end=0;
	
		for(int i=0;i<len;i++){

			if(sum==0){

				start1=i;
			}
			sum=sum+arr[i];
			if(sum>max){

				max=sum;
				start=start1;
				end=i;
			}
			if(sum<0){

				sum=0;
			}
		}
		System.out.println("Start :"+start);
		System.out.println("end :"+end);
	}
}