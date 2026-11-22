class Demo{

	public static void main(String[]args){

		String s="abcd@123#";
		int len=s.length();
		int count=0;

		for(int i=0;i<len;i++){
			char ch=s.charAt(i);
			if(ch>='0'&&ch<='9' || ch>='a'&&ch<='z'){

				continue;
			}else{
				count++;
			}
		}
		System.out.println(count);
	}
}