class Demo{

	static int solution(int arr[]){

		int len=arr.length;
		int altitude=0;
		int max=Integer.MIN_VALUE;
		if(altitude>max){

			max=altitude;
		}
		
		for(int i=0;i<len;i++){

			altitude=altitude+arr[i];

			if(altitude>max){

				max=altitude;
			}
		}
		return max;
	}

	public static void main(String[]args){

		int arr[]={-4,-3,-2,-1,4,3,2};

		System.out.println(solution(arr));
	}
}