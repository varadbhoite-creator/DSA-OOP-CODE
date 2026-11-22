class Demo{

	public static void main(String[]args){

		int arr[]={-2,1,-3};
		int len=arr.length;
		int sum=0;
		int max=Integer.MIN_VALUE;

		for(int i=0;i<len;i++){

			if(arr[i]>0){

				sum=sum+arr[i];
			}else{

				sum=0;
			}
			if(sum>max){

				max=sum;
			}
		}
		System.out.println(max);
	}
}