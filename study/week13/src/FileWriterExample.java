package week13.src;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String[] args) {
        try(
            FileWriter writer = new FileWriter("sample.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
        ) {
            bufferedWriter.write("자바 스터디");
            bufferedWriter.newLine();
            bufferedWriter.write("13주차 IO!");
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
