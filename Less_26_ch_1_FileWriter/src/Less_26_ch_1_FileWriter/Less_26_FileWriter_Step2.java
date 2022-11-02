package Less_26_ch_1_FileWriter;
/*
Пример записи текста в файл одной строкой (хотя, как мне
намекнули, под капотом запись идет посимвольно).
*/
import java.io.FileWriter;
import java.io.IOException;

public class Less_26_FileWriter_Step2 {
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
        /*
        Класс FileWriter создаёт объект, производный от класса Writer, который применяется
        для записи файла. Есть конструкторы, которые позволяют добавить вывод в конец файла.
        Создание объекта не зависит от наличия файла, он будет создан в случае необходимости.
        Если файл существует и он доступен только для чтения, то передаётся исключение IOException.
         */
        FileWriter myFileWriter = null;
        try {
            /*
            Путь к файлу указан относительный, не полный !!! см. пример Less_26_FileWriter_Step1, где
            путь указан полностью (файл перед запуском программы можно удалить, он автоматически будет создан)
            */
            myFileWriter = new FileWriter("src\\Less_26_ch_1_FileWriter\\FilesForWrite\\file_for_write_2.txt");
            // Записываем строку "quatrain_one" в указанный файл целиком.
            myFileWriter.write(quatrain_one);
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
