class Demo{

	public static void main(String[]args){

		int arr[]={0,1,0,1,0,1,0,1};
		int len=arr.length;
		int zerocount=0;
		int onecount=0;
		int count=0;
		int max=0;
		
		for(int i=0;i<len;i++){

			for(int j=i;j<len;j++){

				for(int k=i;k<=j;k++){
	
					count++;
					if(arr[k]==0){

						zerocount++;
					}else{

						onecount++;
					}
				}
				if(zerocount==onecount){

					if(count>max){

						max=count;
					}
		
				}
				count=0;
				zerocount=0;
				onecount=0;
			}
		}
		System.out.println(max);
	}
}