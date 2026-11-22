import java.util.*;
class Demo{
	
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter target:");
		int arr[]={1,3,5,6};
		int len=arr.length;
		int tar=sc.nextInt();
		Boolean found=false;
		int index=0;

		for(int i=0;i<len;i++){

			if(tar>arr[i] && tar<arr[i+1]){

				found=true;
				index=i+1;
				break;
			}else if(tar==arr[i]){
				found=true;
				index=i;
				break;	
			}
		}
		if(found){

			System.out.println(index);
		}else{

			System.out.println(len);
		}
	}
}