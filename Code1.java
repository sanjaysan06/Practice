/*
Types Casting:	
  
   Type casting is a way of converting data from one data type to another data type.

  	1.Impicit casting
	2.Expicit casting

1.Implicit Casting:

 	-> Casting happens automatically by jvm. 
	-> It converts low data type to High data type and it equal also.

	Byte -> Short -> Int -> Long -> Float -> Double 
          1       2       4       8        4        8
 
2.Expicit Casting:

	-> Casting happens manually.
	-> It assign data type of high range to lower range.
	
	Double -> FLoat -> Long -> Int -> Short -> Byte
          8         4        8      4       2       1


*/

// EXAMPLE


import java.util.*;
class Code1
{
public static void main(String[]args)
{
int i=10;
short s=100;
long l=i;  //Implicit casting

byte b=(byte)s;// Expicit casting

System.out.println(l);
System.out.println(b);
}
}