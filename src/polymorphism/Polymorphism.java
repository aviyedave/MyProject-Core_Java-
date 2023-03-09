package polymorphism;

public class Polymorphism 
{
//Polymorphism:-It is one of the OOPs principle where one object or element performs the different
	//behaviors at different stages of the life cycle.
//it is greek word:"poly" means "many" and "morphs" means "form".
	//example :- person ,method overloading ,method overridding etc.
  // person can be student , person can be player, person can be customer, person can be father etc.
	
	public void method1()         //------> method declaration / method heading
	{
		System.out.println("AVINASH");//--------> method body
	}
	
	
	
//-------JVM MEMORY:-
	
//1.Stack memory area----------> (Execution of main method)
	
	//public static void main(String[] args)
	
//2.Method memory area---> ( Static & non static method body)	
	
//	public void method1()        
//	{
//		System.out.println("AVINASH");//--------> method memory area
//	}
	
//3.Static pool area -------> (static method declaration)
	
	//public static void method1() 
	
//4.Heap memory area-------->	(non-static method declaration)
	
	//public  void method1() 
	
	
//--------METHOD BINDING :- 
	//The process of combining method declaration and method body is called METHOD BINDING.	
	
//1.Early binding of method ----> at the time of compilation
	//ex.method overloading 
//2.Late binding of method -----> at the time of execution	
	//ex.method overridding 
	
//	There are 2 type of polymorphism:-
	//1.Compile time polymorphism        //ex.method overloading
	//2.Runtime polymorphism            //ex.method overridding
	
//1.Compile time polymorphism:-
	//ex.method overloading-->same name and diff argu
	
 //Heap memory area          //Method memory area
//	method1()------------------>hello
//	method1(int x)--------------->hii
//	method1(char y)------------->bye
	
  //Argu are always return at compile time and here argu are playing a role of binder ( fevicol ).
         //	this process happening at compile time hence it is "COMPILE TIME POLYMORPHISM".
	
//overloading he polymorphism ch example ahe and te binding ch kam krt at the time of compile.
	// so its "Compile time polymorphism".
	
//2.Runtime polymorphism:-
	//ex.method overridding-->same name and same argu
	
//Runtime process happen at the time of execution of object.	
//object are always return at execution time and object are playing a role of binder.
	//this process happening at runtime hence it is "RUN-TIME POLYMORPHISM".
	
//overridding he polymorphism ch example ahe and yat object binding ch kam krt at the time of runtime.
		// so its "runtime polymorphism".	
	
	
//"Method Hidding";-
//Acquiring properties of superclass( parent class) into subclass (child class ) and 
	 // providing the implementation according to subclass specifications.  
		
		//it is for static method only.
		
	//Rules for "Method Hidding":-
		//method must have same name as in parent class.
		//method must have same parameters as in the parent class.	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
