package Less_26_ch_1_FileWriter;
/*
Пример записи текста в файл одной строкой и
дальнейшего добавления следующей строки в тот же файл
(есть вариант полной перезаписи, есть вариант добавления).
*/
import java.io.FileWriter;
import java.io.IOException;

public class Less_26_FileWriter_Step3 {
    public static void main(String[] args) throws IOException {
        System.out.println("Main запущен");
        String quatrain_one = "Мело, мело по всей земле\n" +
                              "Во все пределы.\n" +
                              "Свеча горела на столе,\n" +
                              "Свеча горела.";

        String quatrain_two = "Как летом роем мошкара\n" +
                              "Летит на пламя,\n" +
                              "Слетались хлопья со двора\n" +
                              "К оконной раме.";
        // Выносим путь к нашему файлу в отдельную переменную
        String path_to_file = "src\\Less_26_ch_1_FileWriter\\FilesForWrite\\file_for_write_3.txt";
        /*
        Класс FileWriter создаёт объект, производный от класса Writer, который применяется
        для записи файла. Есть конструкторы, которые позволяют добавить вывод в конец файла.
        Создание объекта не зависит от наличия файла, он будет создан в случае необходимости.
        Если файл существует и он доступен только для чтения, то передаётся исключение IOException.
         */
        FileWriter myFileWriter = null;
        try {
            /*
            Применяем перегруженный конструктор с флагом true, который говорит,
            что метод *.write() должен не перезаписывать файл, а добавлять данные
            в его конец.
            */
            myFileWriter = new FileWriter(path_to_file, true);
            // Записываем строку "quatrain_one" в указанный файл целиком.
            myFileWriter.write(quatrain_one);
            /*
            Записываем строку "quatrain_one" в указанный файл целиком,
            в данной реализации кода добавляем строку.
            */
            myFileWriter.write("\n *** \n");
            myFileWriter.write(quatrain_two);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            /*
            Для успешного окончания записи в файл (финализируем) закрываем
            поток ввода-вывода FileWriter
            */
            myFileWriter.close();
        }
        System.out.println("Main завершен");
    }
}
