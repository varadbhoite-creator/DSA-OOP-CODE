import java.util.*;
class Demo{

	static String solution(String s){

		int len=s.length();
		int freqarr[]=new int[27];
		int freqlen=freqarr.length;

		for(int i=0;i<len;i++){
		
			char ch=s.charAt(i);
		
			freqarr[ch-'a']++;
		}
		
		String s1="";
		for(int i=0;i<len;i++){

			char ch=s.charAt(i);

			char ch1=(char)(ch-'a');

			if(freqarr[ch1]>0){

				s1=s1+s.charAt(i)+freqarr[ch1];
				freqarr[ch1]=0;
			}
		}
		return s1;
	}

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);

		String s=sc.next();
	
		System.out.println(solution(s));
	}
}