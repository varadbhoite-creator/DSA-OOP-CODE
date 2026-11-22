class Car{

	private String carName;
	private Engine e;

	Car(String carName,Engine e){

		this.carName=carName;
		this.e=e;
	}
	void setcarName(String carName){

		this.carName=carName;
	}
	String getcarName(){
	
		return carName;
	}
	Engine getengine(){

		return e;
	}
}
class Engine{
	
	private String engineType;
	private int model;

	Engine(String engineType,int model){

		this.engineType=engineType;
		this.model=model;
	}
	void setengineType(String engineType){

		this.engineType=engineType;
	}
	void setmodel(int model){

		this.model=model;
	}
	String getengineType(){

		return engineType;
	}
	int getmodel(){

		return model;
	}
}
class Demo{

	public static void main(String[]args){

		Engine e=new Engine("petrol",1980);
		Car c=new Car("BMW",e);

		System.out.println(c.getcarName());
		System.out.println(c.getengine().getengineType());
		System.out.println(c.getengine().getmodel());
	}
}