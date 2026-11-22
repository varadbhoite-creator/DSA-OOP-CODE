class Animal{

	void eat(){

		System.out.println("Animal eats");
	}
}
class Dog extends Animal{

	
}
class Demo{

	public static void main(String[]args){

		Dog d=new Dog();
		d.eat();
	}
}