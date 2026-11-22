class Demo{

	static int index(int arr[],int tar){

		int len=arr.length;
		int left=0;
		int right=len-1;
		int index=-1;

		while(left<=right){

			int mid=(left+right)/2;

			if(tar==arr[mid]){

				index=mid;
				left=mid+1;
			}else if(tar>arr[mid]){

				left=mid+1;
			}else{

				right=mid-1;
			}
		}
		return index;
	}

	public static void main(String[]args){
		
		int arr[]={10,20,20,20,30};
		int tar=20;
		System.out.println(index(arr,tar));
	}
}	