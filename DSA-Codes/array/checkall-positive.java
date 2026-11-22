class Demo{

	public static void main(String[]args){

		int arr[]={1,2,3,4,5,-3};
		int len=arr.length;
		boolean positive=true;

		for(int i=0;i<len;i++){

			if(arr[i]<0){

				positive=false;
				break;
			}
		}
		if(positive){
			System.out.println("positive");
		}else{
			System.out.println("negative");
		}
	}
}