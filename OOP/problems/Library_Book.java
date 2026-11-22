class Book{

	private int bookid;
	private String title;
	private String author;
	private Boolean available;
	
	Book(int bookid,String title,String author,boolean available){

		this.bookid=bookid;
		this.title=title;
		this.author=author;
		this.available=available;
	}
	void issue(){

		System.out.println("book issued successfully");
	}
	void available(){

		if(available){
			System.out.println("available");
		}else{
			System.out.println("not available");
		}
	}
	void updatebookid(int bookid){

		this.bookid=bookid;
	}
	void updateaavailability(boolean available){

		this.available=available;
	}
}
class Demo{

	public static void main(String[]args){

		Book b=new Book(101,"java","jonny",false);
		b.issue();
		b.available();

		b.updateaavailability(true);
		b.issue();
		b.available();
	}
}