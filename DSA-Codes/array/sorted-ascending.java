class Demo{

	public static void main(String[]args){

		int arr[]={1,2,3,4,5,8};
		int len=arr.length;
		Boolean isascending=true;
		int a=0;
		for(int i=0;i<len;i++){

			if(arr[i]<a){

				isascending=false;
				break;
			}else{

				a=arr[i];
			}
		}
		if(isascending){
			System.out.println(isascending);
		}else{

			System.out.println(isascending);
		}
	}
}