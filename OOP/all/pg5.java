class Circle{

	final double PI=3.14159;
	int radius;

	Circle(int radius){

		this.radius=radius;
	}

	double calculateArea(){

		double area=PI*radius*radius;
		return area;
	}
}
class Demo{

	public static void main(String[]args){
	
		Circle c=new Circle(4);
		System.out.println(c.calculateArea());
	}
}	