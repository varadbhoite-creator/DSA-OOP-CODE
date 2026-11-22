import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String s1:");
		String s1=sc.next();
		System.out.println("Enter String s2:");
		String s2=sc.next();
		int len1=s1.length();
		int len2=s2.length();
		
		for(int i=0;i<=len1-len2;i++){

			StringBuffer sb=new StringBuffer();
			for(int j=i;j<i+len2;j++){

				sb.append(s1.charAt(j));
			}
			String s3=sb.toString();
			int len3=s3.length();
			int freq[]=new int[26];
	
			for(int j=0;j<len3;j++){

				char ch=s3.charAt(j);
				freq[ch-'a']++;
			}
			Boolean anagram=true;
			for(int j=0;j<len2;j++){

				char ch=s2.charAt(j);
				char ch1=(char)(ch-'a');
				if(freq[ch1]==0){

					anagram=false;
				}
			}
			if(anagram){

				System.out.println(i);
			}
		}
	}
}