class Student{
String name; //instance variable
int id;      //instance variable
}
class Class1{
public static void main(String args[])
{
Student ob=new Student();
Student ob1;      //dynamic memory allocation
ob1=new Student();
ob.name="Anjali";
ob.id=9;
ob1.name="Sana";
ob1.id=23;

System.out.println(ob.name);
System.out.println(ob.id);
System.out.println(ob1.name);
System.out.println(ob1.id);
}
}