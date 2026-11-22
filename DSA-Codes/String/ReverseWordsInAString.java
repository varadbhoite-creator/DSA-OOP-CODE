import java.util.*;
class Demo{

	public static void main(String []args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.nextLine();
		String []arr=s.split(" ");
		int len=arr.length;
		StringBuffer sb=new StringBuffer();
		
		for(int i=len-1;i>=0;i--){

			sb.append(arr[i]);
			sb.append(" ");
		}
		String s1=sb.toString();
		s1=s1.trim();
		System.out.println(s1);
	}
}