package File;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		File file1 = new File("C:/Users/Cm Tanvir/Desktop/person/imam.txt");
		File file2 = new File("C:/Users/Cm Tanvir/Desktop/person/cm.txt");
		/**dir.mkdir(); // Directory Will be created
		String dirlocation = dir.getAbsolutePath();
		System.out.println(dirlocation);// view the path of the directory
		System.out.println(dir.getName());//directory name ta dekhabe
		// dlete the diectory
		if(dir.delete()) {
			System.out.println("directory has been deleted");
		}**/
		
		try {
			file1.createNewFile();
			file2.createNewFile();
			System.out.println("File Have been created");
			
		}catch (Exception e) {
			System.out.println(e);
			
		}
	}

}
