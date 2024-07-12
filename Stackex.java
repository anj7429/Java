import java.util.Scanner;
class Stackexception{
Stackexception(String s)
{
super(s);
}
}
class Stack{
stack[];
int tos;
Stack(int size)
{
tos=-1;
stack=new int[size];
}
void push(int item,int size)throws Stackexception
{
if(tos==size-1)
{
throw new Stackexception("STACK OVERFLOW");
}
else
return stack[++tos]=item;
}
void pop()throws Stackexception{
if(tos<0)
{
throw new Stackexception(Stack UNDERFLOW");
}
else
return stack[--tos];
}
};
class Stackex{
public static void main(String args[])
{
int c;
int n;
Scanner sc =new Scanner(System.in);
System.out.println("enter the size:");
int size=sc.nextInt();
Stack ob=new Stack(size);