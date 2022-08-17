class I
{
int i;

I(int i)
{
this.i=i;
System.out.println(i);
}
I(float i)
{
System.out.println(i);
}
I(int i,String j)

public static void main(String[]ref)
{
I obj = new I(10);
System.out.println(obj.i);
}
}

//constructer name and class name should be same
//constructer it dont have any return type and static keywords
//constructer is used for this inititalization specialy for type of variables
//constructer execute during the new object creation
//constructer can have any type of arg-constructer
//same type same argument will not allow between the constructer 