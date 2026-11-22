class Demo{

	static int solution(int arr[],int tar){

		int len=arr.length;
		int left=0;
		int right=len-1;
		int index=-1;

		while(left<=right){

			int mid=(right+left)/2;

			if(tar==arr[mid]){

				index=mid;
				break;
			}else if(tar<arr[mid]){

				left=mid+1;
			}else{

				right=mid-1;
			}
		}
		return index;
	}
		
	public static void main(String[]args){

		int arr[]={90,80,70,60,50,40};
		int tar=40;
	
		System.out.println(solution(arr,tar));
	}
}