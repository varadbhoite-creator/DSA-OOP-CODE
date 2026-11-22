import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");	
		String s=sc.next();
		char []arr=s.toCharArray();
		int len=arr.length;
		int freq[]=new int[26];
		StringBuffer sb=new StringBuffer();

		for(int i=0;i<len;i++){

			char ch=s.charAt(i);
			freq[ch-'a']++;
		}
		
		for(int j=0;j<len;j++){

			char ch1=arr[j];
			char ch2=(char)(ch1-'a');
			if(freq[ch2]!=0){

				sb.append(ch1);
				freq[ch2]=0;
			}
		}
		System.out.println(sb.toString());
	}
}