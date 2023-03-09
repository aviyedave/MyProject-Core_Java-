package basicProgram;

public class ConstructorArgs {
//without and with arguments constructor
	
	//1.
	public ConstructorArgs()
	{
		System.out.println("this is without argu constructor");
	}
	
	//2.
	public ConstructorArgs(int x)
	{
		System.out.println("int type argu constructor");
	}
	
	//3.
	public ConstructorArgs(int x,int y,int z)
	{
		System.out.println("3 -->int type argu constructor");
	}
	
	//4.
	public ConstructorArgs(int x,char y,String z)
	{
		System.out.println("3 argument of int, char , String type argu constructor");
	}
////	------------------------------------------------------------------------------------//
//	int a;
//	int b;
//	public ConstructorArgs(int x,int y)
//	{
//		a=x;
//		b=y;
//		System.out.println(a+b);
//	}
////	------------------------------------------------------------------------------------//
//
//	public int add(int x,int y)//nonstatic return type
//	{	
//		System.out.println(a+b);
//		return a+b;
//	}
////	------------------------------------------------------------------------------------//
//
//	
//	//main
//	public static void main(String[] args) 
//	{
//	//const call by creating object
////		
////		ConstructorArgs x=new ConstructorArgs();		
////		ConstructorArgs y=new ConstructorArgs(50);
////		ConstructorArgs z=new ConstructorArgs(100,100,100);
////		ConstructorArgs w=new ConstructorArgs(1000,'A',"AVINASH");
////		------------------------------------------------------------------------------------//
//		System.out.println();
//		
//		
////		ConstructorArgs a=new ConstructorArgs(100,100);
////		ConstructorArgs b=new ConstructorArgs(10,0);
////		------------------------------------------------------------------------------------//
//		
//		System.out.println();
//		
//		ConstructorArgs nonstaticreturn=new ConstructorArgs(20,20);
//		
//		int f=nonstaticreturn.add(20,20);
//		System.out.println(f);
//		System.out.println(f+100);
////		------------------------------------------------------------------------------------//
//	
//		
//	}
//	
//	
//	
//	
//	
//	
//	
//	
//	
	
	
	
	
	
	
}
