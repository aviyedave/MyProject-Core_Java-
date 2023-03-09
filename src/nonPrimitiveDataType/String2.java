package nonPrimitiveDataType;

public class String2 
{
    public static void main(String[] args) 
    {
	//what is difference between String literal and String with new keyword?
	        //according to "how it is save in memory"
	            //both string are save in Heap memory ....lets see how it takes the memory
	
    	//String literal----------consume same memory for same string and show they are equal
//	String a="Apple"; 
//	String b="Mango";      
//	String c="Apple";
	
	 //In this we can see that string a and c are same and consume same memory . We can find out this with 
	//1)"==" operator ( used to check whether location/address of string are same or not ), 
	              //and we will get result in boolean .
	
//	System.out.println(a==b);//false
//	System.out.println(a==c);//true
	
	//2)Equal method (by default method) ( used to check whether string data are same or not ), 
    //and we will get result in boolean 
	
//	boolean result=a.equals(c);
//	System.out.println(result);
//	
//	System.out.println(a.equals(b));
//	System.out.println(a.equals(c));
	

	//String with new keyword-------even if they are having equal string but they consume seperate memory for same string. 
	
//	String x=new String("Apple");
//	String y=new String("Mango");
//	String z=new String("Apple");
//	String w=new String("Banana");
	
	//location/address of string are same or not---showing all false
//	System.out.println(x==y);
//	System.out.println(x==z);
//	System.out.println(x==w);
//	
	//used to check whether string data are same or not---so showing x equals to z
//	System.out.println(x.equals(y));
//	System.out.println(x.equals(z));
	//System.out.println(x.equals(w));

	
	
}
}
