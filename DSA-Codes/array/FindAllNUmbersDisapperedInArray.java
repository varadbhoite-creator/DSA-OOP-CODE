class Demo{

	static void solution(int arr[]){

		int len=arr.length;		
		int newarr[]=new int[len+1];
		int len1=newarr.length;
	
		for(int i=0;i<len;i++){

			newarr[arr[i]]++;
		}

		for(int i=1;i<len1;i++){

			if(newarr[i]==0){

				System.out.println(i);
			}
		}
	}
	public static void main(String[]args){

		int arr[]={1,1};

		solution(arr);
	}
}