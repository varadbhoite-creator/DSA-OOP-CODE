interface Animal{

	void eat();
}
interface Dog extends Animal{

	void barks();
} 
class Puppy implements Dog{

	public void eat(){

		System.out.println("Animal eats");
	}

	public void barks(){

		System.out.println("Dog barks");
	}
}
class Demo{

	public static void main(String[]args){

		Puppy p=new Puppy();
		p.eat();
		p.barks();
	}
}