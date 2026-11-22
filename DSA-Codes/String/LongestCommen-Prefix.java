import java.util.*;
class Demo{

	public static void main(String[]args){

		String []arr={"flower","flow","flight"};
		int len=arr.length;
		String prefix="";
		String temp="";

		for(int i=0;i<len-1;i++){

			String s=arr[i];
			int slen=s.length();
			String s1=arr[i+1];
			int s1len=s1.length();
			Boolean isprefix=false;
	
			for(int j=0;j<slen;j++){
			
				char ch=s.charAt(j);
				for(int k=0;k<s1len;k++){

					if(ch==s1.charAt(k)){

						prefix=prefix+ch;
						isprefix=true;
						break;
					}
					
				}
				
			}
		}
		System.out.println(prefix);
	}
}