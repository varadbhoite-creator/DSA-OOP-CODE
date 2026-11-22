class Demo{

	public static void main(String[]args){

		int arr[]={-1,3,-2};
		int len=arr.length;
		int max=0;

		for(int i=0;i<len;i++){

			int sum=0;
			
			for(int j=0;j<len;j++){

				sum=sum+arr[j];
			
				if(sum>max){

					max=sum;
				}
			}
		}
		System.out.println(sum);
	}
}