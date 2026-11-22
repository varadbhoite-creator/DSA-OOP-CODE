class Demo{

	public static void main(String[]args){

		int arr[]={1,3,5,7,8,9};
		int len=arr.length;
		Boolean odd=true;

		for(int i=0;i<len;i++){

			if(arr[i]%2==0){

				odd=false;
				break;
			}
		}
		if(odd){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
}