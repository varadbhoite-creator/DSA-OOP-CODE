class Demo{

	public static void main(String[]args){

		int arr[]={4,5,2,5,4,3,2};
		int len=arr.length;
		int count=0;
		int foundcount=0;
		Boolean isfound=false;
	
		for(int i=0;i<len;i++){

			for(int j=0;j<len;j++){

				if(arr[i]==arr[j]){

					count++;
				}
			}
			for(int k=0;k<=i;k++){

				if(arr[i]==arr[k]){

					foundcount++;
				}
			}
			if(foundcount==1){

				isfound=true;
			}
			if(isfound){

				if(count==1){

					System.out.println(arr[i]);
					break;
				}
			}
			count=0;
			foundcount=0;
			isfound=false;
		}
	}
}