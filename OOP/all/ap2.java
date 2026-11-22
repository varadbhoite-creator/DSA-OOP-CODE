interface Animal{

	default void sleep(){

		System.out.println("Animal is Sleeping");
	}
}
class Dog implements Animal{

	
}
class Demo{

	public static void main(String[]args){

		Dog d=new Dog();
		d.sleep();
	}
}