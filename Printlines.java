import java.io.*;
class Printlines{
public static void main(String args[])throws Exception
{
int i;
try(BufferedReader br=new BufferedReader(new FileReader(args[0])))
{
String str=" ";
while((str=br.readLine())!=null)
{
if((str.charAt(0)=='/') &&(str.charAt(1)=='/'))
{
System.out.println(str);
}
}
}
catch(FileNotFoundException err)
{
System.out.println("Could not open");
}
}
}