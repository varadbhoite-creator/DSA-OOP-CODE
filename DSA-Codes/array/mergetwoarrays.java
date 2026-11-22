import java.util.*;
class Demo{

	public static void main(String[]args){

		int a[]={1,3,5,8,9,7};
		int b[]={2,4,6,2,5,9};
		int alen=a.length;
		int blen=b.length;
		int arr[]=new int[alen+blen];
		int len=arr.length;
		int j=0;
		
		for(int i=0;i<len;i++){

			if(i<alen){
				arr[i]=a[i];
			}else{
				arr[i]=b[j];
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}