abstract class Shape{

	Shape(){

		System.out.println("shape constructor");
	}

	abstract void calculatArea();

	void display(){

		System.out.println("calculating area");
	}

}
class Circle extends Shape{
	
	double radius;

	Circle(double radius){

		this.radius=radius;
	}
	
	void calculatArea(){
	
		System.out.println(2*radius*radius);
	}
}
class Recatngle extends Shape{

	double length;
	double breadth;

	Recatngle(double length,double breadth){

		this.length=length;	
		this.breadth=breadth;
	}

	void calculatArea(){

		System.out.println(length*breadth);
	}
}
class Demo{

	public static void main(String[]args){

		Circle s1=new Circle(5.0);

		Recatngle s2=new Recatngle(5.0,5.0);
		
		s1.display();
		s1.calculatArea();

		s2.display();
		s2.calculatArea();
	}
}