class Demo{

	public static void main(String[]args){

		int arr[]={2,4,6,3,8,10,12,14,5};
		int len=arr.length;
		int max=Integer.MIN_VALUE;
		int count=0;

		for(int i=0;i<len;i++){

			if(arr[i]%2==0){

				count++;
			}else{

				count=0;
			}

			if(count>max){

				max=count;
			}
		}
		System.out.println(max);
	}
}