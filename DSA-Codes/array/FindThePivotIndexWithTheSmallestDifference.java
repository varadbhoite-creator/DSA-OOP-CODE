class Demo{

	public static void main(String[]args){

		int arr[]={10,2,3,4,5};
		int len=arr.length;
		int min=Integer.MAX_VALUE;
		int element=0;
		int diff=0;

		for(int i=0;i<len;i++){

			int left=0;
			int right=0;
		
			for(int j=0;j<i;j++){

				left=left+arr[j];
			}

			for(int j=i+1;j<len;j++){

				right=right+arr[j];
			}

			if(left>right){

				diff=left-right;
			}else{

				diff=right-left;
			}
			if(diff<min){

				min=diff;
				element=i;
			}
		}
		System.out.println(element);
	}
}