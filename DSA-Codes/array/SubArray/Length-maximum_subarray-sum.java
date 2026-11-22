class Demo{

	public static void main(String[]args){

		int arr[]={-2,1,-3,4,-1,2,1,-5};
		int len=arr.length;
		int sum=0;
		int count=0;
		int max=Integer.MIN_VALUE;
		int arrlen=0;
		int templen=0;


		for(int i=0;i<len;i++){

			sum=sum+arr[i];
			count++;
			if(sum>max){

				max=sum;
				templen=count;
			}
			if(sum<0){

				sum=0;
				count=0;
			}
		}
		System.out.println(templen);
	}
}