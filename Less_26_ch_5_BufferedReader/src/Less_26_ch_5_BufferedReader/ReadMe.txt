******* Чтение текста и BufferedReader *******

Класс BufferedReader считывает текст из символьного потока ввода, буферизируя прочитанные символы.
Использование буфера призвано увеличить производительность чтения данных из потока.

Класс BufferedReader имеет следующие конструкторы:
- BufferedReader(Reader in) - создает буферный поток ввода символов, из которого производится чтение и
                              который использует размер буфера по умолчанию;
- BufferedReader(Reader in, int sz) -создает буферный поток ввода символов, из которого производится чтение,
                                     но, который использует указанный размер буфера в который будут считываться
                                     символы;

Так как BufferedReader наследуется от класса Reader, то он может использовать все те методы для
чтения из потока, которые определены в Reader. И также BufferedReader определяет свой собственный
метод readLine(), который позволяет считывать из потока построчно.

Методы:
- close() - закрыть поток;
- mark(int readAheadLimit) - отметить позицию в потоке;
- markSupported() - поддерживает ли отметку потока;
- int read() - прочитать буфер;
- int read(char[] cbuf, int off, int len) - прочитать буфер;
- String readLine() - следующая строка;
- boolean ready() - может ли поток читать;
- reset() - сбросить поток;
- skip(long n) - пропустить символы;

!!! Нужно помнить, что не всякий класс подходит для работы с бинарными файлами !!!