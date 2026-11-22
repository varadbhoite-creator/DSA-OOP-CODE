abstract class Vehicle{

	void start(){

		System.out.println("vehicle start");		
	}
}
class Car extends Vehicle{

	
}
class Demo{

	public static void main(String[]args){

		Car c=new Car();
		c.start();
	}
}