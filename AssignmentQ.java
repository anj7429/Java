import java.util.Scanner;
class Person{
private String name;
public Person(String name)
{
this.name=name;
}
public void print()
{
System.out.println("Name of person : "+name);
}
}
class Student extends Person
{
public int marks;
public Student(String name,int marks)
{
super(name);
this.marks=marks;
}
public void print()
{
System.out.println("Marks of student : "+marks);
}
}
class Employee extends Person
{
public double salary;
public Employee(String name,double salary)
{
super(name);
this.salary=salary;
}
public void print()
{
System.out.println("Salary of person : "+salary);
}
}
class AssignmentQ
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your name :");
String name=sc.nextLine();
System.out.println("Enter your marks:");
int marks=sc.nextInt();
System.out.println("Enter your salary :");
double salary=sc.nextDouble();
Person p;
p=new Person(name);
p.print();
p=new Student(name,marks);
p.print();
p=new Employee(name,salary);
p.print();
}
}