import java.util.Scanner;
class Excep{
public static void main(String a[])
{
int result;
int deno,num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of numerator :");
num=sc.nextInt();
try{
deno=0;
result=num/0;
System.out.println("Answer is "+result);
}
catch(ArithmeticException err)
{
System.out.println("Divide by 0");
System.out.println("Exception "+err);
}
}
}
