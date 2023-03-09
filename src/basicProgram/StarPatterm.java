package basicProgram;

public class StarPatterm 
{

	public static void main(String[] args)
	{
		
		 for(int i=1; i<=5;i++)
		 {
		 	for(int j=1;j<=5;j++)
		 	{
			 System.out.print(" *");
			 }
		 	System.out.println();
		 }  
		 System.out.println("-----------------------------------");

		 for(int i=1; i<=5;i++)
		 {
			 for(int j=1;j<=i;j++)
			 {
			 System.out.print(" *");
			 }
			 System.out.println();
	 	}
		 System.out.println("reverse "); 
		
		 for(int i=1; i<=5;i++)
		 {
			 for(int j=5;j>=i;j--)
			 {
			 System.out.print(" *");
			 }
			 System.out.println();
	 	}
		
		 System.out.println("-----------------------------------");
		
		
		for(int i=1;i<=5;i++) //i=1--T
	    {
		for(int j=5;j>=i;j--)//space sathi//j=4--T,J=3--T j=2--t,t=1--t,j=0--f
		{                                                                      //  *
			System.out.print(" ");                                             // * *
		}                                                                     // * * *
	 	for(int k=1;k<=i;k++)//star print kranyasathi//k=1--t ,k=2--f        // * * * *
		{
			System.out.print("*");//
		}
		System.out.println();//
	}	
		
		
		 System.out.println("reverse "); 
		 for(int i=1;i<=5;i++)
		 {
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print(" ");
			 }
			
			 for(int h=5;h>=i;h--)
			  {
			  System.out.print("*");
		      }  
			 System.out.println();
		 }	
		
		 System.out.println();
		
		

		
		 System.out.println("-----------------------------------");
    for(int i=1;i<=5;i++) //i=1--T
    {
	for(int j=5;j>=i;j--)//space sathi//j=4--T,J=3--T j=2--t,t=1--t,j=0--f
	{                                                                      //  *
		System.out.print(" ");                                             // * *
	}                                                                     // * * *
 	for(int k=1;k<=i;k++)//star print kranyasathi//k=1--t ,k=2--f        // * * * *
	{
		System.out.print(" *");//
	}
	System.out.println();//
}
//i chi condition true mg aat j chi condition check krun j ++ hot rahnar space print krt janar.
  // j false zal ki k chi condition check kraychi true zali ki space* print krnar.
//k false zala ki prt i mdhe jaun i chi value increase krnar.same prt.
		

		
	   System.out.println("reverse pyramid"); 
	   
	   for(int i=1;i<=5;i++)
		 {
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print(" ");
			 }
			
			 for(int h=5;h>=i;h--)
			  {
			  System.out.print(" *");
		      }  
			 System.out.println();
		 }	
		
		
	System.out.println("-----------------------------------");

	   for(int i=1;i<=5;i++)
		 {
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print(" ");
			 }
			
			 for(int h=5;h>=i;h--)
			  {
			  System.out.print(" *");
		      }  
			 System.out.println();
		 }	
	   for(int i=1;i<=5;i++)
		 {
			 for(int j=5;j>=i;j--)
			 {
				 System.out.print(" ");
			 }
			
			 for(int h=1;h<=i;h++)
			  {
			  System.out.print(" *");
		      }  
			 System.out.println();
		 }
	   System.out.println("-----------------------------------");   
	   
	   
		 for(int i=1;i<=5;i++)
		 {
			 for(int s=1; s<=5-i;s++)//
				{
		          System.out.print(" ");
				}
				for(int j=1; j<=(i*2-1);j++) 
				{
					System.out.print("*");
				}
				System.out.println();
		 }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
		 
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
