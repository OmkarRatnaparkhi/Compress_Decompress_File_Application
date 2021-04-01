import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.FileOutputStream; 
import java.io.IOException; 
import java.util.zip.Deflater; 
import java.util.zip.DeflaterOutputStream; 
  
class Zip 
{ 
    public static void main(String[] args) throws IOException 
	{ 
        //Assign the original file : file to 
        //FileInputStream for reading data 
		
        FileInputStream fis=new FileInputStream("C:\\Users\\Omkar\\Desktop\\miniProjects\\CompressDecompress\\src\\file1.txt"); 
  
        //Assign compressed file:file2 to FileOutputStream 
        FileOutputStream fos=new FileOutputStream("C:\\Users\\Omkar\\Desktop\\miniProjects\\CompressDecompress\\src\\file2.txt"); 
  
        //Assign FileOutputStream to DeflaterOutputStream 
        DeflaterOutputStream dos=new DeflaterOutputStream(fos); 
  
        //read data from FileInputStream and write it into DeflaterOutputStream 
        int data; 
        while ((data=fis.read())!=-1) 
        { 
            dos.write(data); 
        } 
		
		System.out.println("Successfull Compression of file");
  
        //close the file 
        fis.close(); 
        dos.close(); 
    } 
} 