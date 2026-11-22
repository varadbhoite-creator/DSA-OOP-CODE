class Demo{

	public static void main(String[]args){

		int arr[]={1,2,3,4,5,6,2};
		int len=arr.length;
		int sum=0;

		for(int i=0;i<len;i++){

			if(arr[i]%2!=0){

				sum=sum+arr[i];
			}
		}
		System.out.println(sum);
	}
}