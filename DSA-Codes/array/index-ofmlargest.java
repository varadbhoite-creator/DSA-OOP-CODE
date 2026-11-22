class Demo{

	public static void main(String[]args){

		int arr[]={5,18,3,10};
		int len=arr.length;
		int max=0;
		int index=0;

		for(int i=0;i<len;i++){

			if(arr[i]>max){

				max=arr[i];
				index=i;
			}
		}
		System.out.println(index);
	}
}