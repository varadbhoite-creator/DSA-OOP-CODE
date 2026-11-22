class Product{

	String productName;
	int productId;
	int price;

	Product(String productName,int productId,int price){

		this.productName=productName;
		this.productId=productId;
		this.price= price;
	}
	void display(){

		System.out.println("product :"+productName);
		System.out.println("Id :"+productId);
		System.out.println("price :"+price);
	}
}
class Demo{

	public static void main(String[]args){

		Product p=new Product("laptop",101,55000);
		p.display();
	}
}