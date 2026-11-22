class Vehicle{

	String brand;
	int speed;

	Vehicle(String brand,int speed){

		this.brand=brand;
		this.speed=speed;
	}

	void display(){

		System.out.println(brand);
		System.out.println(speed);
	}
}
class Car extends Vehicle{

	String fueltype;

	Car(String brand,int speed,String fueltype){
		
		super(brand,speed);
		this.fueltype=fueltype;
	}

	void display(){

		System.out.println(brand);
		System.out.println(speed);
		System.out.println(fueltype);		
	}
}
class Demo{

	public static void main(String[]args){

		Vehicle v=new Car("bmw",220,"petrol");

		v.display();
	}
}