class TwoShape{
private double radius;
TwoShape(double r)
{
radius=r;
}
double getr()
{
return radius;
}
void setr(double r)
{
radius =r;
}
void show()
{
System.out.println("Radius :"+radius);
}
}
class Circle extends TwoShape
{
double radius,area_circle;
Circle(double r)
{
super(r);
}
void setr(double r)
{
radius =r;
}
void area()
{
//super.show();
area_circle=3.14*radius*radius;
}
void show()
{
super.show();
System.out.println("AREA OF CIRCLE : "+area_circle);
}
}
class Quespaperf{
public static void main(String args[])
{
TwoShape ref;
ref=new TwoShape(4);
ref.show();
ref=new Circle(4);
ref.show();
}
} 