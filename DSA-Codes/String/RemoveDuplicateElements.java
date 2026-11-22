class Demo{

	public static void main(String[]args){

		String s="programming";
		int len=s.length();
		String s1="";
		int count=0;

		for(int i=0;i<len;i++){

			for(int j=0;j<=i;j++){

				if(s.charAt(i)==s.charAt(j)){

					count++;
				}
			}
			if(count==1){

				s1=s1+s.charAt(i);
			}
			count=0;
		}
		System.out.println(s1);
	}
}