class Product{

	private String name;
	private int price;
	private int quantity;
	private int discount;
	private int finalprice;
	int total;

	Product(String name,int price,int quantity){

		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	void totalprice(){

		total=price*quantity;
	}
	void discount(int discount){
		
		this.discount=(total*discount)/100;
		finalprice=total-this.discount;
	}
	void display(){
		
		System.out.println(name);
		System.out.println(total);
		System.out.println(discount);
		System.out.println(finalprice);
	}
	void updatename(String name){

		this.name=name;
	}
	void updateprice(int price){

		this.price=price;
	}	
	void updatequantity(int quantity){

		this.quantity=quantity;
	}

}
class Demo{

	public static void main(String[]args){

		Product p=new Product("headphones",2000,3);
		p.totalprice();
		p.discount(10);
		p.display();
	
		Product p1=new Product("phone",1000,5);
		p1.totalprice();
		p1.discount(10);
		p1.display();
		
		p1.updatename("laptop");
		p1.display();
		
	}
}