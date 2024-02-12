package inheritance1;

public class Square extends Shape {
	public void  display3()
	{
		System.out.println("square");
	}

	public static void main(String[] args) {
		Square obj1=new Square();
		obj1.display3();
		obj1.display();

	}

}
