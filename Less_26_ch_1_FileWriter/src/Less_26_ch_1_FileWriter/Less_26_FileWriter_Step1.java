package Less_26_ch_1_FileWriter;
/*
Пример посимвольной записи текста в файл.
*/
import java.io.FileWriter;
import java.io.IOException;

public class Less_26_FileWriter_Step1 {
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
            // Явно указываем путь к файлу (файл уже нами создан)
            myFileWriter = new FileWriter("E:\\JavaExtended\\Less_26_ch_1_FileWriter\\src" +
                                            "\\Less_26_ch_1_FileWriter\\FilesForWrite\\file_for_write.txt");
            /*
            В цикле посимвольно считываем строку "quatrain_one" и так же
            посимвольно записываем данный в указанный файл.
            */
            for (int i = 0; i < quatrain_one.length(); i++){
                myFileWriter.write(quatrain_one.charAt(i));
            }
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
