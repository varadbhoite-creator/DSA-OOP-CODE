import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter S1");
		String s1=sc.next();
		System.out.println("Enter s2:");
		String s2=sc.next();
		int len1=s1.length();
		int len2=s2.length();
		int min=len1+1;
		StringBuffer sb1=new StringBuffer();

		for(int i=0;i<len1;i++){

			for(int j=i;j<len1;j++){
			
				StringBuffer sb=new StringBuffer();
				for(int k=i;k<=j;k++){

					sb.append(s1.charAt(k));
				}
				int sblen=sb.length();
				boolean found=false;
		
				for(int a=0;a<len2;a++){
		
					found=false;
					char ch=s2.charAt(a);
					for(int b=0;b<sblen;b++){

						if(ch==sb.charAt(b)){

							found=true;
							break;
						}
					}
					if(found==false){

						break;
					}
				}
				if(found){

					if(sblen<=min){
						
						min=sblen;
						sb1=sb;
					}
				}
			}
		}
		System.out.println(sb1.toString());
	}
}