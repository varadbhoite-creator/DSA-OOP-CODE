class Demo{

	public static void main(String[]args){

		int arr[]={2,3,-2,4,-1};
		int len=arr.length;
		int max=0;
		int pro=1;

		for(int i=0;i<len;i++){

			for(int j=i;j<len;j++){
		
				pro=1;
				for(int k=i;k<=j;k++){

					pro=pro*arr[k];
				}
				if(pro>max){

					max=pro;
				}
			}
		}
		System.out.println(max);
	}
}