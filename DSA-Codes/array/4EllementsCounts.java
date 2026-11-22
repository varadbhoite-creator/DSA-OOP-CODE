class Demo{

	public static void main(String[]args){
	
		int arr[]={1,2,3,4,5,6};
		int len=arr.length;
		int count=0;

		for(int i=0;i<=len-4;i++){

			for(int j=i+1;j<=len-3;j++){

				for(int k=j+1;k<=len-2;k++){

					for(int l=k+1;l<=len-1;l++){

						System.out.println("("+arr[i]+","+arr[j]+","+arr[k]+","+arr[l]+")");
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}		