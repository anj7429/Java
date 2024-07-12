class Shape{
void show()
{
System.out.println("Superclass show");
}
}
class Rectangle extends Shape{
private int l,b;
public Rectangle()
{
l=0;
b=0;
}
public Rectangle(int l,int b)
{
this.l=l;
this.b=b;
}
void show()
{
System.out.println("Area of rectangle : "+(l*b));
}
}
class Circle extends Shape{
private int ba,h;
public Circle()
{
ba=0;
h=0;
}
public Circle(int ba,int h)
{
this.ba=ba;
this.h=h;
}
void show()
{
System.out.println("Area of circle : "+(0.5*ba*h));
}
}
class Quespaperj{
public static void main(String args[])
{
Shape ref;
ref=new Rectangle(2,5);
ref.show();
ref=new Circle(2,8);
ref.show();
}
}