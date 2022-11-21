package Less_26_HW_Examples;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

/*
Задан файл с текстом, найти и вывести в консоль все слова,
для которых последняя буква одного слова совпадает с первой
буквой следующего слова.
*/
public class Less_26_HW_Examples_2 {
    public static void main(String[] args) throws IOException {
        Path pathToReadFile = Path
                .of("src","Less_26_HW_Examples", "FileForRead", "VerseForRead.txt")
                .toAbsolutePath();
        // Как и в предыдущем примере создаем в блоке try-with-resources запускаем сканер
        try(Scanner scannerForRead = new Scanner(pathToReadFile)){
           // Присваиваем null первому (предыдущему) слову
           String prevWord = null;
           if(scannerForRead.hasNext()){
               // Первое присвоение предыдущего слова перед циклом
               prevWord = scannerForRead.next();
           }
           while(scannerForRead.hasNext()){
               // Сканируем последующее слова
               String currentWord = scannerForRead.next();
               // Запускаем метод сравнения букв предыдущего и последующего слова
                if(isEqualsFirstSymbolCurrentWordAndLastSymbolPrevWord(prevWord, currentWord)){
                    // Выводим сочетание слов подошедших под условие
                    System.out.println(prevWord + " " + currentWord);
                }
                /*
                Теперь предыдущее слово стало последующим и
                мы ждем следующего последующего слова или
                конца текста, т.е. выхода из цикла.
                */
               prevWord = currentWord;
           }
        }
    }
    // Метод сравнивающий последнюю букву предыдущего слова с первой буквой последующего
    private static boolean isEqualsFirstSymbolCurrentWordAndLastSymbolPrevWord
                                                        (String prevWord, String currentWord) {
        /*
        У нас могут быть четыре варианта (не в данном тексте, а в принципе)
        совпадения символов с учетом регистра (знаки препинания будут мешать,
        но о них в задании ничего не упоминалось, поэтому варианты типа:
        'крот: трус' или 'крот - трус' и т.д. в выборку не попадут):
        -> X == X;
        -> X == x;
        -> x == X;
        -> x == x;
        Задаем нужные соответствия, на возможные варианты символов.
        Конструкт 'charAt(prevWord.length()-1)' дает последний символ слова.
        */
        char bigEndChar = prevWord.toUpperCase().charAt(prevWord.length()-1);
        char smallEndChar = prevWord.toLowerCase().charAt(prevWord.length()-1);
        char bigFirstChar = currentWord.toUpperCase().charAt(0);
        char smallFirstChar = currentWord.toLowerCase().charAt(0);
        // Находим совпадения по условию, независимо от регистра букв
        boolean answer = (bigEndChar == bigFirstChar ||
                          smallEndChar == smallFirstChar ||
                          bigEndChar == smallFirstChar ||
                          smallEndChar == bigFirstChar
                         );
        return answer;
    }
}
