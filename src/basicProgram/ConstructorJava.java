package basicProgram;

public class ConstructorJava 
{
//Constructor use to initialize variable.
//To call non-static elements.
//we call constructor by creating object.
//Constructor always call in main method
	
//	SYNTAX:
	    // public classname()
	
	public ConstructorJava()
	{
		int a=100;
		System.out.println(a);
    }
	public ConstructorJava(int x)
	{
	System.out.println(x);
	}
	
//---------Object------------------------------------//
	
//non static method
	
	public void method()
	{
		System.out.println("this is non static method");
	}
	
	
	public static void main(String[] args)
	{
		
//        	ConstructorJava z=new ConstructorJava();
		
		    ConstructorJava x=new ConstructorJava();
		    x.method();
		
		    ConstructorJava y=new ConstructorJava();
	        y.method();
//		
//		
//			ConstructorJava a=new ConstructorJava(1000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
