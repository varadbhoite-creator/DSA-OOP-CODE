class Demo{

	public static void main(String[]args){

		int arr[]={100,200,300,400};
		int len=arr.length;
		int sum=0;

		for(int i=0;i<len;i++){

			sum=sum+arr[i];
		}
		int avg=sum/len;
		System.out.println(avg);
	}
}