import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		int len=s.length();
		StringBuffer sb=new StringBuffer(s);
		StringBuffer sb1=new StringBuffer(s);
		String s1=new String(sb1.reverse());
		int max=0;
	
		for(int i=0;i<len;i++){

			if(s.equals(s1)){

				max=len;
				break;
			}else{

				StringBuffer sb2=new StringBuffer();

				for(int j=0;j<len;j++){

					if(j!=i){

						sb2.append(s.charAt(j));
					}
				}
				String s2=sb2.toString();
				String s3=new String(sb2.reverse());
				int sb2len=sb2.length();
				if(s2.equals(s3)){

					if(sb2len>max){

						max=sb2len;
					}
				}
			}
		}
		System.out.println(max);
	}
}