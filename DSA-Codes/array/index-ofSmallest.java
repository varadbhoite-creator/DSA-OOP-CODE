class Demo{

	public static void main(String[]args){

		int arr[]={1,5,18,3,10,0};
		int len=arr.length;
		int min=arr[len-1];
		int index=0;

		for(int i=0;i<len;i++){

			if(arr[i]<=min){

				min=arr[i];
				index=i;
			}
		}
		System.out.println(index);
	}
}