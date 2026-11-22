class Demo{

	public static void main(String[]args){

		int arr[]={5,8,2,9,6,9,8,7};
		int len=arr.length;
		int x=5;
		int count=0;
	
		for(int i=0;i<len;i++){

			if(arr[i]>x){

				count++;
			}
		}
		System.out.println(count);
	}
}