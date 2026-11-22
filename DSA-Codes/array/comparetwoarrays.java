class Demo{

	public static void main(String[]args){

		int a[]={1,2,3,};
		int b[]={1,2,3};
		int alen=a.length;
		int blen=b.length;
		Boolean isequal=true;

		if(alen==blen){

			for(int i=0;i<alen;i++){

				if(a[i]!=b[i]){
					isequal=false;
					break;
				}
			}

			if(isequal){
			System.out.println("equal");
			}

		}else{
			System.out.println("not equal");
		}
			
	}
}