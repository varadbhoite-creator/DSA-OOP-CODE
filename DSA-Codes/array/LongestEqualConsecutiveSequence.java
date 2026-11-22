class Demo{

	public static void main(String[]args){

		int arr[]={2,2,3,3,3,4,4,2};
		int len=arr.length;
		int count=1;
		int max=Integer.MIN_VALUE;

		for(int i=0;i<len-1;i++){

			if(arr[i]==arr[i+1]){

				count++;
			}else{

				count=1;
			}

			if(count>max){

				max=count;
			}
		}
		System.out.println(max);
	}
}