import java.util.*;
class Test6
//Logical Operator
{
public static void main(String[]Sname)
{
int value1=10;
int value2=20;
int value3=10;

boolean value=(10 < 20) && (100 > 50) &&  (5 == 5);

System.out.println(value);
boolean Result=(true) && (false) && (false);
System.out.println(Result);
boolean Result1=(value1 < value2) && (value2 > value3) && (value3 >= value1) && (value1 == value3);
System.out.println(Result1);
boolean Result2=(value1 > value2) || (value3 != 10) || (value2 > 100) ||(1000 > 500);
System.out.println(Result2);
boolean b1 = false;
boolean Result4 =!b1;
System.out.println(Result4);

}
}