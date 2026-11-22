import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String s1:");
		String s1=sc.next();
		System.out.println("ENter String s2:");
		String s2=sc.next();
		int len1=s1.length();
		int len2=s2.length();
		int index=-1;
		boolean first=false;

		for(int i=0;i<=len1-len2;i++){
			StringBuffer sb=new StringBuffer();

			for(int j=i;j<i+len2;j++){

				sb.append(s1.charAt(j));
			}

			String s3=sb.toString();
			if(s2.equals(s3)){

				index=i;
				first=true;
				break;
			}
		}
		if(first){

			System.out.println(index);
		}else{

			System.out.println(index);
		}
	}
}