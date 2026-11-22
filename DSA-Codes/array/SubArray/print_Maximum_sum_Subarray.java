class Demo{

	public static void main(String[]args){

		int arr[]={3,-2,5,-1,6,-3,2};
		int len=arr.length;
		int max=Integer.MIN_VALUE;
		int start=0;
		int end=0;

		for(int i=0;i<len;i++){

			int sum=0;
	
			for(int j=i;j<len;j++){

				sum=sum+arr[j];
				if(sum>max){
					max=sum;
					start=i;
					end=j;
				}
			}
		}
		for(int i=start;i<=end;i++){

			System.out.print(arr[i]);
		}
	}
}