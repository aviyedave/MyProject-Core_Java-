package basicProgram;

public class Array {

	// array is used to stored multiple data of same data type.

   public static void main (String[]args) {
	
   //Java Program to print the elements of an array
/*
    int a[]= {10,11,12,13,14,15};
	 System.out.println("length of array---> " + a.length);   // length ---> a.length
	
	 for(int i=0;i<a.length;i++)
	 {
		 System.out.println(a[i]);
	 }
*/	
	   //-------------------------Array in reverse--------------//
/*	   
	 for(int i=a.length-1;i>=0;i--)
	 {
		 System.out.print(a[i]+" ");
	 } 
*/	 
	   //------------EVEN & ODD NUMBER------------//
/*	   
	   int a[]= {10,11,12,13,14,15};
	   
	   for(int i=0;i<a.length;i++)
	   {
		   if ((a[i]%2)==0)//modulus
		   {
			   System.out.println("number are even"+a[i]);
			  
		   }
		   else
		   {
			   System.out.println("number are odd"+a[i]);
		   }
		   
	   }
*/	   
	 //------------Finding Maximux Number---------------//
/*	
	int a[]= {1,2,5,3,4};
	int max=a[0];//assume
	
	 for(int i=0;i<a.length;i++)
	 {
		 if(a[i]>max)
		 {
			max=a[i]; 
		 }
		 
	 }
	 
	 System.out.println("max number is "+ max);
*/	 
		 //------------Finding Minimum Number---------------//
/*
	int a[]= {10,12,14,16,18,20};
	int min=a[0];
	for (int i=0;i<a.length;i++)
	{
		if(a[i]<min)
		{
			min=a[i];
		}
	}
	
	System.out.println("min number is "+ min);
*/ 
	   //------------Ascending order------------------------//
/*	 
	   int a[]= {20, 30, 11, 50, 5}; //unsorted array
	   int temp=0;   //assume
		
	   for (int i=0;i<a.length;i++)     //outer for loop iterate only one time
	   {
		   for(int j=i+1;j<a.length;j++)  //inner for loop iterate a.length(5) time
		   {
			   if(a[i]>a[j]) //30>11
			   {
				   temp=a[i];
				   a[i]=a[j];
				   a[j]=temp;
			   }
		   }
		   System.out.print(a[i]+" ");
	   }
*/		  
 
	   
	 //1st we trave araay and to travse an array 1st for loop
	   //nested for loop ghyaycha
	 //outer for loop itreate 1 st time i=0 index position 0 will be 10  when it is move in inner loop
	   //j=i 10=10 
	   //10 will be compare with all the element in the array
	   //10>10 store into temp an move the value of a[i] to a[j] & a[j] to temp
	   //
	   
	 //------------Descending order------------------------//
	   
//	   int a[]= {20, 30, 11, 50, 5}; //unsortrd array
//	   int temp=0;   //assume
//		
//	   for (int i=0;i<a.length;i++)     //outer for loop iterate only one time
//	   {
//		   for(int j=i;j<a.length;j++)  //inner for loop iterate a.length(5) time
//		   {
//			   if(a[i]<a[j])
//			   {
//				   temp=a[i];
//				   a[i]=a[j];
//				   a[j]=temp;
//			   }
//		   }
//		   System.out.print(a[i]+" ");
//	   }   
//	   
	 //---------------Duplicate elements ------------------------//
	   
//	  int a[]={10,20,10,90,80,20};
//	  for (int i=0;i<a.length;i++)
//	  {
//		  for(int j=i+1;j<a.length;j++)
//		  {
//			  if(a[i]==a[j])  //10==10
//			  {
//				  System.out.print(a[j]+" ");
//			  }
//		  }
//	  }
//	   
	  //1st initialize an  array
	  //den we are using 2 for loop 
	  //a[i]==a[j] means a[0]==a[1] if it is yes then print j value if it is no then print no execute
	  //loop will go up ..a[j] value will be increase till length of array not complete.
	 
	//---------------2nd Largest Number  ------------------------//
	  
//	   int a[]= {20, 30, 11, 50, 5}; //unsortrd array
//	   int temp=0;   //assume
//		
//	   for (int i=0;i<a.length;i++)     //outer for loop iterate only one time
//	   {
//		   for(int j=i+1;j<a.length;j++)  //inner for loop iterate a.length(5) time
//		   {
//			   if(a[i]>a[j])
//			   {
//				   temp=a[i];
//				   a[i]=a[j];
//				   a[j]=temp;
//			   }
//		   }
//		   System.out.print(a[i]+" ");
//	   }
//	   System.out.println();
//	  System.out.println("2nd largest number is "+a[a.length-2]);
  
	 //-----------Copy Array---------------------//
	   
//	   int[]original= {10,30,89,45,66};
//	   int[]copy=original;
//	   
//	   System.out.println("original array is");
//	   for(int i=0;i<original.length;i++)
//	   {
//		   System.out.print(original[i]+" ");
//	   }
//	   
//	   System.out.println();
//	   
//	   System.out.println("copied array is");
//	   for(int i=0;i<copy.length;i++)
//	   {
//		   System.out.print(copy[i]+" ");
//	   }
//	  
	
	   int a[]= {1,2,3,4,5};

	   for(int w:a)
	   {
		   System.out.print(w+" ");
	   }
	  
	  
	   
	   
	   
	   
	   
}
}