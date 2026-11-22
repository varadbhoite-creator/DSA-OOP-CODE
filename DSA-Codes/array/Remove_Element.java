class Demo{

	public static void main(String[]args){

		int arr[]={0,1,2,2,3,0,4,2};
		int len=arr.length;
		int count=0;
		int k=2;

		for(int i=0;i<len;i++){

			if(arr[i]!=k){

				count++;
				System.out.println(arr[i]);
			}
		}
		System.out.println(count);
	}
}