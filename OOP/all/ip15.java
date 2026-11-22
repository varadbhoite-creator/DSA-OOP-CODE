interface Animal{

	void eat();
}
class Dog implements Animal{

	public void eat(){

		System.out.println("animal eats");
	}

	void bark(){

		System.out.println("dog Barks");
	}
}
class Demo{

	public static void main(String[]args){

		Dog d=new Dog();
		d.eat();		
		d.bark();
	}
}