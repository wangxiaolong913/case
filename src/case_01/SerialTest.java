package case_01;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;



public class SerialTest
{ 
    public static void main(String[] args) throws IOException
    {
      Serial serial1 = new Serial(2, "song");
     serial1.toString();
    }
}