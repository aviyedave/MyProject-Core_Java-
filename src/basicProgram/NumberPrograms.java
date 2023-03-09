package basicProgram;

public class NumberPrograms 
{
public static void main(String[] args) 
{

//-------------------Java Program to Find Largest of Two Numbers
	
//	int a=50;
//	int b=100;
//	
//	if(a>b)
//	{
//		System.out.println(a+" number is the largest number. ");
//	}
//	else
//	{
//		System.out.println(b+" number is the largest number.");
//	}
//	
	
//-----------------Java Program to Find Largest of Three Numbers
	
//	int x=100;
//	int y=200;
//	int z=300;
//	
//	if(x>y && x>z)
//	{
//		System.out.println(x+" number is the largest number.");
//	}
//	
//	else if(y>z && y>x)
//	{
//		System.out.println(y+" number is the largest number.");
//	}
//	
//	else
//	{
//		System.out.println(z+" number is the largest number.");
//	}
	
//---------------Java Program to Find Smallest of Three Numbers 
	
//	int x=10 ,y=40,z=80;
//	if(x<y && x<z)
//	{
//		System.out.println(x+" number is the Smallest number.");
//	}
//	
//	else if(y<z && y<x)
//	{
//		System.out.println(y+" number is the Smallest number.");
//	}
//	
//	else
//	{
//		System.out.println(z+" number is the Smallest number.");
//	}
	
	
//-----------Java Program to Check if a Number is Positive or Negative
	
//	int a=10;
//	
//	if(a>0)
//	{
//		System.out.println("number is positive");
//	}
//	
//	else
//	{
//		System.out.println("number is negative");
//	}
	
//------------Java Program to find whether number is odd or even
	
//	int a=11;
//	
//	if(a%2==0)
//	{
//		System.out.println("number is Even");
//	}
//	else
//	{
//		System.out.println("number is odd");
//	}

//-------Java Program to Display Even Numbers From 1 to 100
	
//	for(int i=1;i<=100;i++)
//	{
//		if(i%2==0)
//		{
//			System.out.println("number is Even "+i);
//		}
//		
//	}
	
//-------Java Program to Display Odd Numbers From 1 to 100
	
//	for(int i=1;i<=100;i++)
//	{
//		if(i%2!=0) 
//		{
//			System.out.println("number is odd "+i);
//		}
//		
//	}
	
//----------- Java Program to Find Sum of first 10 Natural Numbers
	
//	int sum=0;
//	for(int i=1;i<=10;i++)
//	{
//		sum=sum+i;
//	}
//	System.out.println("Sum of first 10 Natural Numbers "+sum);
	
//--------Java Program to Find multiplication of first 10 Natural Numbers
	 
	
//	int multi=1;
//	for(int i=1;i<=10;i++)
//	{
//		multi=multi*i;
//	}
//	System.out.println("multi of first 10 Natural Numbers "+multi);
	
	
//-----------Java Program for Fibonacci Series upto 10 level
	//In fibonacci series, next number is the sum of previous two numbers 
	//for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
	//0,1,1,2,3,5,8,13,21,34
	
	
//	int firsttnum=0;  
//	int secondnum=1;  
//	int sum=0;  //assume
//	
//	System.out.print(firsttnum +","+secondnum);
//	//loop start from 2 because 0 & 1 are already print. 
//	for(int i=2;i<10;i++)
//	{
//         sum=firsttnum+secondnum;// 2+3=5
//         firsttnum=secondnum;//2
//		   secondnum=sum;	//3
//	
//		 System.out.print(","+sum);
//	}
	
//-------------------Java Program for Palindrome Number
	// palindrome number -->A palindrome number is a number that is same after reverse. 
    //For example 545, 151, 34543, 343, 171, 48984 are the palindrome number.
	
//	int numb=151;
//	
//	int rem,sum=0,temp;
//	temp=numb;
//	
//	while(numb>0)   //151>0    , 15>0   ,1>0 
//	{
//		rem=numb%10;   //151%10=1      15%10=5      1%10=1
//		sum=(sum*10)+rem;//0*10+1=1     1*10+5=15    15*10+1=151
//		numb=numb/10;	//151/10=15    15/10=1       1/10=0
//	}
//	if(temp==sum)//151==151
//	{
//		System.out.println("It is a palindrome number");
//	}
//	else
//	{
//		System.out.println("Not a palindrome number");
//	}
	
//--------------------------How to reverse a number
	//example.     98---->89
	
//	int numb=98;
//	int rem,rev=0;
//	
//	while(numb!=0) //98 != 0 , 9 != 0
//	{
//		rem=numb%10;	 //98%10=8  , 9%10=9
//		rev=rev*10+rem;  //0*10+8=8  ,  8*10+9=89
//		numb=numb/10;    //98/10=9  ,   9/10=0
//	}
//	System.out.println(rev);
	
//-------------Java Program for Factorial of any number
	//example.  10=1*2*3*4*5*6*7*8*9*10
	
//	int fact=1;
//	
//	for(int i=1;i<=10;i++)
//	{
//		fact=fact*i;
//	}
//	System.out.println("Factorial of number 10 is "+fact);
	
//----------------Java Program for Armstrong Number in Java
	
	//sum of cubes of its digits
	//153---> (1*1*1)+(5*5*5)+(3*3*3)=1+125+27=153
	
//	int numb=153;
//	int rem,temp,result=0;
//    temp=numb;
//	
//	while(numb>0)
//	{
//		rem=numb%10;//153%10=3   ,  15%10=5  , 1%10=1
//		numb=numb/10; //153/10=15  , 15/10=1  , 1/10=0
//		result=result+(rem*rem*rem);//0+(3*3*3)=27 ,27+(5*5*5)=152, 152+(1*1*1)=153
//	}
//	if(result==temp)
//	{
//		System.out.println("Number is a Armstrong Number");
//	}
//	else
//	{
//		System.out.println("Number is not a Armstrong Number");
//	}
	
//--------Java Program to Find Largest of Four Numbers(use AND/OR Operator)
	
//	int a=20;
//	int b=30;
//	int c=40;
//	int d=50;
//	
//	if(a>b && a>c && a>d)
//	{
//		System.out.println(a+" is a largest number");
//	}
//	else if(b>c && b>d && b>a)
//	{
//		System.out.println(b+" is a largest number");
//	}
//	else if(c>d && c>a && c>b)
//	{
//		System.out.println(c+" is a largest number");
//	}
//	else
//	{
//		System.out.println(d+" is a largest number");
//	}
	
	
//-----------Java Program to Swap Two Numbers with and without using third variable
	//Swap Two Numbers with third variable.
	
//	int a=100;
//	int b=200;
//	int temp;
//	
//	temp=a;
//	a=b;
//	b=temp;
//	
//	System.out.println("a value become "+a);
//	System.out.println("b value become "+b);
//	
//	System.out.println();
//	//Swap Two Numbers without third variable.
//	
//	int x=100;
//	int y=200;
//	
//	x=x+y;  //300
//	y=x-y;  //100
//	x=x-y;  //200
//	
//	System.out.println("x value become "+x);
//	System.out.println("y value become "+y);
	
//----------------Java Program to Display Prime Number 
	
	//-> number should be divisible by 1 and itself
	// -> 3 -> divide -> 3, 1  -->prime
	// -> 4 -> divide -> 1,2,4 --> no prime
	 //-> 5 -> divide -> 1, 5  -> prime

//	int numb=7;// we have take one variable.
//	int temp=0;//we have take one more variable temp and given value 0.
//	
//	for(int i=2;i<=numb-1;i++)
//	{
//		if(numb%i==0)  //4/2= 0 == 0 --->t
//		{
//			temp=temp+1;
//		}
//	}
//	if(temp==0)
//	{
//		System.out.println("number is prime");
//	}
//	else
//	{
//		System.out.println("number is  not prime");
//	}
	
	
//------------Java Program to Check if a Given Number is Perfect Square
	//A perfect square is a number that can be expressed as 
	                          //the product of an integer by itself.
//For example, 25 is a perfect square because it is the product of integer 5 by itself, 
	          //5 × 5 = 25
	
//	int num=4 ;
//	int count=0;
//	for(int i=1;i<=num;i++)//i=1 --t, i=2 ,i =3 ,i=4
//	{
//		if(num==i*i)//4==1---f,4==2--f,4==3--f,4==4--t
//		{
//			count=1;//true
//		}
//	}
//	if(count==1)//true
//		System.out.println("Perfect square");
//	else
//		System.out.println("Not Perfect Square");
	
	
//--------------How to Print ASCII Value in Java
	//ASCII value for character
	
//	char c='A';
//	int i=c;
//	
//	System.out.println("ASCII value of "+ c +"=="+i);

	//----------------------------------------------------------------------------------------//
	
//GCD Greatest Common Divisor: It is the highest number that completely divides two or more numbers. 
//	GCF(Greatest Common Factor) OF 12 and 8

// Factors of 12: 1, 2, 3, 4, 6, 12
//	Factors of 8: 1, 2, 4, 8
//	Common Factors: 1, 2, 4
//	Greatest Common Factor: 4
//	Hence, the GCF of 12 and 8 is 4.
	
		//x and y are the numbers to find the GCF  
	//	int x = 12, y = 8, gcd = 1;  
		//running loop form 1 to the smallest of both numbers  
	//	for(int i = 1; i <= x && i <= y; i++)  
		{  
		//returns true if both conditions are satisfied   
	//	if(x%i==0 && y%i==0)  
		//storing the variable i in the variable gcd  
	//	gcd = i;  
		}  
		//prints the gcd  
	//.out.printf("GCD of %d and %d is: %d", x, y, gcd);  	
	
//----------------------------------------------------------------------------------------/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
		
}
