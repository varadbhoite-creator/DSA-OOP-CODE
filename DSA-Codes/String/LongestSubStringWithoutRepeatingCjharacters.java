import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		int len=s.length();
		int max=0;

	
		for(int i=0;i<len;i++){

			for(int j=i;j<len;j++){
				
				int lcount=0;

				StringBuffer sb=new StringBuffer();

				for(int k=i;k<=j;k++){
						
					sb.append(s.charAt(k));
					lcount++;

				}
					for(int a=0;a<sb.length();a++){
				
						boolean isunique=true;
						int count=0;
						for(int b=0;b<sb.length();b++){
			
							if(sb.charAt(a)==sb.charAt(b)){

								count++;
							}
							if(count!=1){
	
								isunique=false;
								break;
							}
						}
					if(isunique){

						if(lcount>max){

							max=lcount;
						}
					}
				}
				System.out.println(lcount);
			}
		}
		System.out.println(max);
	}
}