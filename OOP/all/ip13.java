interface Shape{

	void draw();
}
class Circle implements Shape{

	public void draw(){

		System.out.println("Drawing circle");
	}
}
class Demo{

	public static void main(String[]args){

		Shape s=new Circle();
		s.draw();
	}
}