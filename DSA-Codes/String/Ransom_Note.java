class Demo{

	static Boolean solution(String ransomNote,String magazine){

		int len1=ransomNote.length();
		int len2=magazine.length();
		
		int freq[]=new int[27];
		
		for(int i=0;i<len2;i++){

			char ch=magazine.charAt(i);

			freq[ch-'a']++;
		}

		Boolean found=true;

		for(int i=0;i<len1;i++){

			char ch=ransomNote.charAt(i);
			char ch1=(char)(ch-'a');

			if(freq[ch1]==0){

				found=false;
				break;
			}else{

				freq[ch1]--;
			}
		}
		return found;
	}

	public static void main(String[]args){

		String ransomNote="aa";
		String magzine="ab";

		System.out.println(solution(ransomNote,magzine));
	}
}