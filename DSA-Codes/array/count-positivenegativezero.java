class Demo{

	public static void main(String[]args){

		int arr[]={5,-2,0,8,-7,0,0,0,0};
		int len=arr.length;
		int positive=0;
		int negative=0;
		int zero=0;

		for(int i=0;i<len;i++){
			
			if(arr[i]==0){

				zero++;
			}else if(arr[i]<0){
			
				positive++;
			}else{

				negative++;
			}			
		}		
		System.out.println(""+"zero"+"="+zero);
		System.out.println(""+"positive"+"="+positive);
		System.out.println(""+"negative"+"="+negative);
	}
}