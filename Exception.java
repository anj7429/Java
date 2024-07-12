class Exception{
public static void main(String args[])
{
int num=4;
int result;
int deno=0;
try{
deno=0;
result=num/0;
System.out.println("Answer is "+result);
}
catch(ArithmeticException err)
{
System.out.println("Divide by 0");
}
}
}