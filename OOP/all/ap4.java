interface Father{

	void displayFather();
}
interface Mother{

	void displayMother();
}
interface Child extends Father,Mother{


}
class Student implements Child{

	public void displayFather(){

		System.out.println("f");
	}

	public void displayMother(){

		System.out.println("m");
	}
} 
class Demo{

	public static void main(String[]args){

		Student s=new Student();
		s.displayFather();
		s.displayMother();
	}
}