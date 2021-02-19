package week13.src;

import java.io.*;

public class FileReaderExample {

    public static void main(String[] args) {
        try(
                FileReader reader = new FileReader("sample.txt");
                BufferedReader bufferedReader = new BufferedReader(reader);
        ) {
            String readLine = null;
            while( ( readLine =  bufferedReader.readLine()) != null ){
                System.out.println(readLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
