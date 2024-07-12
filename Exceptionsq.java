import java.util.Scanner;
class MyException extends Exception{
private int num;
public MyException(int n)
{
num=n;
}
public String toString()
{
return "Number is negative";
}
}
class Exceptionsq{
public void MySqrt(int n)throws MyException
{
if(n<0)
{
throw new MyException(n);
}
else
{
System.out.println("Square root of "+n +" is "+(Math.sqrt(n)));
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Exceptionsq ob=new Exceptionsq();
try{
System.out.println("Enter the number :");
int n=sc.nextInt();
ob.MySqrt(n);
}
catch(MyException err)
{
System.out.println("ERROR!");
System.out.println(err);
}
}
}