import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String s1:");
		String s1=sc.next();
		System.out.println("Enter String s2:");
		String s2=sc.next();
		int len1=s1.length();
		int len2=s2.length();
		int count=0;
	
		for(int i=0;i<len1;i++){

			for(int j=i;j<len1;j++){

				StringBuffer sb=new StringBuffer();
				for(int k=i;k<=j;k++){

					sb.append(s1.charAt(k));
				}
				String s3=sb.toString();
				if(s2.equals(s3)){

					count++;
				}
			}
		}
		System.out.println(count);
	}
}