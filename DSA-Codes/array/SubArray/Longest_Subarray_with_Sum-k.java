class Demo{

	public static void main(String[]args){

		int arr[]={2,-2,2,-2,2,-2};
		int len=arr.length;
		int k=0;
		int largest=0;
		
		for(int i=0;i<len;i++){

			int sum=0;
			int count=0;

			for(int j=i;j<len;j++){

				count++;
				sum=sum+arr[j];
				if(sum==k){

					if(count>largest){

						largest=count;
					}
				}
			}
		}
		System.out.println(largest);
	}
}