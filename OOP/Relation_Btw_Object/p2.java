class Student{

	private int rollNo;
	private String name;
	private College c;

	Student(int rollNo,String name,College c){

		this.rollNo=rollNo;
		this.name=name;
		this.c=c;		
	}

	int getrollNo(){

		return rollNo;
	}

	String getName(){

		return name;
	}

	College getCollege(){

		return c;
	}

	void setrollNo(int rollNo){

		this.rollNo=rollNo;
	}

	void setname(String name){

		this.name=name;
	}

	void setCollege(College c){

		this.c=c;
	}
}
class College{

	private String collegeName;
	private String address;

	College(String collegename,String address){
		
		this.collegeName=collegename;
		this.address=address;
	}

	String getCollegename(){

		return collegeName;
	}
	
	String getAddress(){

		return address;
	}

	void setCollegename(String collegename){

		this.collegeName=collegeName;
	}

	void steAddress(String address){

		this.address=address;
	}
}
class Demo{

	public static void main(String[]args){

		College c=new College("Yashoda","Satara");
		Student s=new Student(110,"varad",c);

		System.out.println(s.getrollNo());
		System.out.println(s.getName());
		System.out.println(s.getCollege().getCollegename());
		System.out.println(s.getCollege().getAddress());
	}
}