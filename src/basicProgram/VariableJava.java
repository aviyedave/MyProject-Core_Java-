package basicProgram;

public class VariableJava 
{
// Type of variable
	//A.Globle Variable --> declared in class body
    //2 type of globle variable  //1.static 2.non-static variable
	
	//B.Local Variable  -->declared in method, main method, constructor,block etc.
	
	//Globle Variable
	

	static int k=90;    //Globle static Variable
	int z=80;          //Globle non static method
	
	int a=10;         //Globle non-static Variable
	int b=20;         //Globle non-static Variable
	
	public VariableJava()      //constructor
	{
		int x=40;         // Local variable
		System.out.println("const local variable "+x);
	}
	
	public void method ()  //non static method
	{
		int z=80;     // Local variable
		System.out.println("non static local variable "+z);
	}

	   
	
	public static void main(String[] args) 
	{
		VariableJava varconst=new VariableJava();    //constructor
		
		varconst.method();             //non static method
		
		int c=99;            //Local Variable Variable 
		System.out.println("c is a local variable and value of c is "+c);
		
		System.out.println("non static local var "+varconst.a);  // line no 16 will be print
		System.out.println("non static local var "+varconst.b);  // line no 17 will be print
		
		System.out.println("Globle static Variable "+k);  ////Globle static Variable-->line no 14
		
		System.out.println("non static local var "+varconst.z);       //Globle non static Variable-->line no 15
		
				
		
		
		k=100;
		System.out.println(k+100);
		
//		class to class value ghetana previous class la next class mdhe call kraych 
//		pack to pack move hotana --> import packname classname;  <--
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
