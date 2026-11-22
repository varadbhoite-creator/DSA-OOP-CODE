class Demo{

	public static void main(String[]args){

		int arr[]={9,5,8,11,7};
		int len=arr.length;
		int min=arr[0];

		for(int i=0;i<len;i++){

			if(arr[i]%2!=0){

				if(arr[i]<min){

					min=arr[i];
				}
			}
		}
		System.out.println(min);
	}
}