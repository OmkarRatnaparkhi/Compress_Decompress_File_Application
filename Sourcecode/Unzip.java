import java.io.FileInputStream; 
import java.io.FileOutputStream; 
import java.io.IOException; 
import java.util.zip.InflaterInputStream; 
  
//Uncompressing a file using an InflaterInputStream 
class Unzip 
{ 
    public static void main(String[] args) throws IOException 
	{ 
        //assign Input File : file2 to FileInputStream for reading data 
        FileInputStream fis=new FileInputStream("C:\\Users\\Omkar\\Desktop\\miniProjects\\CompressDecompress\\src\\file2.txt"); 
        
		//assign output file: file3 to FileOutputStream for reading the data 
        FileOutputStream fos=new FileOutputStream("C:\\Users\\Omkar\\Desktop\\miniProjects\\CompressDecompress\\src\\file3.txt"); 
          
        //assign inflaterInputStream to FileInputStream for uncompressing the data 
        InflaterInputStream iis=new InflaterInputStream(fis); 
          
        //read data from inflaterInputStream and write it into FileOutputStream  
        int data; 
        while((data=iis.read())!=-1) 
        { 
            fos.write(data); 
        } 
		
		System.out.println("Successfull Decompression of file");
          
        //close the files 
        fos.close(); 
        iis.close(); 
          
    } 
}