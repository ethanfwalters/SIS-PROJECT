import java.util.*;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.*;
public class informations
	{
		static ArrayList<Data> roster = new ArrayList<Data>();
		
		public static void fillStudentInformation() throws IOException
			{
				Scanner file = new Scanner(new File("studentList.txt"));
				while(file.hasNextLine())
					{
						String list =file.nextLine();
						String [] reallist= list.split(" ");
					}
			}
		
			
	}
