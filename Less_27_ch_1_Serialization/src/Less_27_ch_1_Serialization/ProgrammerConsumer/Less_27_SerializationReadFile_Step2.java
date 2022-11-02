package Less_27_ch_1_Serialization.ProgrammerConsumer;
/*
Читаем объекты из файла, десериализация объектов.
*/
import Less_27_ch_1_Serialization.MyClasses.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Less_27_SerializationReadFile_Step2 {
    public static void main(String[] args) {
        System.out.println("*** Программа начата ***");
        // Создаем пустые ссылки на наши будущие объекты
        Employee exchangeEmployee;
        List<String> employees;
        // Пути откуда будем читать файлы
        String path_file = "src\\Less_27_ch_1_Serialization\\FileForExchange\\simple_str_base.bin";
        String path_file_emp = "src\\Less_27_ch_1_Serialization\\FileForExchange\\emp_ser_base.bin";
        /*
        В блоке try-with-resources создаем ObjectInputStream и читаем необходимую информацию из
        указанных файлов, (формируем входящий поток) причем чтение идет через FileInputStream
        переданный в ObjectInputStream.
        */
        try(ObjectInputStream ois_exchange = new ObjectInputStream(new FileInputStream(path_file));
            ObjectInputStream ser_emp_read = new ObjectInputStream(new FileInputStream(path_file_emp))){
            /*
            Передаем ссылке на объект, наш десериализованный объект методом *.readObject(), а
            поскольку мы принимаем объект, то должны кастомизировать, какой именно объект мы
            приняли, в нашем случае это (ArrayList) и (Employee).

            Далее просто выводим объекты на экран.
            */
            employees = (ArrayList) ois_exchange.readObject();
            System.out.println(employees);

            exchangeEmployee = (Employee) ser_emp_read.readObject();
            System.out.println(exchangeEmployee);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        /*
        Процесс записи в файл через поток данных (сериализация)
        представлен в файле Less_27_SerializationWriteFile_Step1
        */
        System.out.println("*** Программа завершена ***");
    }
}
