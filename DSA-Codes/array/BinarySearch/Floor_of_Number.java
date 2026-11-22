class Demo{

	static int solution(int arr[],int tar){

		int left=0;
		int right=arr.length-1;
		int max=0;
		int index=-1;

		while(left<=right){

			int mid=(right+left)/2;

			if(tar>=arr[mid]){

				left=mid+1;

				if(arr[mid]<=tar){
					
					index=arr[mid];
				}
			}else{

				right=mid-1;

				if(arr[mid]<=tar){

					index=arr[mid];
				}
			}
		}
		return index;
	}

	public static void main(String[]args){

		int arr[]={10,20,30,40,50};
		int tar=70;

		System.out.println(solution(arr,tar));
	}
}