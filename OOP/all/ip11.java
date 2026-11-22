interface Greeting{

	void sayHello();
}
class Person implements Greeting{

	public void sayHello(){

		System.out.println("hello , java!");
	}
}
class Demo{

	public static void main(String[]args){

		Person p=new Person();
		p.sayHello();
	}
}