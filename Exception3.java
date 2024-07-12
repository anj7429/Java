class Except{
int a,b;
void excep()
{
try{
a=0;
b=30/a;
System.out.println("EXCEPTION HANDLING");
}
catch(ArithmeticException e)
{
System.out.println("Exception : "+e);
System.out.println("Divisor cannot be zero");
}
System.out.println("Catch block");
}
}
class Exception3{
public static void main(String args[]){
Except ob=new Except();
ob.excep();
}
}