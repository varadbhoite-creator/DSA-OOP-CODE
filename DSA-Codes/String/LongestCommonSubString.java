import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter s1:");
		String s1=sc.next();
		System.out.println("Enter s2:");
		String s2=sc.next();
		int len1=s1.length();
		int len2=s2.length();
		int max=0;

		for(int i=0;i<len1;i++){
	
			for(int j=i;j<len1;j++){

				StringBuffer sb1=new StringBuffer();
				for(int k=i;k<=j;k++){

					sb1.append(s1.charAt(k));
				}
				String s3=sb1.toString();
				int s3len=s3.length();

				for(int a=0;a<len2;a++){

					for(int b=a;b<len2;b++){

						StringBuffer sb2=new StringBuffer();
						for(int c=a;c<=b;c++){

							sb2.append(s2.charAt(c));
						}
						String s4=sb2.toString();
						if(s3.equals(s4)){
					
							if(s3len>max){

								max=s3.length();
							}
						}
					}
				}
			}		
		}
		System.out.println(max);
	}
}