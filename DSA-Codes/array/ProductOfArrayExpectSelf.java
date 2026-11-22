class Demo{

	public static void main(String[]args){

		int arr[]={1,2,3,4};
		int len=arr.length;	

		for(int i=0;i<len;i++){
	
			int pro=1;
			for(int j=0;j<len;j++){

				if(j!=i){
		
					pro=pro*arr[j];
				}
			}
			System.out.print(pro+" ");
		}		
	}
}