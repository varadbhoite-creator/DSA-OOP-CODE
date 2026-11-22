class Demo{

	public static void main(String[]args){

		int arr[]={12,45,7,89,23,100,1000};
		int len=arr.length;
		int max=0;

		for(int i=0;i<len;i++){

			if(arr[i]>max){

				max=arr[i];
			}
		}
		System.out.println(max);
	}
}