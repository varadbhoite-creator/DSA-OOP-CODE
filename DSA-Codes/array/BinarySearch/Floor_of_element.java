class Demo{

	static int index(int arr[],int tar){

		int left=0;
		int right=arr.length-1;
		int index=0;

		while(left<=right){

			int mid=(left+right)/2;

			if(arr[mid]<=tar){

				if(mid>index){

					index=mid;
				}
				right=mid-1;
			}else if(tar>arr[mid]){

				right=mid-1;
			}else{

				left=mid+1;
			}	
		}
		return index;
	}
		
	public static void main(String[]args){

		int arr[]={2,4,6,8,10,12};
		int tar=12;

		System.out.println(index(arr,tar));
	}
}