class Animal{

	void sound(){

		System.out.println("animal sound");
	}
}
class Dog extends Animal{

	void sound(){

		System.out.println("dog sound");
	}
}
class Cat extends Animal{

	void sound(){

		System.out.println("cat sound");
	}
}
class Demo{

	public static void main(String[]args){


		Animal a1=new Dog();
		a1.sound();
		Animal a2=new Cat();
		a2.sound();
	}
}