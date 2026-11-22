class Demo{

	public static void main(String[]args){

		int arr[]={5,1,9};
		int len=arr.length;
		int sum=0;
		int k=1;
		int max=0;

		for(int i=0;i<len-1;i++){

			for(int j=i+1;j<len;j++){

				if((j-i)>=k){

					sum=arr[i]+arr[j];
					if(sum>max){

						max=sum;
					}
				}
			}
		}
		System.out.println(max);	
	}
}