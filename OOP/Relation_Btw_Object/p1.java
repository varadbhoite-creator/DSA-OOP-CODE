class Student{

	private String studentName;
	private College c;

	Student(String studentName,College c){

		this.studentName=studentName;
		this.c=c;
	}
	void setstudentName(String studentName){

		this.studentName=studentName;
	}
	void setCollege(College c){

		this.c=c;
	}
	String getstudentName(){

		return studentName;
	}
	College getCollege(){

		return c;
	}
}
class College{

	private String collegeName;

	College(String collegeName){

		this.collegeName=collegeName;
	}
	void setcollegeName(String collegeName){

		this.collegeName=collegeName;
	}
	String getcollegeName(){

		return collegeName;
	}
}
class Demo{

	public static void main(String[]args){

		College c=new College("ytc");
		Student s=new Student("varad",c);
	
		System.out.println(s.getstudentName());
		System.out.println(s.getCollege().getcollegeName());

		College c1=new College("kbp");
		s.setCollege(c1);
		System.out.println(s.getstudentName());
		System.out.println(s.getCollege().getcollegeName());

		// College cl=s.getCollege();
		// System.out.println(c1.getcollegeName());

		Student s1=new Student("yash",c1);
		System.out.println(s1.getstudentName());
		System.out.println(s1.getCollege().getcollegeName());


	}
}