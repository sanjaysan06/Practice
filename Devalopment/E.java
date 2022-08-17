class E
{

static int i=0;

public static void main(String[]args)
{
E obj = new E();
String[]arr={"raj","san","10"};
method1(arr);
}

public static void method1(String[] name)
{
i++;
if(i<10)
{
main (name);

}

System.out.println("From method1"+name[0]);
System.out.println("From method1"+name[1]);
System.out.println("From method1"+name[2]);
}
}