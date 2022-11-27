import java.io.*;
import java.text.*;
import java.util.*;
public class StudentList {
	static	Constants constants = new Constants();
// get input from textfile 
	public static BufferedReader getBufferedReader () {
				try 
				{
					BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(constants.inputfile)));
					return bufferedReader;
				}
				catch(FileNotFoundException e)
				{
					e.printStackTrace();
				}
				return null;
	}
	public static void main(String[] args) {
		


		if(args[0].equals(constants.inputfile1 )) {
			if (args.length != 1)
			{
				System.out.println("please enter valid Argument");
			}
			System.out.println("Loading data ...");			
			try {
					BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(constants.inputfile))); 
					String readString = bufferedReader.readLine();
					String i[] = readString.split(",");			
					for(String j : i)
					 { 
						System.out.println(j); 
					 }
				}
			catch (Exception e){} 

			   System.out.println("Data Loaded.");
		}
		else if(args[0].equals(inputfile2 ))
		if (args.length != 1)
		{
			System.out.println("please enter valid Argument");
		}
		
		 else if(args[0].contains(constants.inputfile3))

		{
			
							
				System.out.println("Data Loaded.");	
		}
		 if(args[0].contains(constants.inputfile4 )) 
		{
			System.out.println("Loading data ...");			
			try {
					BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("students.txt"))); 
					String readString = bufferedReader.readLine();
					String i[] = readString.split(",");	
					boolean done = false;
					String inpuString = args[0].substring(1);
					for(int idx = 0; idx<i.length && !done; idx++) {
					if(i[idx].equals(t)) {
					System.out.println("We found it!");
					done=true;
				}
			}
			} catch (Exception e){} 
			System.out.println("Data Loaded.");				
		}
		else if(args[0].contains(constants.inputfile4)) 
		if (args.length != 1)
		{
			System.out.println("please enter valid Argument");
		}
		{
			System.out.println("Loading data ...");			
			try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("students.txt"))); 
			String newdata = bufferedReader.readLine();
			char a[] = newdata.toCharArray();			
			boolean in_word = false;
			int count=0;
			for(char c:a)
			 {

				if(c ==' ') 
				{
					if (!in_word)
					 {	count++; 
						in_word =true;
					}
					else 
					{ 
						in_word=false;
					}			
				}
			}
			System.out.println(count +" word(s) found " + a.length);
			} catch (Exception e){} 
			System.out.println("Data Loaded.");				
		}
	}
}