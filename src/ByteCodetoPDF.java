
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class ByteCodetoPDF {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		/*
		 * File file = new
		 * File("C:\\Users\\EdmundAunstinG\\Documents\\BraodBand Bills\\Broadband Bill_April.pdf"
		 * ); FileInputStream fis = new FileInputStream(file); byte [] data = new
		 * byte[(int)file.length()]; fis.read(data); ByteArrayOutputStream bos = new
		 * ByteArrayOutputStream(); data = bos.toByteArray();
		 * System.out.println(file.length());
		 */
		 
		Path pdfPath = Paths.get("C:\\Users\\EdmundAunstinG\\Documents\\BraodBand Bills\\Broadband Bill_April.pdf");
		byte[] pdf = Files.readAllBytes(pdfPath);
	      
	      System.out.println(pdf);
	      OutputStream out = new FileOutputStream("C:\\Users\\EdmundAunstinG\\Documents\\BraodBand Bills\\out.pdf");
	      out.write(pdf);
	      out.close();
	}

}
