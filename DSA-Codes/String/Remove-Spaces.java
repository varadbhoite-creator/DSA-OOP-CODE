class Demo{

	public static void main(String[]args){

		String s="java is powerful";
		int len=s.length();
		String s1="";

		for(int i=0;i<len;i++){

			if(s.charAt(i)!=' '){

				s1=s1+s.charAt(i);
			}
		}
		System.out.println(s1);
	}
}