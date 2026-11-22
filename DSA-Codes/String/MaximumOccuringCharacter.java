class Demo{

	public static void main(String[]args){

		String s="programming";
		char []ch=s.toCharArray();
		int chlen=ch.length;
		int freqarr[]=new int[26];
		int freqlen=freqarr.length;
		int max=0;

		for(int i=0;i<chlen;i++){

			char cha=ch[i];
				freqarr[cha-97]++;
		}
		char c='0';
		for(int j=0;j<freqlen;j++){

			if(freqarr[j]>=max){

				max=freqarr[j];
				 c=(char)(j+97);
			}
		}
		System.out.println(""+c+":"+max);
	}
}