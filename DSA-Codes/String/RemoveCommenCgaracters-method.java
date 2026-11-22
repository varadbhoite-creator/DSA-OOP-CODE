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
		StringBuffer sb1=new StringBuffer();	
		StringBuffer sb2=new StringBuffer();
			
		for(int i=0;i<len1;i++){

			char ch=s1.charAt(i);
			Boolean found=false;
		
			if(s2.indexOf(ch)!=-1){

				found=true;
				
			}



			if(found==false){

				sb1.append(ch);
			}
		}

		for(int i=0;i<len2;i++){

			char ch=s2.charAt(i);
			Boolean found=false;

			if(s1.indexOf(ch)!=-1){
	
				found=true;
				
			}

			if(found==false){

				sb2.append(ch);
			}		
		}

		System.out.println(sb1.toString());
		System.out.println(sb2.toString());

	}
}