class Animal{

	private String name;
	
	Animal(String name){

		this.name=name;
	}
	void setName(String name){

		this.name=name;
	}
	String getName(){

		return name;
	}
	void eat(){

		System.out.println(name+" "+"is eating");
	}
}
class Child extends Animal{

	Child(String name){

		super(name);
	}

	void bark(){

		System.out.println(getName()+"  "+"is barking");
	}
}
class Demo{

	public static void main(String[]args){

		Child c=new Child("bruno");
		System.out.println("animal name :"+c.getName());
		c.eat();
		c.bark();
	}
}