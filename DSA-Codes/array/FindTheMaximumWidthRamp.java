class Demo{

	static int solution(int arr[]){

		int len=arr.length;
		int max=Integer.MIN_VALUE;
		int diff=0;

		for(int i=0;i<len;i++){

			for(int j=i+1;j<len;j++){

				if(arr[i]<=arr[j]){

					diff=j-i;
				}

				if(diff>max){

					max=diff;
				}
			}
		}
		return max;
	}

	public static void main(String[]args){

		int arr[]={6,0,8,2,1,5};
		
		System.out.println(solution(arr));
	}
}		