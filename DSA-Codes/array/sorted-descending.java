class Demo{

	public static void main(String[]args){

		int arr[]={9,7,8,5,3,2};
		int len=arr.length;
		int a=arr[0];
		Boolean isdescending=true;

		for(int i=0;i<len;i++){

			if(arr[i]<=a){

				a=arr[i];
			}else{

				isdescending=false;
				break;
			}
		}
		if(isdescending){
			System.out.println(isdescending);
		}else{
			System.out.println(isdescending);
		}
	}
}