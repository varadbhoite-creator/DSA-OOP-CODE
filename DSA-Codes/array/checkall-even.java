class Demo{

	public static void main(String[]args){

		int arr[]={2,4,6,8,9};
		int len=arr.length;
		Boolean even=true;

		for(int i=0;i<len;i++){

			if(arr[i]%2!=0){

				even=false;
				break;
			}
		}
		if(even){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
}