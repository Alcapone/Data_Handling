import java.io.*;
import java.util.Arrays;

public class D3_Data_handling {

	public D3_Data_handling() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("file opened :" + args);
		
		BufferedReader CSVFile = 
		        new BufferedReader(new FileReader(args[0]));
		String dataRow = CSVFile.readLine(); 
		while (dataRow != null){
			   String[] dataArray = dataRow.split(",");
			   for (String item:dataArray) { 
			      System.out.print(item + "\t"); 
			   }
			   System.out.println(); // Print the data line.
			   dataRow = CSVFile.readLine(); // Read next line of data.
			  }
		CSVFile.close();

		

	}

}
