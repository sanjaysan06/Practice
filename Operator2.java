import java.util.*;
class Operator2
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your age");

int age = sc.nextInt();

String Result = (age > 50)? (age > 100)?"Greater 100":
(age>80)?"Greater 80":"between 50 to 80":
(10<age)?"lessthan 10 ":(age<20)?"lessthan20":"lessthan 20-50";
System.out.println(Result);
}
}