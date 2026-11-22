class Demo{

	public static void main(String[]args){
	
		int arr[]={4,7,2,9,5,8};
		int len=arr.length;
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<len-1;i++){

			int sum=arr[i]+arr[i+1];

			if(sum>max){

				max=sum;
			}
		}
		System.out.println(max);
	}
}