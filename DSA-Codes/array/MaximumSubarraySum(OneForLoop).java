class Demo{

		public static void main(String[]args){

			int arr[]={-10,11,-10};
			int len=arr.length;
			int j=len;
			int max=Integer.MIN_VALUE;
			int sum=0;

			for(int i=0;i<len;i++){

				sum=sum+arr[i];
				if(sum>max){

					max=sum;
				}

				if(i==len-1){

					i=len-j;
					j--;
					sum=0;
				}
			}
		System.out.println(max);
		}
}