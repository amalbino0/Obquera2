package polym;



public class Polymor {

		public void add(int a,float b)
		{
			float c=a+b;
			System.out.println("sum is:"+c);
			
		}
		public void add(int a,String b)
		{
			System.out.println("the integer value is:"+a);
			System.out.println("the Strng value is:"+b);
		}

		public static void main(String[] args) {
			
			Polymor obj=new Polymor();
			obj.add(2,3.4f);
			obj.add(1, "amal ");
		

	}

}
