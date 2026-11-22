class Demo{

	public static void main(String[]args){

		int arr[]={1,2,3,4,5};
		int len=arr.length;
		int left=0;
		int right=len-1;
		Boolean isfound=false;
		int index=0;
		int tar=4;

		while(left<=right){

			int mid=left+(right-left)/2;
			
			if(tar==arr[mid]){

				isfound=true;
				index=mid;
			}

			if(tar<arr[mid]){

				right=mid-1;
			}else{

				left=mid+1;
			}
		}
		if(isfound){

			System.out.println(index);
		}else{

			System.out.println("-1");
		}
	}
}