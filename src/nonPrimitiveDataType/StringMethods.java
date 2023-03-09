package nonPrimitiveDataType;

public class StringMethods 
{
public static void main(String[] args)
{

//1.To find String Length----->StringName.length();
	
	String myName="Avi Yedave";
	//       index=0123456789
	System.out.println("length of String is--->"+myName.length());
	
//2.To know which character is present on particular index----->StringName.charAt(index);
	
	System.out.println("char present at second index is--->"+myName.charAt(2));
	
//3.To concat two String together ----->StringName.concat("String");
	String myBranch="Civil";
	String passoutYear="-2021";
	System.out.println("my branch and my passout year is--->"+myBranch.concat(passoutYear) );

//4.To Convert into upper case----->StringName.toUppercase();
	
	System.out.println("my name in upper case --->"+myName.toUpperCase());
	
//5.To Convert into lower case----->StringName.toLowercase();
	
		System.out.println("my name in lower case --->"+myName.toLowerCase());

//6.To check string start with particular char or not ---> StringName.startsWith("String");
		//String myName="Avi Yedave";
		System.out.println(myName.startsWith("Avi"));//TRUE
		System.out.println(myName.startsWith("AVI"));//false
		System.out.println(myName.startsWith("Yedave"));//false

//7.To check string end with particular char or not ---> StringName.endsWith("String");
		//String myName="Avi Yedave";
       System.out.println(myName.endsWith("dave"));//true
       System.out.println(myName.endsWith("Avi"));//false

//8.To check whether string data are same or not-> StringName.equals("String");	
     //String myName="Avi Yedave";
     // String myBranch="Civil";
      
       System.out.println(myName.equals(myName));//true
       System.out.println(myName.equals(myBranch));//false
		
//9.To check whether string data are same or not even if case is upper or lower->
                                         //StringName.equalsIgnoreCase("String");	
       //String myName="Avi Yedave";
       //String myName="AVI YEDAVE";

       System.out.println(myName.equalsIgnoreCase(myName));//true
       
//10.To create multiple string from single/existing string with the help of start index-->  
                               //StringName.substring(Start_index);    
       //String myName="Avi Yedave";
       //               0123456789
       System.out.println(myName.substring(4));
       
//11.To create multiple string from single/existing string with the help of start index and end index ( index +1)-->        
                                       // StringName.substring(Start_index,End_index);
       
     //String myName="Avi Yedave";
       //             0123456789
       
       System.out.println(myName.substring(0, 3));
       
//12.To remove space in string --> String_Name.trim();   
     

   	String z=" Avinash ";
   	System.out.println(z);
   	System.out.println(z.length());
   	
   	String x=z.trim();
   			System.out.println(x);
   			System.out.println(x.length());
   	
//13.To check similar string consuming same memory or not --> == operator
     
    String a = "Avinash";
   
   	System.out.println(a=="Avinash");		
   	System.out.println(a=="Avi");				
   	System.out.println(a=="AVINASH");		
       
       
       
       
       
}       
}
