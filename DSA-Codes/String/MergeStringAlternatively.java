import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String s1:");
		String s1=sc.next();
		System.out.println("Enter String s2:");
		String s2=sc.next();
		int s1len=s1.length();
		int s2len=s2.length();
		int len=0;
		String s3="";
		if(s1len>s2len){
			len=s1len;
		}else{
			len=s2len;
		}

		for(int i=0;i<len;i++){

			for(int j=i;j<=i;j++){

				if(j<s1len){

					s3=s3+s1.charAt(j);
				}
			}
			for(int k=i;k<=i;k++){

				if(k<s2len){

					s3=s3+s2.charAt(k);
				}
			}
		}
		System.out.println(s3);

	}
}