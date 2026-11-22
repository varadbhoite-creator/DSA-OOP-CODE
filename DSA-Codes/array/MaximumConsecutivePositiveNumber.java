class Demo{

	public static void main(String[]args){

		int arr[]={2,5,-1,4,6,8,8,-3,7,9};
		int len=arr.length;
		int max=Integer.MIN_VALUE;
		int count=0;

		for(int i=0;i<len;i++){

			if(arr[i]>=0){

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