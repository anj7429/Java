import java.io.*;
class CommandDemo{
 public static void main(String args[])throws IOException{
  int i;
  FileInputStream fin;
  FileOutputStream fout;
  try{
   fin=new FileInputStream(args[0]);
   fout=new FileOutputStream(args[1]);
  }
  catch(FileNotFoundException e){
   System.out.println("Unable to open the file");
   return;
  }
  try{
   do{
    i=fin.read();
    if(i!=-1){
     fout.write(i);
    }
   }while(i!=-1);
  }
  catch(IOException e){
   System.out.println("Error cannot open");
   }
   try{
     fin.close();
    }
    catch(IOException err){
      System.out.println("Couldnot open");
    }
   try{
   fout.close();
   }
   catch(IOException e)
{
System.out.println("Cannot open ");
}
  }
 }