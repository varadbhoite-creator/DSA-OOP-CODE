class Demo{

	public static void main(String[]args){

		int arr[]={-10,-3,5,6,-2};
		int len=arr.length;
		int pro=0;
		int max=0;

		for(int i=0;i<len-1;i++){

			for(int j=i+1;j<len;j++){

				pro=arr[i]*arr[j];
				if(pro>max){

				max=pro;

				}

			}
		}
		System.out.println(max);
	}
}