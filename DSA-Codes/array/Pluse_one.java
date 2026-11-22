import java.util.*;
class Demo{

	public static void main(String[]args){

		int arr[]={9};
		int len=arr.length;
		int num=0;
	
		for(int i=0;i<len;i++){

			num=num*10+arr[i];
		}
		num=num+1;
		int newarr[]=new int[2];
		int rem=0;
		int i=1;
		while(num>0){
	
			rem=num%10;
			newarr[i]=rem;
			i--;
			num=num/10;
		}
		System.out.println(Arrays.toString(newarr));
	}
}