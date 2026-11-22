class Demo{

	public static void main(String[]args){
	
		String s="listen";
		String s1="varadb";
		int len=s.length();
		int len1=s1.length();
		Boolean isanagram=false;

		if(len==len1){
			isanagram=false;
			for(int i=0;i<len;i++){

				for(int j=0;j<len;j++){

					if(s.charAt(i)==s1.charAt(j)){

						isanagram=true;
						break;
					}
				}
				if(isanagram==false){

					break;
				}
			}
			if(isanagram){

				System.out.println("anagram");
			}else{

				System.out.println("not anagram");
			}
		}else{

			System.out.println("not anagram");
		}
	}
}