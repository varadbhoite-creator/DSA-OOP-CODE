import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		char []arr=s.toCharArray();
		int len=arr.length;
		int freqarr[]=new int[26];
		int freqlen=freqarr.length;
	
		for(int i=0;i<len;i++){

			char ch=arr[i];
			freqarr[ch-'a']++;
		}
	
		for(int j=0;j<freqlen;j++){

			if(freqarr[j]>1){

				char cha=(char)(j+'a');
				System.out.println(cha);
				break;
			}
		}
	}
}