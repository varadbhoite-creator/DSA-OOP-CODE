import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		char []arr=s.toCharArray();
		int arrlen=arr.length;
		int freqarr[]=new int[26];
		int freqarrlen=freqarr.length;

		for(int i=0;i<arrlen;i++){

			char ch=s.charAt(i);
			freqarr[ch-'a']++;
		}
		String s1="";
		for(int j=0;j<freqarrlen;j++){
       
			if(freqarr[j]!=0){
			char cha=(char)(j+'a');
			s1=s1+cha+freqarr[j];
			}
		}
		System.out.println(s1);
	}
}