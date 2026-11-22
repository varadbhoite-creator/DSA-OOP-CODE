class Demo{

	public static void main(String[]args){

		int arr[]={1,5,8,3,9};
		int len=arr.length;
		int tar=-10;
		int i=0;
		int j=len-1;

		while(i<j){

			if((arr[i]+arr[j])==tar){

				System.out.println(""+"["+i+","+j+"]");
				i++;
			}else{

				j--;
			}

		}
	
	}
}