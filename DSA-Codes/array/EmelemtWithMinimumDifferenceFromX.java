class Demo{

	public static void main(String[]args){

		int arr[]={2,5,8,12,16};
		int len=arr.length;	
		int min=Integer.MAX_VALUE;
		int diff=0;
		int x=10;
		int element=0;

		for(int i=0;i<len;i++){

			if(arr[i]>x){

				diff=arr[i]-x;
			}else{

				diff=x-arr[i];
			}

			if(diff<min){

				min=diff;
				element=arr[i];
			}
		}
		System.out.println(element);
	}
}