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
System.out.println("Catch block");
}
finally{
System.out.println("Final block is called");
}
System.out.println("Finally statement block is called");
}
}
class Exception2{
public static void main(String args[]){
Except ob=new Except();
ob.excep();
}
}