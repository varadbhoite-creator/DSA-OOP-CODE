class Demo{

	public static void main(String[]args){

		String s="AbC";
		int len=s.length();
		String s1="";

		for(int i=0;i<len;i++){

			char ch=s.charAt(i);
			if(ch>='a' && ch<='z'){
				
				s1=s1+(char)(ch-32);
			}else{

				s1=s1+(char)(ch+32);
			}
		}
		System.out.println(s1);
	}
}