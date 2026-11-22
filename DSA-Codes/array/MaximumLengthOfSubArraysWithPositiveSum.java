class Demo{

	public static void main(String[]args){

		int arr[]={-1,-2,-3,0,1};
		int len=arr.length;
		int max=0;
		
		for(int i=0;i<len;i++){

			for(int j=i;j<len;j++){
		
				int count=0;
				int pro=1;
		
				for(int k=i;k<=j;k++){

					pro=pro*arr[k];
					count++;
				}

				if(pro>0){

					if(count>max){

						max=count;
					}
				}
			}
		}
		System.out.println(max);
	}
}