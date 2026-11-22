class Demo{

	static int solution(int arr[]){

		int len=arr.length;
		int left=1;
		int right=len-2;
		int index=0;

		while(left<=right){

			int mid=(right+left)/2;

			if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){

				index=mid;
				break;
			}else if(arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1]){

				right=mid-1;
			}else{

				left=mid+1;
			}
		}
		return index;
	}

	public static void main(String[]args){

		int arr[]={0,1,2,3,4,2,1};

		System.out.println(solution(arr));
		
	}
}