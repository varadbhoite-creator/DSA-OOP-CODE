class Demo{

		public static void main(String[]args){

			int arr[]={4,2,-3,1,6};
			int len=arr.length;
	
			for(int i=0;i<len;i++){
		
				for(int j=i;j<len;j++){
		
					int sum=0;
					for(int k=i;k<=j;k++){

						sum=sum+arr[k];
					}
					if(sum==0){

						System.out.println("yes");
						break;
					}
				}	
			}
		}
	}
