class Demo{

	public static void main(String[]args){

		int arr[]={2,5,2,7,2};
		int len=arr.length;
		int key=7;
		int count=0;

		for(int i=0;i<len;i++){

			if(arr[i]==key){

				count++;
			}
		}
		System.out.println(count);
	}
}