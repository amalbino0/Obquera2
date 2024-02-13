package inheritance1;

public class Book1 {
	float page;
	double index;
	 Book a;
	Book1(float page,double index,Book a)
	{
		this.page=page;
		this.index=index;
		this.a=a;
	}

	public void display()
	{
		System.out.println(a.price);
		System.out.println(a.name);
		System.out.println("the page is:"+page);
		System.out.println("the index is:"+index);
		
		
		
	}
	
	public static void main(String[] args) {
		Book obj=new Book(101,"amal");
		Book1 obj1=new Book1(101.3f,23444,obj);
		obj1.display();
		
		

	}

}
