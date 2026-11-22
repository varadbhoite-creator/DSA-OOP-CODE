class Circle{

	int radius;
	
	Circle(int radius){

		this.radius=radius;
	}
	void area(){

		double area=3.14*radius*radius;
		System.out.println(area);
	}
	void circumference(){

		double circumference=2*3.14*radius;
		System.out.println(circumference);
	}
}
class Demo{

	public static void main(String[]args){

		Circle c=new Circle(7);
		c.area();
		c.circumference();
	}
}