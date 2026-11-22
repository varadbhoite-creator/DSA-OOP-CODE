class Student{

	void name(){

		System.out.println("In name");
	}
}
class Staff{

	void teacher(){

		System.out.println("in teacher");
	}

	void principle(){

		System.out.println("in principle");
	}
}
class Demo{

	public static void main(String[]args){

		Student s=new Student();
		s.name();
		Student s1=new Student();
		s1.name();

		Staff s=new Staff();
		s.teacher();
		s.principle();	
	}
}

error: variable s is already defined in method main(String[])
                Staff s=new Staff();
	unique object nmame reuired dont give same object name.