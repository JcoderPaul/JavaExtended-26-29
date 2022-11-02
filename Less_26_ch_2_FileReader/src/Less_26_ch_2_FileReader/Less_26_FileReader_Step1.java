package Less_26_ch_2_FileReader;

import java.io.FileReader;
import java.io.IOException;

public class Less_26_FileReader_Step1 {
    public static void main(String[] args) throws IOException {
        System.out.println("*** Начало программы ***\n");
        // Указываем путь к файлу для чтения
        String path_to_read_file = "src\\Less_26_ch_2_FileReader\\FilesForRead\\file_for_read.txt";

        FileReader myFileReader = null;

        try {
            myFileReader = new FileReader(path_to_read_file);
            int char_for_read;
            while ((char_for_read = myFileReader.read()) != -1){
                System.out.print((char) char_for_read);
            }
            System.out.println(" ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            myFileReader.close();
        }
        System.out.println("\n*** Конец программы ***");
    }
}
