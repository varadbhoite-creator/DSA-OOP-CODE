import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String s1:");
		String s1=sc.next();
		System.out.println("Enter String s2:");
		String s2=sc.next();
		
		char []arr1=s1.toCharArray();
		char []arr2=s2.toCharArray();
		int len1=arr1.length;
		int len2=arr2.length;
		int freq[] =new int[26];
		
		for(int i=0;i<len1;i++){

			char ch1=s1.charAt(i);
			freq[ch1-'a']++;
		}

		for(int j=0;j<len2;j++){

			char ch2=s2.charAt(j);
			freq[ch2-'a']++;
		}
			String s4="";
		for(int k=0;k<freq.length;k++){
			
			if(freq[k]>1){

				char ch3=(char)(k+'a');
				s4=s4+ch3;
			}
		}
		System.out.println(s4);
	}
}