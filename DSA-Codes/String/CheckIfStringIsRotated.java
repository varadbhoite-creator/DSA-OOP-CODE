import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string s1:");
		String s1=sc.next();
		System.out.println("Enter string s2:");	
		String s2=sc.next();
		s1=s1.toLowerCase();
		char []arr=s1.toCharArray();
		int len=arr.length;
		int index=s2.indexOf('a');

		for(int i=0;i<index;i++){

			for(int j=0;j<len-1;j++){

				char temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		String s3=new String(arr);
		System.out.println(s3.equals(s2));
	}
}