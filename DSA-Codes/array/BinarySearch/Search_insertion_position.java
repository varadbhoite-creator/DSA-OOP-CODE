class Demo{

	static int index(int arr[],int tar){

		int len=arr.length;
		int left=0;
		int right=len-1;
		int index=0;

		while(left<=right){

			int mid=(right+left)/2;

			if(tar==arr[mid]){

				index=mid;
				break;
			}else if(mid==0 && arr[mid]>tar){

				index=mid;
				break;
			}else if(mid==len-1 && tar>arr[mid]){

				index=len;
				break;
			}else if(tar<arr[mid] && tar>arr[mid-1]){

				index=mid;
				break;
			}else if(tar>arr[mid] && tar<arr[mid+1]){

				return mid+1;
			}else if(tar>arr[mid]){

				left=mid+1;
			}else{

				right=mid-1;
			}

		}
		return index;
	}

	public static void main(String[]args){

		int arr[]={1,3,5,6};
		int tar=10;

		System.out.println(index(arr,tar));
	}
}