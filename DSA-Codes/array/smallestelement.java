class Demo{

	public static void main(String[]args){

		int arr[]={12,45,7,89,23,2,1};
		int len=arr.length;
		int min=arr[0];

		for(int i=0;i<len;i++){

			if(arr[i]<min){

				min=arr[i];
			}
		}
		System.out.println(min);
	}
}