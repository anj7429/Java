public class Greater{
public int max(int x,int y){
if(x>y)
return x;
else
return y;
}
public static void main(String args[])
{
Greater ob=new Greater();
int num=ob.max(3,7);
System.out.println("Greater number is "+num);
}
}