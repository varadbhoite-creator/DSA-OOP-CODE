interface DemoInterface{

	static void show(){

		System.out.println("interface static method");
	}
}
class Demo{
		
	public static void main(String[]args){

		DemoInterface.show();
	}
	
}