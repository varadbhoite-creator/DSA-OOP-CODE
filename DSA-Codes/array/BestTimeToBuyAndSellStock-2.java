class Demo{

	public static void main(String[]args){

		int arr[]={7,1,5,3,6,4};
		int k=2;
		int len=arr.length;
		int max=0;
		int index=0;	
		int sum=0;
		int b=0;

		for(int a=0;a<k;a++){

			for(int i=b;i<len-1;i++){

				for(int j=i+1;j<len;j++){

					int profit=arr[j]-arr[i];
					if(profit>max){

						max=profit;
						index=i;
					}
				}
			}
			sum=sum+max;
			max=0;
			b=index+1;
		}
		System.out.println(sum);
	}
}