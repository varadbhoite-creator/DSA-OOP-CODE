class Codex{

	String name;
	int age;
	int marks;

	Codex(String name,int age,int marks){

		this.name=name;
		this.age=age;
		this.marks=marks;
	}

	void display(){

		System.out.println(name);
		System.out.println(age);
		System.out.println(marks);
	}
}
class Demo{

	public static void main(String[]args){

		Codex c=new Codex("varad",20,91);
		Codex c1=new Codex("yash",21,90);

		c.display();
		c1.display();
	}
}