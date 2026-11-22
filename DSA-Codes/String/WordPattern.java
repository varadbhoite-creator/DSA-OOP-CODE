import java.util.*;
class Demo{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter s:");
		String s=sc.next();
		String s1="dog cat dog";
		String []arr=s1.split(" ");
		int len1=s.length();
		int len2=arr.length;
		boolean same=false;
	
			for(int i=0;i<len1;i++){

				char ch=s.charAt(i);
				String s2=new String(arr[i]);

				for(int j=0;j<len1;j++){

					char ch1=s.charAt(j);
					String s3=new String(arr[j]);

					if(ch==ch1 ){
					same=false;
						if(s2.equals(s3)){
							
							same=true;
						}else{

							break;
						}
					}
					
				}
				if(same==false){

					break;
				}
			}
		 	System.out.println(same);
	}
}