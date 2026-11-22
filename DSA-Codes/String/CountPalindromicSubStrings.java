import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		int len=s.length();
		int count=0;

		for(int i=0;i<len;i++){

			for(int j=i;j<len;j++){

				StringBuffer sb=new StringBuffer();
				for(int k=i;k<=j;k++){

					sb.append(s.charAt(k));
				}
				StringBuffer sb1=new StringBuffer();
				int len1=sb.length();
				for(int a=len1-1;a>=0;a--){
				
					sb1.append(sb.charAt(a));
				}
				String s1=sb.toString();
				String s2=sb1.toString();
				if(s1.equals(s2)){

					count++;
				}
			}
		}
		System.out.println(count);
	}
}