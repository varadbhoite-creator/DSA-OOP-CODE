import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		char []arr=s.toCharArray();
		int arrlen=arr.length;
		int freqarr[]=new int[26];
		int freqlen=freqarr.length;
		
		for(int i=0;i<arrlen;i++){

			char ch=arr[i];
			freqarr[ch-'a']++;
		}
		char cha=' ';
		int frequent=freqarr[0];
		for(int j=0;j<freqlen;j++){

			if(freqarr[j]<frequent){
				if(freqarr[j]!=0){
					frequent=freqarr[j];
					cha=(char)(j+'a');
				}
			}
		}
		System.out.println(cha);
	}
}