import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		int len=s.length();
		int max=0;
		String s3=new String();
	
		for(int i=0;i<len;i++){

			for(int j=i;j<len;j++){

				StringBuffer sb=new StringBuffer();
				int count=0;
				
				for(int k=i;k<=j;k++){

					sb.append(s.charAt(k));
					count++;
				}
				int sblen=sb.length();
				StringBuffer sb1=new StringBuffer();
				for(int a=sblen-1;a>=0;a--){

					sb1.append(sb.charAt(a));
				}
				String s1=new String(sb.toString());
				String s2=new String(sb1.toString());
				if(s1.equals(s2)){

					if(count>max){
						
						max=count;
						s3=s1;
					}
				}
			}
		}
		System.out.println(s3);
	}
}