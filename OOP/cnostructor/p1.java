class Student{

	String name;
	int age;
	String add;
	int phn;
	char blood;

	Student(String a,int b,char c){

		this.name=a;
		this.age=b;
		this.blood=c;
	}

	Student(int a,String b){

		this.phn=a;
		this.add=b;
	}

	Student(String a){

		this.name=a;
	}

	Student(){

			
	}

	void fun(){

		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.blood);
	}

	void gun(){

		System.out.println(this.phn);
		System.out.println(this.add);
	}

	void run(){

		System.out.println(this.name);
	}
}
class Demo{

	public static void main(String[]args){

		Student s = new Student("varad",20,'b');
		Student s1 = new Student(1234,"satara");
		Student s2 = new Student("yash");
		Student s3 = new Student();
		
		s.fun();
		s1.gun();
	}
}