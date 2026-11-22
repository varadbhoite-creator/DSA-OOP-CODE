class Demo{

	public static void main(String[]args){

		String s="aaabbccccddeee";
		int len=s.length();
		String s1="";
		int count=1;

		for(int i=0;i<len-1;i++){

			if(s.charAt(i)!=s.charAt(i+1)){

				s1=s1+s.charAt(i)+count;
				count=1;
			}else{

				count++;
			}
		}
		s1=s1+s.charAt(len-1)+count;
		if(len>s1.length()){

			System.out.println(s1);
		}else{

			System.out.println(s);
		}
	}
}