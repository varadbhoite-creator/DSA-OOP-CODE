class Demo{

	public static void main(String[]args){

		int arr[]={2,3,4,2};
		int len=arr.length;		
		int product=1;

		for(int i=0;i<len;i++){

			product=product*arr[i];
		}
		System.out.println(product);
	}
}