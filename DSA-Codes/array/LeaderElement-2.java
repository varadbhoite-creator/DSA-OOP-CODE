class Demo{

	public static void main(String[]args){

		int arr[]={16,17,4,3,5,2,9};
		int len=arr.length;
		int max=Integer.MIN_VALUE;

		for(int i=len-1;i>=0;i--){

			if(arr[i]>=max){
				
				max=arr[i];
				System.out.println(arr[i]);
			}
		}
	}
}