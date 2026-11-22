class Animal{

	void sound(){

		System.out.println("Animal makes a sound");
	}
}
class Dog extends Animal{

	void sound(){

		System.out.println("dog barks");
	}
}
class Cat extends Animal{

	void sound(){

		System.out.println("cat meows");
	}
}
class Demo{

	public static void main(String[]args){

		Dog d=new Dog();
		d.sound();
		Cat c=new Cat();		
		c.sound();
	}
}