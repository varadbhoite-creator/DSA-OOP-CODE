import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		char []arr=s.toCharArray();
		int arrlen=arr.length;
		int freqarr[]=new int[26];
		int freqlen=arr.length;
	
		for(int i=0;i<arrlen;i++){

			char ch=arr[i];
			freqarr[ch-'a']++;
		}
	
		for(int j=0;j<arrlen;j++){

			char ch1=arr[j];
			char ch2=(char)(ch1-'a');

			if(freqarr[ch2]>0){
			System.out.println(ch1+":"+freqarr[ch2]);
			freqarr[ch2]=0;
			}
		}
	}
}


