package Less_26_HW_Examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/*
Задан файл с JAVA-кодом. Прочитать текст программы из файла и все
слова public в объявлении атрибутов и методов класса заменить на
слово private. Результат сохранить в другой заранее созданный файл.
*/
public class Less_26_HW_Examples_4 {
    public static void main(String[] args) throws IOException {
        Path pathToReadFile = Path
                .of("src","Less_26_HW_Examples", "FileForRead", "PublicToPrivate.java");
        Path pathToWriteFile = Path
                .of("src","Less_26_HW_Examples", "FileForWrite", "PublicToPrivateResult.txt");
        /*
        static String readString(Path path) - считывает все содержимое файла в
        строку, декодируя байты в символы, используя кодировку UTF-8. Этот
        метод гарантирует, что файл будет закрыт, когда все содержимое будет
        прочитано или возникнет ошибка ввода-вывода или другое исключение
        времени выполнения.

        Этот метод эквивалентен: readString(path, StandardCharsets.UTF_8)
        */
        String strToChange = Files.readString(pathToReadFile);
        /*
        У объекта типа String есть две вариации метода замены — replace:
        - replace(char1, char2) - заменяет все вхождения символа первого аргумента
          char1 вторым — char2;

        - replace(CharSequence1, CharSequence2) - заменяет каждую подстроку строки,
          которая соответствует указанной последовательности символов CharSequence1,
          на последовательности символов замены CharSequence2;
        */
        String strResultOfChange = strToChange.replace("public", "private");
        try {
            // Создаем директорию перед тем, как закинуть туда файл, проверяем на ее наличие
            if(!Files.exists(pathToWriteFile.getParent())){
                Files.createDirectory(pathToWriteFile.getParent());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*
        - static Path writeString (Path path, CharSequence csq, OpenOption... options) -
        метод записывает CharSequence в файл.
        Параметры:
        - path - путь к файлу для записи
        - csq - последовательность символов для записи;
        - options - параметры, определяющие, как файл открывается (см.
        https://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/nio/file/OpenOption.html
        и
        https://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/nio/file/StandardOpenOption.html)
        */
        Files.writeString(pathToWriteFile, strResultOfChange);
    }
}
