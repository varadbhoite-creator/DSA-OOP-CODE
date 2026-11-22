class Demo{

	public static void main(String[]args){

		String s="programming";
		char []arr=s.toCharArray();
		int arrlen=arr.length;
		int freqarr[]=new int[26];
		int freqlen=freqarr.length;
		
		for(int i=0;i<arrlen;i++){

			char ch=arr[i];
			freqarr[ch-'a']++;
		}
		for(int j=0;j<freqlen;j++){

			if(freqarr[j]==2){

				char chh=(char)(j+'a');
				System.out.println(chh);
			}
		}
	}
}