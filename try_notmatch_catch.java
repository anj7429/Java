class Exception1{
int a,b;
void excep()
{
try{
a=0;
b=23/a;
int c[]={1,2};
c[42]=60;
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("Catch is called");
}

finally{
System.out.println("Final block is called");
}
}
}
class try_notmatch_catch{
public static void main(String args[]){
Exception1 ob=new Exception1();
ob.excep();
}
}