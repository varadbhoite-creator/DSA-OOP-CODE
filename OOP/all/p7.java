class Area{	

	int radius;
	int length;
	int width;
	int base;
	int height;
	double n;
	
	Area(int radius){

		this.radius=radius;
	}

	Area(int length,int width){

		this.length=length;
		this.width=width;
	}

	Area(int base ,int height,double n){

		this.base=base;
		this.height=height;
		this.n=n;
	}
	
	void area(){

		System.out.println("area");
	}
}
class Circle extends Area{

	Circle(int radius){

		super(radius);
	}

	void area(){

		System.out.println(3.14*radius*radius);
	}
}
class Rectangle extends Area{

	Rectangle(int length,int width){

		super(length,width);
	}

	void area(){

		System.out.println(length*width);
	}
}
class Triangle extends Area{

	Triangle(int base,int height,double n){

		super(base,height,n);
	}

	void area(){

		System.out.println(n*base*height);
	}
}
class Demo{

	public static void main(String[]args){

		Area a=new Circle(4);
		a.area();
		
		Area r=new Rectangle(5,10);
		r.area();

		Area t=new Triangle(5,5,0.5);
		t.area();
	}
}