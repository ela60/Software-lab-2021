import java.io.*;
import java.text.*;
import java.util.*;
public class StudentList {
 static	Constants constants = new Constants();
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
		// Check arguments
		if (args[0].equals(constants.inputfile1)) {
			if (args.length != 1) {
				System.out.println("please enter valid arg");
			} else {
				System.out.println("Loading data ...");
				try {
					BufferedReader bufferedReader = getBufferedReader();
					String reaString = bufferedReader.readLine();
					String i[] = reaString.split(",");
					for (String j : i) {
						System.out.println(j);
					}
				} catch (Exception e) {
				}
				System.out.println("Data Loaded.");
			}
		} else if (args[0].equals( constants.inputfile2)) {
			if (args.length != 1) {
				System.out.println("valid arg");
			} else {
				System.out.println("Loading data ...");
				try {
					BufferedReader bufferedReader = getBufferedReader();
					String readString = bufferedReader.readLine();
					String i[] = readString.split(",");
					int y = (int) ((double) Math.random() * (int) i.length);
					System.out.println(i[y]);
				} catch (Exception e) {
				}
				System.out.println("Data Loaded.");
			}
		} else if (args[0].contains(constants.inputfile3)) {
			System.out.println("Loading data ...");
			try {
				BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("students.txt", true));
				String inputString = args[0].substring(1);
				Date newdDate = new Date();
			
				bufferedWriter.write(", " + inputString + "\nList last updated on " + dateFormat.format(newdDate));
				bufferedWriter.close();
			} catch (Exception e) 
		}
		