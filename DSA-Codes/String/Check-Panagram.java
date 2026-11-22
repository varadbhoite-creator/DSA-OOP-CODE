import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.nextLine();
		s=s.toLowerCase();
		char []arr=s.toCharArray();
		int arrlen=arr.length;
		int freqarr[]=new int[26];
		int freqlen=freqarr.length;
		Boolean ispanagram=true;

		for(int i=0;i<arrlen;i++){

			char ch=arr[i];
			if(ch!=' '){

				freqarr[ch-'a']++;
			}
		}
		for(int j=0;j<freqlen;j++){

			if(freqarr[j]<1){

				ispanagram=false;
				break;
			}
		}
		System.out.println(ispanagram);
	}
}