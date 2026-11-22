class Demo{

	public static void main(String[]args){

		int arr[]={1,2,3,4,5};
		int len=arr.length;
		Boolean positive=true;

		fot(int i=0;i<len;i++){

			if(arr[i]<0){

				positive=false;
				break;
			}
		}
		if(positive){
			System.out.println(positive);
		}else{
			System.out.println("negative");
		}
	}
}