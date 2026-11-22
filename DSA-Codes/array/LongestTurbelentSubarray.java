class Demo{

	public static void main(String[]args){

		int arr[]={1,5,4,4,3,2,7,1};
		int len=arr.length;
		int max=0;
		Boolean turbelent=false;
	
		for(int i=0;i<len;i++){

			for(int j=i;j<len;j++){

				int count=0;

				for(int k=i;k<j;k++){

					turbelent=false;
	
					if(len>1){

						if(k%2==0){

							if(arr[k]<arr[k+1]){

								turbelent=true;
								count++;
							}
						}else{

							if(arr[k]>arr[k+1]){

								turbelent=true;
								count++;
							}
						}
						if(turbelent==false){

							break;	
						}
					}
				}
				if(turbelent==true){

					if(count+1>max){

						max=count+1;
					}
				}
			}
		}
		if(len==1){

			System.out.println(max+1);
		}else{

			System.out.println(max);
		}
	}
}