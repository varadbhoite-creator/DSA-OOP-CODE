import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		int len=s.length();
		int max=0;
		System.out.println("Enter target:");
		int tar=sc.nextInt();
		boolean notunique=false;

		for(int i=0;i<len;i++){
			char ch=s.charAt(0);
			if(ch!=s.charAt(i)){
				notunique=true;
				break;
			}
		}
		
		if(notunique){

		for(int i=0;i<len;i++){

			for(int j=i;j<len;j++){
	
				StringBuffer sb=new StringBuffer();
				for(int k=i;k<=j;k++){
	
					sb.append(s.charAt(k));			
				}
				int count=0;
				char ch=sb.charAt(0);
				StringBuffer sb1=new StringBuffer();
	
				for(int a=0;a<sb.length();a++){

					if(sb.charAt(a)!=ch){

						sb1.append(ch);
						count++;
					}else{

						sb1.append(sb.charAt(a));
					}
				}
				if(count==tar){

					if(sb1.length()>max){

						max=sb1.length();
					}
				}
			}
		}
		}else{

			max=s.length();
		}
		System.out.println(max);
	}
}