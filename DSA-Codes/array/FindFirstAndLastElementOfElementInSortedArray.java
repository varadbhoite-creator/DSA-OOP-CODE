import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		int arr[]={};
		System.out.println("Enetr target:");
		int tar=sc.nextInt();
		int index=0;
		int count=0;

		for(int i=0;i<arr.length;i++){

			if(arr[i]==tar){

				count++;
				index=i;
			}
			if(count==1){

				System.out.print(i+",");

			}
		}
		if(count==0){

			System.out.println(""+(-1)+","+(-1));
		}else{

			System.out.println(index);
		}
	}
}