import java.util.Scanner;
class Complexno{
float x,y;
Complexno(float i,float j)
{
x=i;
y=j;
}
void sum(Complexno n1,Complexno n2)
{
x=n1.x+n2.y;
y=n1.x+n2.y;
}
void mul(Complexno m,Complexno n)
{
x=m.x*n.y;
y=m.x*n.y;
}
public String toString()
{
return x+"+"+y+"i";
}
}
class Complex{
public static void main(String s[])
{
 Scanner sc=new Scanner(System.in);
            System.out.println("Enter the values of a and b: ");
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println("Enter the values of c and d: ");
            int c=sc.nextInt();
            int d=sc.nextInt();
            Complexno c1=new Complexno(a,b);
		System.out.println(c1.toString());
		//System.out.print(c1);
		Complexno c2=new Complexno(c,d);
            System.out.println(c2.toString());
		Complexno c3=new Complexno(0,0);
		c3.sum(c1,c2);
            System.out.println(c3.toString());
		Complexno c4=new Complexno(0,0);
		c4.mul(c1,c2);
            System.out.println(c4.toString());
}
}