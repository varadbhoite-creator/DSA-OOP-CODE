interface Bank{

	default void intrest(){

		System.out.println("interface mthd");
	}
}
class SBI implements Bank{

	public void intrest(){

		System.out.println("SBI intrest rate:7%");
	}
} 
class Demo{

	public static void main(String[]args){

		SBI s=new SBI();
		s.intrest();
	}
}