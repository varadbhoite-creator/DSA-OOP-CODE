class Demo{

	public static void main(String[]args){

		int arr[]={6,2,4,5,7,9,1,0};
		int len=arr.length;
		int min=arr[0];
		int secmin=arr[0];
	
		for(int i=0;i<len;i++){

			if(arr[i]<min){

				min=arr[i];
			}
		}
		System.out.println(min);
		for(int i=0;i<len;i++){

			if(arr[i]>min && arr[i]<secmin){

				secmin=arr[i];
			}
		}
		System.out.println(secmin);
	}
}