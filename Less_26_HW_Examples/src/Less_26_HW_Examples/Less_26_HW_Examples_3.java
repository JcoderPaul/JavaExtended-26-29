package Less_26_HW_Examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/*
Задан файл с текстом. В каждой строке найти и
вывести наибольшее число цифр, идущих подряд.
*/
public class Less_26_HW_Examples_3 {
    public static void main(String[] args) throws IOException {
        // Задали путь к файлу
        Path pathToReadFile = Path
                .of("src","Less_26_HW_Examples", "FileForRead", "DigitalVerse.txt");
        /*
        Метод *.readAllLines(Path) класса Files возвращает
        массив строк из прочитанного текстового файла.
        */
        Files.readAllLines(pathToReadFile)
             // Получаем стрим
             .stream()
             // Применяем наш метод и превращаем стрим String в стрим Integer
             .map(string -> findMaxDigitSubsequence(string))
             // Выводим на экран итоговый стрим
             .forEach(System.out::println);
    }
    /*
    Метод подсчитывает количество цифровых символов
    подряд в цифровой подстроке (последовательности)
    */
    private static Integer findMaxDigitSubsequence(String inLine){
        int result = 0; // Инициализируем результирующий ответ
        int countNumChar = 0; // Инициализируем счетчик символов
        // Цикл перебирает символы строки по всей ее длине
        for(int i = 0; i < inLine.length(); i++){
            // Проверяем, цифра ли наш i-ый символ
            if(Character.isDigit(inLine.charAt(i))){
                // Если да то увеличиваем счетчик
                countNumChar++;
            } else {
                /*
                Если нет, значит числовая последовательность закончилась
                и мы сравниваем предыдущее количество цифр в последовательности
                с текущим. Если текущее количество больше, перезаписываем
                результирующее значение на него, мы же ищем самую длинную
                подстроку.
                */
                if(result < countNumChar){
                    result = countNumChar;
                }
                // Обнуляем счетчик, для следующего подсчета символов
                countNumChar = 0;
            }
        }
        // Возвращаем количество символов в самой длинной последовательности
        return result;
    }
}