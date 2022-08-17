class G
{
int i=10;
G()
{
System.out.println("From constructer");
}

G(int i)
{
System.out.println("1 arg constructer " +i);
}
G(int i,int j)
{
System.out.println("2 arg constructer "+i+","+j);
}
G(int i,int j,String s1)
{
System.out.println("3 arg constructer "+i+","+j+","+s1);
}
G(int i,int j,String s1,boolean b1)

{
System.out.println("4 arg constructer "+i+","+j+","+s1+","+b1);
}

public static void main(String[]ref)
{
G Nobj = new G(10);
G obj = new G(10);
G obj1 = new G(10,20);
G obj2 = new G(10,20,"raj");
G obj3 = new G(10,20,"raj",true);
method1(10);
}
public static void method1(int i)
{

}
}





