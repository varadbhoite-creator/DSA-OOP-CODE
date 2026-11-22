class Demo{

	public static void main(String[]args){

		int arr1[]={1,10,20,40,80,90};
		int arr2[]={6,7,90,20,80,100};
		int arr3[]={3,4,15,20,30,90,70,80,120};
		int len1=arr1.length;
		int len2=arr2.length;
		int len3=arr3.length;

		for(int i=0;i<len1;i++){

			Boolean found1=false;
			Boolean found2=false;

			for(int j=0;j<len2;j++){

				if(arr1[i]==arr2[j]){

					found1=true;
					break;
				}
			}
			for(int j=0;j<len3;j++){

				if(arr1[i]==arr3[j]){

					found2=true;
					break;
				}
			}
			if(found1==true && found2==true){

				System.out.println(arr1[i]);
			}
		}
	}
}