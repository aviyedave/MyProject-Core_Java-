package basicProgram;

public class MethodType {
	
// Method :- it is set of code which is grouped together to perform a certain operations.
	//-code minimize -code reuse - avoid repetation of code -easy readability.
	
// method should be written in class body always.
// dont write under main method.
	
	//-----------Static Method------------//
//	
	public static void name()           //Method with static keyword
	{
		System.out.println("My Name is -->" + " Avinash Yedave");
		System.out.println("------------------------------");
    }
	
//	//example 2:---------------------------------------------------------------//
//	
//	public static void addition()
//	{
//		int a=50;
//		int b=40;
//		int c=a+b;
//		System.out.println("addition of a(50)+b(40) is "+c);
//	}
//--------------------------------------------------------------------------------------
	

    //-----------Non-Static Method------------//	

//method without static keyword.
//these method can be called with help of object only.

//Example 1.

//     public void max()
//     {
//    	int a=50;
// 		int b=40;
// 		int c=a+b;
// 		System.out.println("addition of a(50)+b(40) is "+c); 
//     }
//     
//     
     public void avinash()
     {
    	 String myname="Avinash";
          System.out.println("My Name is -->" +myname+ "-->calling as non static method");
     }
        
//-----------------------------------------------------------------------------------------
     
	public static void main(String[]args)           //main method 
	{

		// Static Method
		//method with static keyword.
		//these methods can be called directly or with the help of className.
		
		//1.directly called
		
	    name();
	
//		//2.called with help of className
		
		MethodType.name();                     //class-name.method-name
		
//	//example 2:-----------------------------------------------------------------------//
//		
//		//1.directly called---addition method
//		addition();
//		
//	   //2.called with help of className
//
//		MethodType.addition();
//		
////	----------------------------------------------------------------------------------------//	
		
		
		
//		MethodType addition2=new MethodType();
//// 	    System.out.println(z.max);
//	    addition2.max();    //OBJECTNAME.METHODNAME();		
//		
		MethodType myname=new MethodType();  // classname Ojectname=new classname();
		myname.avinash();                      //OBJECTNAME.METHODNAME();	
//    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
 }
}