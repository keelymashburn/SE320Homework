import java.io.*;
import java.util.Arrays;
import java.util.TreeSet;

public class question2 
{
	public static void main(String[] args) throws Exception
	{
		//make file w/ random words
		File file = new File("words.txt");
		
		try 
		{
			BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream(file)), 100);
			
			String inputString; 
			StringBuilder sb = new StringBuilder(100);
			
			//get strings
			while ((inputString = input.readLine()) != null)
			{
				sb.append(inputString);				
			}

            String[] words = sb.toString().split(",");
            
            // sort and remove doubles
            TreeSet<String> orderedWords = new TreeSet<>(Arrays.asList(words));

            //print words in order
            for (String s : orderedWords)
            {
            	System.out.println(s + "\n");
            }
		}
		catch (Exception E)
		{
			E.printStackTrace();
		}
	}
}
