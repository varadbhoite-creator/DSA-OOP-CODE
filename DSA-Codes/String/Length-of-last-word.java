import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.nextLine();
		String []arr=s.split(" ");
		int len=arr.length;
	
		for(int i=len-1;i>=0;i--){

			String s1=arr[i];
			int s1len=s1.length();
			System.out.println(s1len);
			break;
		}
	}
}