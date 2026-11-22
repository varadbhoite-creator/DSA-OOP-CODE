class Book{

	String title;
	String author;
	int price;
	
	Book(String title,String author,int price){

		this.title=title;
		this.author=author;
		this.price=price;
	}
	void display(){

		System.out.println("title :"+title);
		System.out.println("autjor :"+author);
		System.out.println("price :"+price);
	}
}
class Demo{

	public static void main(String[]args){

		Book b=new Book("java programming","james",650);
		b.display();
	}
}