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

		Staff st=new Staff();
		st.teacher();
		st.principle();	
	}
}
