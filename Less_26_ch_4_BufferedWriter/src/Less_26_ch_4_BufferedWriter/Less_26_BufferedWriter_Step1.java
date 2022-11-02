package Less_26_ch_4_BufferedWriter;
/*
Простая запись в файл двух строк.
*/
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Less_26_BufferedWriter_Step1 {
    public static void main(String[] args) {
        String path = "src\\Less_26_ch_4_BufferedWriter\\FileForWrite\\hello_write_file.txt";
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
            String text = "Привет мир!";
            bufferedWriter.write(text);
            bufferedWriter.newLine();
            bufferedWriter.write(text);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
