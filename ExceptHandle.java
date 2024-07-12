public class ExceptHandle{
void test(int a,int b)throws ArithmeticException
{
if(b==0)
throw new ArithmeticException();
else
{
int c=a/b;
System.out.println("C: "+c);
}
}
public static void main(String args[])
{
ExceptHandle ob=new ExceptHandle();
try{
ob.test(30,0);
}
catch(ArithmeticException e)
{
System.out.println(e);
System.out.println("Divide by zero");
}
}
}