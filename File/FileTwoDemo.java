package File;

import java.io.FileNotFoundException;
import java.util.Formatter;

public class FileTwoDemo {

	public static void main(String[] args) {
		try {
			Formatter formatter = new Formatter("C:/Users/Cm Tanvir/Desktop/person/student.txt");
			formatter.format("%s %s\r\n","101","Imam");
			formatter.format("%s %s\r\n","102","Tanvir");
			formatter.format("%s %s\r\n","102","CM");
			formatter.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		}
	}
}
