class Area{

	void area(int side){

		System.out.println(side*side);
	}

	void area(int length,int breadth){

		System.out.println(length*breadth);
	}
}
class Demo{

	public static void main(String[]args){

		Area a=new Area();
		a.area(5);
		a.area(10,20);
	}
}