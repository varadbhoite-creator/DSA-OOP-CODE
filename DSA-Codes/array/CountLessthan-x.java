class Demo{

	public static void main(String[]args){

		int arr[]={5,8,2,9,6};
		int len=arr.length;
		int count=0;
		int x=2;

		for(int i=0;i<len;i++){

			if(arr[i]<x){

				count++;
			}
		}
		System.out.println(count);
	}
}