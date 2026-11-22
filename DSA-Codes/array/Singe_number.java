class Demo{

	static int solution(int arr[]){

		int len=arr.length;
		int max=Integer.MIN_VALUE;
	
		for(int i=0;i<len;i++){

			if(arr[i]>max){

				max=arr[i];
			}
		}

		int newarr[]=new int[max+1];
		int len1=newarr.length;

		for(int i=0;i<len;i++){

			newarr[arr[i]]++;
		}
	
		int element=0;
		
		for(int i=0;i<len1;i++){

			if(newarr[i]==1){

				element=i;
				break;
			}
		}
		return element;
	}

	public static void main(String[]args){

		int arr[]={1};

		System.out.println(solution(arr));
	}
}