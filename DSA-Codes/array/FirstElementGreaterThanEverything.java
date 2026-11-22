class Demo{

	public static void main(String[]args){

		int arr[]={5,7,9,2,4,3,10};
		int len=arr.length;
		int max=Integer.MIN_VALUE;
		

		for(int i=0;i<len;i++){

			Boolean largest=true;
			for(int j=i+1;j<len;j++){

				if(arr[i]<arr[j]){

					largest=false;
					break;
				}
			}
			if(largest){

				if(arr[i]>max){

					max=arr[i];
				}
			}
		}
		System.out.println(max);
	}
}