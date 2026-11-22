class Student{

	private String studentname;
	private Department d;
	
	Student(String studentname,Department d){

		this.studentname=studentname;
		this.d=d;
	}
	void setstudentname(String studentname){

		this.studentname=studentname;
	}
	void setdepartment(Department d){

		this.d=d;
	}
	String getstudentname(){

		return studentname;
	}
	Department getdepartment(){

		return d;
	}
}
class Department{

	private String departmentname;
	private University u;
	
	Department(String departmentname,University u){

		this.departmentname=departmentname;
		this.u=u;
	}
	void setdepartmentname(String departmentname){

		this.departmentname=departmentname;
	}
	void setuniversity(University u){

		this.u=u;
	}
	String getdepartmentname(){

		return departmentname;
	}
	University getuniversity(){

		return u;
	}
}
class University{
	
	private String universityname;
	
	University(String universityname){

		this.universityname=universityname;
	}
	void setuniversityname(String universityname){

		this.universityname=universityname;
	}
	String getuniversityname(){

		return universityname;
	}
}
class Demo{

	public static void main(String[]args){

		University u=new University("DBATU");
		Department d1=new Department("Computer Science Engineering",u);

		Student s1=new Student("varad",d1);
		System.out.println(s1.getdepartment().getuniversity().getuniversityname());
		System.out.println(s1.getdepartment().getdepartmentname());
		System.out.println(s1.getstudentname());
	
		Student s2=new Student("yash",d1);
		System.out.println(s2.getdepartment().getuniversity().getuniversityname());
		System.out.println(s2.getdepartment().getdepartmentname());
		System.out.println(s2.getstudentname());
	
		Student s3=new Student("raj",d1);
		System.out.println(s3.getdepartment().getuniversity().getuniversityname());
		System.out.println(s3.getdepartment().getdepartmentname());
		System.out.println(s3.getstudentname());

	}
}