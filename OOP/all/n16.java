
class Demo{

	static void checkAge(int age){
	
		if(age<18){

			throw new IllegalArgumentException();
		}else{

			System.out.println("eligible");
		}
	}

	public static void main(String[]args){
	
		try{

			checkAge(17);
		}catch(IllegalArgumentException e){

			System.out.println("catched");
		}	
	}	
}