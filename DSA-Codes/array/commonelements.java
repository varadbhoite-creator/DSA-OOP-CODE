import java.util.*;
class Demo{

	public static void main(String[]args){

		int a[]={1,2,3,4,5,6,7,8,9};
		int b[]={3,4,5,6,7,8,9};
		int alen=a.length;
		int blen=b.length;
		
		for(int i=0;i<alen;i++){

			for(int j=0;j<blen;j++){

				if(a[i]==b[j]){

					System.out.println(a[i]);
				}
			}
		}

	}
}