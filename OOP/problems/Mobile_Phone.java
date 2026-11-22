class Mobile{

	String brand;
	String model;
	int ram;

	Mobile(String brand,String model,int ram){

		this.brand=brand;
		this.model=model;
		this.ram=ram;
	}
	void display(){

		System.out.println("brand :"+brand);
		System.out.println("model :"+model);
		System.out.println("ram :"+ram);
	}
}
class Demo{

	public static void main(String[]args){

		Mobile m=new Mobile("Samsung","S25",12);
		m.display();
	}
}