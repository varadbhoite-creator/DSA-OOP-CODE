class Demo{

	public static void main(String[]args){

		int arr[]={4,3,5,6,7,1};
		int len=arr.length;
		int max=0;
		int secmax=0;

		for(int i=0;i<len;i++){

			if(arr[i]>max){
				max=arr[i];
			}
		}
		System.out.println(max);
		for(int i=0;i<len;i++){

			if(arr[i]<max && arr[i]>secmax){

				secmax=arr[i];
			}
		}
		System.out.println(secmax);
	}
}