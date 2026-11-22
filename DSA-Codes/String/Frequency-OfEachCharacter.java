class Demo{

	public static void main(String[]args){

		String s="banana";
		char []ch=s.toCharArray();
		int charlen=ch.length;
		int freqarr[]=new int[26];
		int freqlen=freqarr.length;

		for(int i=0;i<charlen;i++){

			char c=ch[i];
			freqarr[c-'a']++;
		}
		
		for(int j=0;j<freqlen;j++){

			if(freqarr[j]!=0){
				char c=(char)(j+97);
				System.out.println(""+c+":"+freqarr[j]);
			}
		}
	}
}