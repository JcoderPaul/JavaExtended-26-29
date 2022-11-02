package Less_26_ch_5_BufferedReader;
/*
Простое чтение из файла и вывод прочитанного на экран.
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Less_26_BufferedReader_Step1 {
    public static void main(String[] args) {
        System.out.println("*** Начало программы ***\n");

        String file_for_read = "src\\Less_26_ch_5_BufferedReader\\FileForWork\\file_for_read.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(file_for_read))) {
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n*** Конец программы ***");
    }
}
