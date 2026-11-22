import java.util.*;
class Demo{

	public static void main(String[]args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter target:");
		int arr[]={1};
		int tar=sc.nextInt();
		int len=arr.length;
		boolean find=false;
		int index=-1;

		for(int i=0;i<len;i++){

			if(arr[i]==tar){

				index=i;
				find=true;
				break;
			}
		}
		if(find){
			System.out.println(index);
		}else{

			System.out.println(index);
		}
	}
}