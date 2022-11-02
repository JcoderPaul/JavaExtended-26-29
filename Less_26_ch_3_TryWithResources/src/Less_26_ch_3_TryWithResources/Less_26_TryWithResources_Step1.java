package Less_26_ch_3_TryWithResources;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Less_26_TryWithResources_Step1 {
    public static void main(String[] args) {
        System.out.println("*** Начало программы ***\n");
        // Указываем путь к файлу для чтения и записи
        String file_for_read_path = "src\\Less_26_ch_3_TryWithResources\\FilesForRead\\file_for_read.txt";
        String file_for_write_path = "src\\Less_26_ch_3_TryWithResources\\FilesForWrite\\file_for_write.txt";
        /*
        В блоке Try-With-Resources запускаем наши потоки записи-чтения,
        которые после завершения процесса будут автоматически закрыты.
        */
        try(FileReader myFileReader = new FileReader(file_for_read_path);
            FileWriter myFileWriter = new FileWriter(file_for_write_path)){
            int char_for_read;
            while ((char_for_read = myFileReader.read()) != -1){
                myFileWriter.write(char_for_read);
            }
            System.out.println("Чтение-запись прошли успешно...");
        } catch (IOException exception){
            exception.getCause();
            exception.getStackTrace();
        }
        System.out.println("\n*** Конец программы ***");
    }
}
