package castingConcept;

public class PrimitiveCasting 
{
//Primitive Casting:-
	//Converting one data type information into another data type information is called "Primitive Casting".
	
	//a.Implicit casting:-
	 //Converting LOWER data type information into HIGHER data type information is called "Implicit Casting".

	//Size of data is increased hence it is also called as widening casting.
	
	//Byte-->short-->int-->long--->double.

//----------------------------------------------------------
	
	//a.Explicit casting:-
		 //Converting HIGHER data type information into LOWER data type information is called "Explicit Casting".
	
	   //Size of data is reduced hence it is also called as narrowing casting.
	
	   //double-->long-->int-->short-->byte.
	
	
	
	
	
	public static void main(String[] args) 
	{
		
		//a.Implicit casting:-
		//ex.1
		
		short a=12;
		System.out.println("short a ="+a);
		
		// short -->double
		double b=(double)a;
		System.out.println("double a ="+b);
		
		//ex.2
		
		byte x=10;
		byte y=20;
		
		int z=(int)(x+y);
		System.out.println("byte to int and done addition ="+z);
		
		System.out.println("-----------------------------------");
		
		//a.Explicit casting:-
		
		double m=55.88;
		System.out.println("double a ="+m);
		
		//double-->int
		int n=(int)m;
		System.out.println("int a ="+n);
		
		
		
//Boolean casting is not supported in java.
	//because it is not numeric type. 	
		
		
	}
	
}
