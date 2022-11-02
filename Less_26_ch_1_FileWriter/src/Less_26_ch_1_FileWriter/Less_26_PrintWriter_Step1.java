package Less_26_ch_1_FileWriter;

/**
 Класс Java.io.PrintWriter печатает отформатированные представления объектов в поток вывода текста.
 Этот класс реализует все методы печати, которые находятся в printstream.
 Конструкторы класса PrintWriter:
 - PrintWriter(File file, String csn) - создает новый PrintWriter без автоматической очистки строки.
 Он создает его с указанным файлом и набором символов.
 - PrintWriter(OutputStream out, boolean autoFlush) - создает новый PrintWriter из уже существующего
 выходного потока.
 - PrintWriter(OutputStream out) - создает новый PrintWriter из существующего OutputStream.
 - PrintWriter(String fileName, String csn) - создает новый PrintWriter, в котором указаны имя файла и кодировка.
 - PrintWriter(String fileName) - создает новый PrintWriter с указанным именем файла без автоматической
 очистки строки.
 - PrintWriter(Writer out) - создает новый PrintWriter без автоматической очистки строки.
 - PrintWriter(Writer out, boolean autoFlush) - создает новый PrintWriter.
 - PrintWriter(File file) - создает новый PrintWriter, без автоматической очистки строки, с указанным файлом.
 **/

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Less_26_PrintWriter_Step1 {
    public static void main(String[] args) {
        String path_for_file = "src\\Less_26_ch_1_FileWriter\\FilesForWrite\\file_to_print_write.txt";
        try {
            /*
            Создаем ссылку на объект PrintWriter с указанием пути
            до файла, даже если его нет, он будет создан.
            */
            PrintWriter write_file = new PrintWriter(path_for_file);
            for(int i = 0; i < 1000; i++){
/**
 * Метод и описание:
 * - public void write(int c) throws IOException <-> Записывает один символ.
 * - public void write(char [] c, int offset, int len) <-> Записывает часть массива символов,
 * начиная с offset, длиной len.
 * - public void write(String s, int offset, int len) <-> Записывает часть строки, начиная со смещения и длины len.
 **/
                /*
                Записываем в файл значения инкремента i из цикла
                и добавляем перенос строки при записи.
                */
                write_file.write(i + "\n");
            }
/**
 * When you write data to a stream, it is not written immediately, and it is buffered.
 * So use flush() when you need to be sure that all your data from buffer is written.
 * We need to be sure that all the writes are completed before we close the stream,
 * and that is why flush() is called in file/buffered writer's close().
 * But if you have a requirement that all your writes be saved anytime before you
 * close the stream, use flush().
 **/
            write_file.flush();
            // Закрываем поток записи.
            write_file.close();
        } catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
