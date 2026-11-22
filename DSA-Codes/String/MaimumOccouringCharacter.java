import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		char arr[]=s.toCharArray();
		int len=arr.length;
		int freqarr[]=new int[26];
		int len1=freqarr.length;

		for(int i=0;i<len;i++){

			char ch=arr[i];
			freqarr[ch-'a']++;
		}		
		int max=0;
		char ch1='a';
		for(int i=0;i<len1;i++){

			if(freqarr[i]>0){

				if(freqarr[i]>max){

					max=freqarr[i];
					ch1=(char)('a'+i);
				}
			}	
		}
		System.out.println(ch1);
	}
}