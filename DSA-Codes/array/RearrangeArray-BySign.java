import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr[]={1,2,-3,-4};
		int len=arr.length;
		int arr1[]=new int[len];
		int a=0;
		int b=0;
	
		for(int i=0;i<len;i++){

			if(i%2==0){

				for(int j=a;j<len;j++){

					if(arr[j]>0){

						arr1[i]=arr[j];
						a=j+1;
						break;
					}
				}
			}else{

				for(int j=b;j<len;j++){

					if(arr[j]<0){

						arr1[i]=arr[j];
						b=j+1;
						break;
					}
				}
			}
		}
		System.out.println(Arrays.toString(arr1));
	}
}