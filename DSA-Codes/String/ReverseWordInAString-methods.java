import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.nextLine();
		String []arr=s.split(" ");
		int len=arr.length;
		StringBuffer sb=new StringBuffer();
		

		for(int i=0;i<len;i++){
		
			StringBuffer sb1=new StringBuffer(arr[i]);
			sb1=sb1.reverse();
			
			sb.append(sb1);
			sb.append(" ");
		}
		String s1=sb.toString();
		String s2=s1.trim();
		System.out.println(s2);
	}
}