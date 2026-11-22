import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.nextLine();
		String []arr=s.split(" ");
		int len=arr.length;
		String news="";

		for(int i=0;i<len;i++){

			String s1=new String(arr[i]);
			int s1len=s1.length();
			String rev="";
			for(int j=s1len-1;j>=0;j--){

				rev=rev+s1.charAt(j);
			}
			 news=news+rev+" ";
		}
		String new1=news.trim();
		System.out.println(new1);
	}
}

	
