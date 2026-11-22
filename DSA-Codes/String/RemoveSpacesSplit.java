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

			sb.append(arr[i]);
		}
		System.out.println(sb.toString());
	}
}