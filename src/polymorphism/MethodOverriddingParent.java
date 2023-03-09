package polymorphism;

public class MethodOverriddingParent 
{
//Method Overridding;-
	//Acquiring properties of superclass( parent class) into subclass (child class ) and 
	 // providing the implementation according to subclass specifications.  
	
	//it is for non static method only.
	
//Rules for Method overridding:-
	//method must have same name as in parent class.
	//method must have same parameters as in the parent class.
	
public void method1()
{
	System.out.println("sky is blue");
}
	
public static void main(String[] args) 
{
	
	MethodOverriddingParent x=new MethodOverriddingParent();
	x.method1();
	
	
}



	
}