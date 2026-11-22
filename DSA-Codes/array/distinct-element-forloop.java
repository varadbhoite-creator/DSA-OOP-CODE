class Demo{

	public static void main(String[]args){

		int arr[]={1,2,2,3,4,4,5,6,5,6,7,8,9,0,9,8,7,6,1,2,3,4,3};
		int len=arr.length;
		int count=0;
		int foundcount=0;
		int distinct=0;
		Boolean isfound=false;

		for(int i=0;i<len;i++){
			
			for(int k=0;k<=i;k++){

				if(arr[i]==arr[k]){

				 	foundcount++;
				}
			}
		
			if(foundcount==1){
				isfound=true;
			}
			
			if(isfound){
				distinct++;
			}
			isfound=false;
			count=0;
			foundcount=0;
		}
		System.out.println(distinct);
	}
}