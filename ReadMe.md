### ******* IO (Input & Output) API *******

IO API – (Input & Output) в первую очередь это Java API, которые облегчают работу с потоками.
Очень часто приходится получать какой-то поток данных, а потом как-то их обрабатывать и
отправлять дальше. Например, пользователь ввел логин и пароль, программа в свою очередь должна
получить эти данные, обработать и сохранить в файл. Для этих целей можно использовать IO.

В Java библиотека IO API находится в пакете java.io и для того чтобы начать использовать
IO достаточно импортировать данную библиотеку.

Input and Output – Назначение:
В java.io существуют так называемые потоки ввода и вывода (InputStream and OutputStream).
В основном java.io предназначен для чтения/записи данных из/в ресурс:
1) файл;
2) при работе с сетевым подключением;
3) System.err, System.in, System.out;
4) при работе с буфером.

В Java IO много классов которые в основном работают с потоками чтения и записи, и решают
различные задачи:
- получения доступа к файлам; 
- получение сетевого соединения;
- работа с буфером; 
- доступ к внутринему буферу памяти; 
- межпоточнное общение; 
- парсинг данных; 
- чтение и запись текста; 
- чтение и запись примитивных данных (long, int, float …); 
- чтение и запись объектов.

Классы Java IO API:
- Базовые:
  - InputStream / OutputStream 
  - [Reader](https://github.com/JcoderPaul/JavaExtended-26-29/tree/master/Less_26_ch_2_FileReader/src/Less_26_ch_2_FileReader) / [Writer](https://github.com/JcoderPaul/JavaExtended-26-29/tree/master/Less_26_ch_1_FileWriter/src/Less_26_ch_1_FileWriter) 
  - InputStreamReader / OutputStreamWriter
- Массивы:
  - ByteArrayInputStream / ByteArrayOutputStream 
  - CharArrayReader / CharArrayWriter
- Files:
  - [FileInputStream / FileOutputStream](https://github.com/JcoderPaul/JavaExtended-26-29/tree/master/Less_26_ch_6_FileInputOutputStream/src/Less_26_ch_6_FileInputOutputStream) 
  - [RandomAccessFile ](https://github.com/JcoderPaul/JavaExtended-26-29/tree/master/Less_28_IO_RandomAccessFile/src/Less_28_IO_RandomAccessFile)
  - [FileReader](https://github.com/JcoderPaul/JavaExtended-26-29/tree/master/Less_26_ch_2_FileReader/src/Less_26_ch_2_FileReader) / [FileWriter](https://github.com/JcoderPaul/JavaExtended-26-29/tree/master/Less_26_ch_1_FileWriter/src/Less_26_ch_1_FileWriter)
- Буферизация:
  - BufferedInputStream / BufferedOutputStream 
  - [BufferedReader](https://github.com/JcoderPaul/JavaExtended-26-29/tree/master/Less_26_ch_5_BufferedReader/src/Less_26_ch_5_BufferedReader) / [BufferedWriter](https://github.com/JcoderPaul/JavaExtended-26-29/tree/master/Less_26_ch_4_BufferedWriter/src/Less_26_ch_4_BufferedWriter)

Но у Java IO есть свои недостатки:
- Блокирующий доступ для ввода/вывода данных. Проблема состоит в том, что когда разработчик
  пытается прочитать файл или записать что-то в него, используя Java IO, он блокирует файл
  и доступ к нему до момента окончания выполнения своей задачи;
- Отсутствует поддержка виртуальных файловых систем;
- Нет поддержки ссылок;
- Очень большое количество checked исключений;

Работа с файлами всегда влечет за собой работу с исключениями: например, попытка создать новый
файл, который уже существует, вызовет IOException и т.п.