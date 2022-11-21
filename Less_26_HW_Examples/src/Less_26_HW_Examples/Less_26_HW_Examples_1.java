package Less_26_HW_Examples;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

/*
Задан файл с текстом, найти и вывести в консоль
все слова, начинающиеся с гласной буквы.
*/
public class Less_26_HW_Examples_1 {
    // Константа с гласными русскими буквами
    private static final String VOWELS = "аоэяиюуеыё";

    public static void main(String[] args) throws IOException {
        // Сформировали абсолютный путь к файлу
        Path pathToReadFile = Path.of
                ("src","Less_26_HW_Examples", "FileForRead", "VerseForRead.txt")
                .toAbsolutePath();
        /*
        Сканер будет считывающим потоком, чтение будет идти
        по словам, словно данные вбиваются с клавиатуры.
        */
        try(Scanner scannerForRead = new Scanner(pathToReadFile)){
            // При наличии хотя бы еще одного слова цикл работает
            while (scannerForRead.hasNext()){
                // Каждой прочитанное слово заносим в переменную для обработки
                String word = scannerForRead.next();
                // Читаем первый символ слова
                char firstSymbol = word.charAt(0);
                /*
                Метод *.indexOf() ищет в строке заданный (искомый) символ или строку,
                и возвращает их индекс (т.е. порядковый номер).
                Метод:
                - возвращает индекс, под которым искомый символ или строка первый раз
                появляется в строке, в которой производят поиск;
                - возвращает (-1) если символ или строка не найдены.

                В нашем случае, мы ищем в строке VOWELS = "аоэяиюуеыё", а также в этой
                же строке, но еще и в верхнем регистре, возможные совпадения с первым
                символом каждого слова из текста считанного из файла VerseForRead.txt
                при помощи объекта Scanner и его методов.
                */
                if(VOWELS.indexOf(firstSymbol) != -1 || VOWELS.toUpperCase().indexOf(firstSymbol) != -1){
                    System.out.println(word);
                }
            }
        }
    }
}
