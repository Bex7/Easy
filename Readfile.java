import java.io.*;
import java.util.*;
import java.lang.*;
class Readfile

{
		public static void main(String[] S)
		{
			
			int added=0;int flag=0;
			try{
			File ifile=new File("FileRead.java");
			File ifile2=new File("FileRead.java");
			//Scanner input1=new Scanner(ifile);
			Scanner input2= new Scanner(ifile2);
			String line2=input2.nextLine();
			//String line=input1.nextLine();
			while(line2!=null)
			{
			flag=0;
			Scanner input1=new Scanner(ifile);
			String line=input1.nextLine();
			while(input1.nextLine()!=null)
			{
			if(line.equals(line2)==true) flag=1;
			System.out.println("hey");
			line=input1.nextLine();
			}
			if(flag==0)added++;
			line2=input2.nextLine();
			}
			}
			catch(IOException e)
			{
			System.out.println("Error");
			
			}
		
		}
	}
			

