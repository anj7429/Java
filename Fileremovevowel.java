import java.io.*;
class Fileremovevowel{
public static void main(String args[])throws IOException
{
try(BufferedReader br=new BufferedReader(new FileReader(args[0])))
{
String str=" ";
int i=0;
while((str=br.readLine())!=null)
{
for(i=0;i<str.length();i++)
{
if(str.charAt(i)=='a' ||(str.charAt(i)=='A') ||(str.charAt(i)=='e') ||(str.charAt(i)=='E')||(str.charAt(i)=='i')||(str.charAt(i)=='I')||(str.charAt(i)=='o')||(str.charAt(i)=='O')||(str.charAt(i)=='u')||(str.charAt(i)=='U'))
{
continue;
}
else
{
System.out.println(str.charAt(i));
}
}
}
}
//catch(IOException e)
catch(FileNotFoundException e)

{
System.out.println("Cann't open the file");
}
}
}