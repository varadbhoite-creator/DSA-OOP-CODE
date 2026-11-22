class Rectangle{

	int length;
	int breadth;

	Rectangle(int length,int breadth){

		this.length=length;
		this.breadth=breadth;
	}	
	void area(){

		int area=length*breadth;
		System.out.println(area);
	}
}
class Demo{

	public static void main(String[]args){

		Rectangle r=new Rectangle(10,5);
		r.area();
	}
}