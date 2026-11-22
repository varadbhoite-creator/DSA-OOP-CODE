class Car{

	String brand;
	String model;
	int price;
	
	Car(String brand,String model,int price){

		this.brand=brand;
		this.model=model;
		this.price=price;
	}
	void display(){

		System.out.println("brand :"+brand);
		System.out.println("model :"+model);
		System.out.println("price :"+price);
	}
}
class Demo{

	public static void main(String[]args){

		Car c=new Car("tata","nexon",85000);
		c.display();
	}
}