package Less_28_IO_RandomAccessFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Less_28_RandomAccessFile_Step1 {
    public static void main(String[] args) {
        String path_to_file = "src\\Less_28_IO_RandomAccessFile\\FileForAccess\\Vers.txt";

        try(RandomAccessFile file_for_access = new RandomAccessFile(path_to_file, "rw")){
            /*
            Чтение файла стартует с 0-го символа, при его чтении, курсор - pointer
            смещается вперед, на величину прочитанного.
            */
            int a = file_for_access.read(); // Читаем первый символ 'T'
            System.out.println((char) a);
            a = file_for_access.read(); // Читаем следующий за ним 'w'
            System.out.println((char) a);

            /*
            Читаем следующую строку, поскольку мы уже сместились на 2-а символа,
            то на экране будет: 'o households, both alike in dignity,'
            !!! курсор снова смещается !!!
            */
            String line1 = file_for_access.readLine();
            System.out.println(line1);

            /*
            Мы можем получить доступ к определенному байту и попробовать
            прочитать (внести изменения) и вывести символ или строку или ...
            */
            file_for_access.seek(134); // Получаем доступ
            String line2 = file_for_access.readLine(); // Читаем строку с 134 байта
            System.out.println(line2); // Это четвертая строка, начиная с 11 символа
            /*
            Найдем позицию нашего курсора-pointer, после всех выше проделанных
            операций.
            */
            long position_pointer = file_for_access.getFilePointer();
            System.out.println(position_pointer);
            /*
            Добавление байтов происходит с заменой существующей информации,
            поэтому при добавлении в начало или в середину, неких данных,
            мы затрем имеющиеся (по крайней мере, на учебном материале, я
            не углублялся в тему и не нашел вариантов чистой вставки, без
            замены существующих 'байтов').

            В данном случае мы добавим некий текст в конец текущего.
            */
            file_for_access.seek(file_for_access.length()); // Находим конец файла
            file_for_access.writeBytes("\n\n \t\t\t Romeo and Juliet. THE PROLOGUE."); // Делаем вставку

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
