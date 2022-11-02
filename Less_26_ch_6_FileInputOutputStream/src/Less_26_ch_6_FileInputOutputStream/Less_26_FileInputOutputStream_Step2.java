package Less_26_ch_6_FileInputOutputStream;

import java.io.*;

public class Less_26_FileInputOutputStream_Step2 {
    public static void main(String[] args) {
        System.out.println("*** Начало программы ***\n");
        // Указываем путь к файлу для чтения и записи
        String file_for_read_path = "src\\Less_26_ch_6_FileInputOutputStream\\WorkingFile\\picture_for_read.jpg";
        String file_for_write_path = "src\\Less_26_ch_6_FileInputOutputStream\\FileForWrite\\picture_copy.jpg";
        /*
        В блоке Try-With-Resources запускаем наши потоки записи-чтения,
        которые после завершения процесса будут автоматически закрыты.
        */
        try(FileInputStream fis_reader = new FileInputStream(file_for_read_path);
            FileOutputStream fos_writer = new FileOutputStream(file_for_write_path)){
            int i;
            while ((i = fis_reader.read()) != -1){
                fos_writer.write(i);
            }
            System.out.println("Чтение-запись прошли успешно...");
        } catch (IOException exception){
            exception.getCause();
            exception.getStackTrace();
        }
        System.out.println("\n*** Конец программы ***");
    }
}
