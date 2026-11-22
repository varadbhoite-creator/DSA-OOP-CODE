class Animal{

	String name;
	
	Animal(String name){

		this.name=name;
	}

	final void sleep(){

		System.out.println("animal is sleeping");
	}

	void sound(){

		System.out.println("animal makes sound");
	}
}
class Dog extends Animal{

	Dog(String name){

		super(name);
	}

	void sound(){

		System.out.println("dog barks");
	}
}
class Cat extends Animal{


	Cat(String name){

		super(name);
	}

	void sound(){

		System.out.println("cat meows");
	}
}
class Demo{

	public static void main(String[]args){

		Animal a1=new Dog("a");
		a1.sleep();
		a1.sound();
		
		Animal a2=new Cat("b");
		a2.sleep();
		a2.sound();
	}
}