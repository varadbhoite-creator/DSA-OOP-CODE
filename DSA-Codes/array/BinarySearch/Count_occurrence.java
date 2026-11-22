class Demo{

	static int count(int arr[],int tar){

		int len=arr.length;
		int left=0;
		int right=len-1;
		int count=0;

		while(left<=right){

			int mid=(left+right)/2;

			if(tar==arr[mid]){

				count++;	
				right=mid-1;
			}else if(tar>arr[mid]){

				left=mid+1;
			}else{

				right=mid-1;
			}
		}
		left=0;
		right=len-1;
		while(left<=right){

			int mid=(left+right)/2;


			if(tar==arr[mid]){

				count++;
				left=mid+1;
			}else if(tar>arr[mid]){

				left=mid+1;
			}else{

				right=mid-1;
			}
		}
		return count;
	}
	
	public static void main(String[]args){

		int arr[]={10,20,20,20,30};
		int tar=20;
		int len=arr.length;
		System.out.println(count(arr,tar)-1);
	}
}