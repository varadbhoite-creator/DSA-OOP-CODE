class Demo{
	
	public static void main(String[]args){

		int a[]={1,2,3,4,5,6,7,8,9,0};
		int b[]={3,4,5,6,7,0};
		int alen=a.length;
		int blen=b.length;
		boolean isuncommon=false; 
		for(int i=0;i<alen;i++){

			for(int j=0;j<blen;j++){

				if(a[i]!=b[j]){
					isuncommon=true;
				}else{
					isuncommon=false;
					break;
				}
			}
			if(isuncommon){
				System.out.println(a[i]);	
			}
			isuncommon=false;
		}
		for(int i=0;i<blen;i++){

			for(int j=0;j<alen;j++){
				if(b[i]!=a[j]){
					isuncommon=true;
				}else{
					isuncommon=false;
					break;
				}
			}
			if(isuncommon){
				System.out.println(b[i]);
			}
			isuncommon=false;
		}
	}
}