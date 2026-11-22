import java.util.*;
class Demo{
	
	static String solution(String s){

		int len=s.length();
		int max=0;
		String s3="";

		for(int i=0;i<len;i++){

			for(int j=i;j<len;j++){

				StringBuffer sb=new StringBuffer();
	
				for(int k=i;k<=j;k++){

					sb.append(s.charAt(k));
				}

				StringBuffer rev = new StringBuffer();
				int sblen=sb.length();

				for(int k=sblen-1;k>=0;k--){

					rev.append(sb.charAt(k));
				}
				String s1=sb.toString();
				String s2=rev.toString();

				if(s1.equals(s2)){

					if(sblen>max){

						max=sblen;
						s3=sb.toString();
					}
				}
			}
		}
		return s3;
	}

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enetr String:");
		
		String s=sc.next();

		System.out.println(solution(s));
	}
}