class Demo{

	static int solution(int arr[]){

		int len=arr.length;
		int max=Integer.MIN_VALUE;

		for(int i=0;i<len-2;i++){

			for(int j=i+1;j<len-1;j++){

				for(int k=j+1;k<len;k++){

					int product=arr[i]*arr[j]*arr[k];
					if(product>max){

						max=product;
					}
				}
			}
		}
		return max;
	}

	public static void main(String[]args){

		int arr[]={-10,-10,5,2};
		
		System.out.println(solution(arr));
	}
}