package superKeyword;

public class SuperVariableChlid extends SuperVariableParent
{

	static String name="Prajakta-Amravtikar";
	
	public void getname()
	{
		System.out.println(super.name);
	}
	
	
	public static void main(String[]args)
	{
		
		System.out.println(name);
		
		SuperVariableChlid x=new SuperVariableChlid();
		x.getname();
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
