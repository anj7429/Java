interface A{
private static void display()
{
System.out.println("Static function");
}
public void show();
}
class B implements A{
public void show()
{
System.out.println("Interface A");
}
public static void main(String args[])
{
A obj=new B();
obj.display();
obj.show();
}
}