import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter s1:");
		String s1=sc.next();
		System.out.println("Enter String s2:");
		String s3=sc.next();
		String s2=sc.nextLine();
		int len1=s1.length();
		int len2=s2.length();

		if(len1<len2){

			String temp=s1;
			s1=s2;
			s2=temp;
			int temp1=len1;
			len1=len2;
			len2=temp1;
		}
		char arr[]=s2.toCharArray();
		int arrlen=arr.length;
		int freq[]=new int[26];
		int freqlen=freq.length;
		
		for(int i=0;i<arrlen;i++){

			char ch=arr[i];
			freq[ch-'a']++;
		}

		for(int i=0;i<len1;i++){

			char ch=s1.charAt(i);
			if(freq[ch-'a']==0){

				System.out.println(ch);
				break;
			}
			freq[ch-'a']--;
		}
	}
}