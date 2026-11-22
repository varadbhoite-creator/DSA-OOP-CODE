import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String s:");
		String s=sc.next();
		char []arr=s.toCharArray();
		int len=arr.length;
		int freqarr[]=new int[26];
		int len1=freqarr.length;

		for(int i=0;i<len;i++){

			char ch=arr[i];
			freqarr[ch-'a']++;
		}
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<len1;i++){

			if(freqarr[i]>0){

				int count=freqarr[i];
				for(int j=1;j<=count;j++){

					char ch1=(char)('a'+i);
					sb.append(ch1);
				}
			}
		}
		System.out.println(sb.toString());
	}
}