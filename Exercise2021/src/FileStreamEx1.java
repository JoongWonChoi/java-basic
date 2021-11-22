import java.io.*;
public class FileStreamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String filename = "tes.txt";
			FileInputStream fis = new FileInputStream(filename);
			FileReader fr = new FileReader(filename);
			
			int data = 0;
			while((data = fis.read())!=-1) {
				System.out.print((char)data);
			}
			System.out.println();
			fis.close();
			
			while((data=fr.read())!=-1) {
				System.out.print((char)data);
			}
			System.out.println();fr.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
