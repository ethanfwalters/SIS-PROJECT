import java.util.*;
import java.util.ArrayList;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.*;
public class informations
	{
		static ArrayList<Data> roster = new ArrayList<Data>();
		DecimalFormat decFor = new DecimalFormat("0.0");
		static String reallist;
		
		public static void fillStudentInformation() throws IOException
			{
				Scanner file = new Scanner(new File("studentList.txt"));
				while(file.hasNextLine())
					{
						String list =file.nextLine();
						String [] reallist= list.split(" ");
						
					}
				for(int i=0; i< reallist.length() ;i++)
					{
						 roster.add(new Data());
					}
			}
		
			
	}
