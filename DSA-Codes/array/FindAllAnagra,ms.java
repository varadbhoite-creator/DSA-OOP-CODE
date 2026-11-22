import java.util.*;
class Demo{

	public static void main(String[]args){

		String s1="cbaebabacd";
		String s2="abc";
		int len1=s1.length();
		int len2=s2.length();

		for(int i=0;i<len1-2;i++){

			StringBuffer sb=new StringBuffer();
			for(int j=i;j<i+len2;j++){

				sb.append(s1.charAt(j));
			}
			int sblen=sb.length();
			boolean unique=false;

			for(int a=0;a<sblen;a++){

				char ch=sb.charAt(a);
				int count=0;
				for(int b=0;b<sblen;b++){

					if(ch==sb.charAt(b)){

						count++;
					}
				}
				if(count==1){

					unique=true;
				}else{

					unique=false;
					break;
				}
			}
			boolean found=false;
			if(unique){

				for(int a=0;a<sblen;a++){
					found=false;
					
					for(int b=0;b<len2;b++){

						if(sb.charAt(a)==s1.charAt(b)){

							found=true;
							break;
						}
					}
					if(found==false){

						break;
					}					
				}
				if(found){

					System.out.println(i);
				}
			} 
		}
	}
}