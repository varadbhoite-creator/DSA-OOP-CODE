class Product{

	String name;
	double price;

	Product(){

		this.name="unknown";
		this.price=0.0;
	}

	Product(String name,double price){

		this.name=name;
		this.price=price;
	}

	void displayDetails(){

		System.out.println(name);
		System.out.println(price);
	}
}
class Demo{

	public static void main(String[]args){

		Product p1=new Product();
		p1.displayDetails();
	
		Product p2=new Product("iphone",100000);
		p2.displayDetails();
	}
}