package inheritance1;

public class Circle extends Shape{
	public void display1()
	
	{
		System.out.println("circle");
	}

	public static void main(String[] args) {
		Circle obj=new Circle();
		obj.display();
		obj.display1();
		
	}

}
