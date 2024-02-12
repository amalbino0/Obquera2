package inheritance1;

public class SingleB  extends SingleA{
	public void display()
	{
		System.out.println("hello");
	}

	public static void main(String[] args) {
		
		SingleB obj=new SingleB();
		obj.display();
		obj.show();
		
		

	}

}
