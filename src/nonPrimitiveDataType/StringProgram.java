package nonPrimitiveDataType;

public class StringProgram 
{
	public static void main(String[] args) 
	{
		//1) Java Program to count the total number of characters in a string

		//	String myFullName="Avinash Sukhadev Yedave";
		//	
		//	System.out.println("total number of characters in a string -->"+myFullName.length());


		//2) Java Program to count the total number of vowels and consonants in a string

		//	String s1="Yashaswini Lakade";
		//	s1=s1.toLowerCase();
		//	System.out.println(s1);
		//	System.out.println(s1.length());
		//	int vowels=0; 
		//	int consonants=0;
		//	for(int i=0;i<s1.length();i++)
		//	{
		//		char ch=s1.charAt(i);
		//		if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch ==  'u')
		//		{
		//			++vowels;
		//		}
		//		else 
		//			if((ch >= 'a' && ch <= 'z'))
		//			{
		//				++consonants;
		//			}
		//	}
		//	System.out.println(vowels);
		//	System.out.println(consonants);








		//3) Java Program to remove all the white spaces from a string

		//	String a ="Avinash sukhadev yedave ";
		//	System.out.println(a);
		//	System.out.println(a.length());
		//	
		//	String b=a.trim();
		//	System.out.println(b);
		//	System.out.println(b.length());


		//	String s1= " Avinash sukhadev yedave ";
		//	System.out.println(s1);
		//	System.out.println(s1.trim());

		//4) Java Program to replace lower-case characters with upper-case and vice-versa

		//	   String a ="Avinash sukhadev yedave";
		//	
		//	   System.out.println(a.toUpperCase());
		//	   System.out.println(a.toLowerCase());
		//	
		//5) Java Program to replace the spaces of a string with a specific character
		//	
		//	   String name = " Avinash Yedave ";
		//	   char ch = '%';		
		//	   name=name.replace(' ',ch);  // String_Name.replace(char oldchar,char newchar);
		//	   System.out.println(name);
		//	



		//6) Java Program to find Reverse of the string

		//	     String a ="Avinash sukhadev yedave";
		//	     
		//	     for(int i=a.length()-1;i>=0;i--)
		//	     {
		//	    	 System.out.println(a.charAt(i));
		//	     }



		//7) Java program to find the duplicate characters in a string
		//	    
		//	String b="Avinash yedave";
		//	char[] a =b.toCharArray();//method of string---> String_Name.toCharArray();
		//	for(int i=0;i<b.length();i++)
		//	{
		//		for(int j=1+i;j<b.length();j++)
		//		{
		//			if(a[i]==a[j])
		//			{
		//				System.out.print(a[j]+",");
		//			
		//			}
		//		}
		//	}
		//	 

		//8) Java Program to find the frequency of characters

		//	    String a="AvinashYedave";
		//	    char ch='a';
		//	    int frequency=0;
		//	    for(int i=0;i<a.length();i++)
		//	    {
		//		if(ch==a.charAt(i))
		//		{
		//			frequency++;
		//		}
		//	   }
		//	   System.out.println(frequency);


		//9) Java Program to separate the Individual Characters from a String

		//	     String a ="Avinash sukhadev yedave";
		//	
		//	     for(int i=0;i<a.length();i++)
		//	      {
		//		     System.out.println(a.charAt(i)+" ");
		//	      }  



//		String[]fruits=new String[]
//				{
//						"Orange","Olive","Onion","Kiwi","Apricot"	
//				};
//
//		for(String fruit:fruits)
//		{
//			if(fruit.toLowerCase().startsWith("o"))
//			{
//				System.out.println(fruit);
//			}
//		}
////-------------------------------------------------------------------------

		/*
        //WAP to check string is palindrom or not
		String name="Nayan";
		String rev="";
		System.out.println(name.length());
		
		for (int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
		
		if(name.equalsIgnoreCase(rev))
		{
			System.out.println("palindrom");
		}
		else
		{
			System.out.println("not poliandrom");
		}
		
//-------------------------------------------------------------------------

		//WAP to find Number of 's' in the string
		String A = "my name is shubham";
		int count = 0;

		for (int i = 0; i < A.length(); i++) 
		{
			if (A.charAt(i) == 's')
			{
				count++;
			}
		}

		System.out.println("Number of 's' in the string: " + count);

//-------------------------------------------------------------------------

		//WAP to remove special characters from given string
		//OutPut should be:-AVINASH
		String a="@AVI&%N*AS*H";
		String plainstr=a.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(plainstr);
	
     //===========================================================
        
        //Java Program To Reverse Given String 
        //OutPut should be:-HSANIVA
        
        String name="AVINASH";
        for(int i=name.length()-1;i>=0;i--)
        {
        	System.out.print(name.charAt(i));
        }
      
     //===========================================================

        //Java Program To Remove White Spaces From Given String
        //OutPut should be:-HELLO

         String str="H ELL O";
         String newStr=str.replaceAll("\\s", "");//\\s--->single space
         System.out.println(newStr);
 
     //===========================================================
         
       //Java Program To Remove Duplicate Characters In String   
	   //OutPut should be:-VIANSH
        
		String str="AVINASH"; 
		StringBuilder a=new StringBuilder();//string class to delete anything
        char[] str1= str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
        	boolean repeated=false;
        	for(int j=i+1;j<str.length();j++) 
        	{
        		if(str1[i]==str1[j])
        		{
        			repeated=true;
        			break;
        		}
        	}
        	if(!repeated)
        	{
        		a.append(str1[i]);
        	}
        }
        System.out.println(a);
       
	 //===========================================================
   
		//Sort String Characters In Alphabetical Order 
		//OutPut should be:-AAHINSV
		
         String str="AVINASH";
         char str1[]=str.toCharArray();
         char temp;
         for(int i=0;i<str1.length;i++)
         {
        	 for(int j=i+1;j<str1.length;j++)
        	 {
        		 if(str1[i]>str1[j])
        		 {
        			 temp=str1[i];
        			 str1[i]=str1[j];
        			 str1[j]=temp;
        		 }
        	 } 
        	 System.out.print(str1[i]);
         }
         
   */        
   //===========================================================
     
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		





	}
}
