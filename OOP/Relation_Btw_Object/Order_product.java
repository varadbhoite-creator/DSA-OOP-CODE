class Order{

	private int orderNo;
	private int price;
	private Product p;
	
	Order(int orderNo,Product p,int price){

		this.orderNo=orderNo;
		this.price=price;
		this.p=p;
	}
	void setorderNo(int orderNO){

		this.orderNo=orderNo;
	}
	void setprice(int price){

		this.price=price;
	}
	void setProduct(Product p){

		this.p=p;
	}
	int getorderNo(){

		return orderNo;
	}
	int getprice(){

		return price;
	}
	Product getProduct(){

		return p;
	}
}
class Product{

	private String productName;
	
	Product(String productName){

		this.productName=productName;
	}
	void setproductName(String productName){
		
		this.productName=productName;
	}
	String getproductName(){

		return productName;
	}
}
class Demo{

	public static void main(String[]args){

		Product p1=new Product("MObile");
		Order o1=new Order(01,p1,200);
		System.out.println(o1.getorderNo());
		System.out.println(o1.getprice());
		System.out.println(o1.getProduct().getproductName());
	}
}