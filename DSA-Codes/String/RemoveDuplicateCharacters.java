import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int len=s.length();
		int count=0;
		String s1="";

		for(int i=0;i<len;i++){

			char ch=s.charAt(i);
			for(int j=0;j<=i;j++){

				if(ch==s.charAt(j)){

					count++;
				}
			}
			if(count==1){

				s1=s1+ch;
			}
			count=0;
		}
		System.out.println(s1);
	}
}