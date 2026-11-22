class Demo{

	public static void main(String[]args){

		int arr[]={1,2,3,4};
		int len=arr.length;
		System.out.println(" ");
		for(int i=0;i<len;i++){

			for(int a=i;a<=i;a++){

				System.out.println(arr[a]);
			}
			for(int a=i+1;a<len;a++){

				System.out.println(arr[i]+","+arr[a]);
			}
			for(int a=i+1;a<len-1;a++){

				for(int b=a+1;b<len;b++){

					System.out.println(arr[i]+","+arr[a]+","+arr[b]);
				}
			}
		}
		for(int i=0;i<len;i++){

			System.out.print(arr[i]);
		}
	}
}	