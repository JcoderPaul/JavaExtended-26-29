package Less_26_ch_5_BufferedReader;

import java.io.*;

public class Less_26_BufferedReader_Step2 {
    public static void main(String[] args) {
        System.out.println("*** Начало программы ***\n");
        // Указываем путь к файлу для чтения и записи
        String file_for_read_path = "src\\Less_26_ch_5_BufferedReader\\FileForWork\\file_for_read.txt";
        String file_for_write_path = "src\\Less_26_ch_5_BufferedReader\\FileForWork\\file_for_write.txt";
        /*
        В блоке Try-With-Resources запускаем наши потоки записи-чтения,
        которые после завершения процесса будут автоматически закрыты.
        Создаем объекты для чтения и записи (причем это своеобразные обертки
        для объектов FileReader и FileWriter) через буфер.
        */
        try(BufferedReader b_reader = new BufferedReader(new FileReader(file_for_read_path));
            BufferedWriter b_writer = new BufferedWriter(new FileWriter(file_for_write_path))){
            int char_for_read;
            while ((char_for_read = b_reader.read()) != -1){
                b_writer.write(char_for_read);
            }
            System.out.println("Чтение-запись прошли успешно...");
        } catch (IOException exception){
            exception.getCause();
            exception.getStackTrace();
        }
        System.out.println("\n*** Конец программы ***");
    }
}
