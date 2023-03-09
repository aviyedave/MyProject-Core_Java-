package polymorphism;

public class MethodOverloading 
{
	//Method overloading---- polymorphism
		//declaring the multiple method in same class with same class name with different arguments.
		//by creating same method name we can utilize proper memory.
		
		public void method1()      // non static non return without argu method
		{
			System.out.println("Hello");
		}
		
		public void method1(int x)  // non static non return with argu method
		{
			System.out.println("Bye");
		}
		
		public void add()
		{
			int a=100;
			int b=200;
			System.out.println(a+b);
		}
		
		public void add(int x,int y)
		{
			int a=x;
			int b=y;
			System.out.println(a+b);
		}
		
		
		public static void main(String[] args) 
		{
			MethodOverloading x=new MethodOverloading();
			x.method1();
			x.method1(100);
			x.add();
			x.add(500,500);
		}
		
		
		
		
//		Can we overload java main() method?
   //-->YES
		
	//public static void main(String[] args) 
//	{
//		System.out.println();
//	}
	
	
}
