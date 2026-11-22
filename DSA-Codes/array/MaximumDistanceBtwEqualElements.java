class Demo{

	static int solution(int arr[]){

		int len=arr.length;
		int max=Integer.MIN_VALUE;
	
		for(int i=0;i<len;i++){

			for(int j=i+1;j<len;j++){

				int dist=j-i;

				if(dist>max){

					max=dist;
				}
			}
		}
		return max;
	}

	public static void main(String[]args){

		int arr[]={1,2,3,1,4,2,1};

		System.out.println(solution(arr));
	}
}