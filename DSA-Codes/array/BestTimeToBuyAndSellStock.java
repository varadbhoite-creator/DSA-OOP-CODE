class Demo{

	public static void main(String[]args){

		int arr[]={7,1,5,3,6,4};
		int len=arr.length;
		int max=0;

		for(int i=0;i<len-1;i++){

			for(int j=i+1;j<len;j++){

				int profit=arr[j]-arr[i];
				if(profit>max){

					max=profit;
				}
			}
		}
		System.out.println(max);
	}
}