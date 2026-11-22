class Car{

	String brand;
	String color;
	int price;

	Car(String brand,String color,int price){

		this.brand=brand;
		this.color=color;
		this.price=price;
	}

	void display(){

		System.out.println(brand);
		System.out.println(color);
		System.out.println(price);
	}
}
class Demo{

	public static void main(String[]args){

		Car c1=new Car("bmw","red",1);
		Car c2=new Car("mercedese","blue",2);
		Car c3=new Car("toyota","black",2);

		c1.display();	
		c2.display();	
		c3.display();		
	}
}