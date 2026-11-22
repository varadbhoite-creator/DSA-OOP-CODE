class Demo{

	public static void main(String[]args){

		int arr[]={3,4,-2,1,2,-3};
		int len=arr.length;
		int k=5;
		int count=0;
	
		for(int i=0;i<len;i++){

			int sum=0;
	
			for(int j=i;j<len;j++){

				sum=sum+arr[j];

				if(sum==k){

					count++;
				}
			}
		}
		System.out.println(count);
	}
}