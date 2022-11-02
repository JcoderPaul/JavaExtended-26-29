package Less_27_ch_1_Serialization.ProgrammerProducer;
/*
Записываем объекты в файл, сериализация объектов.
*/
import Less_27_ch_1_Serialization.MyClasses.Car;
import Less_27_ch_1_Serialization.MyClasses.Employee;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Less_27_SerializationWriteFile_Step1 {
    public static void main(String[] args) {
        System.out.println("*** Программа начата ***");
        // Указываем относительный путь к файлам для записи информации
        String path_file = "src\\Less_27_ch_1_Serialization\\FileForExchange\\simple_str_base.bin";
        String path_file_emp = "src\\Less_27_ch_1_Serialization\\FileForExchange\\emp_ser_base.bin";
        // Создаем сериализованные объекты
        Car timus_car = new Car("RR Fantom","Black");
        Employee worker_one =
                new Employee("Таймус", "Teacher", 126, 3456, timus_car);
        /*
        Создаем List и заполняем его объектами, следует помнить, что и List и String,
        имплементируют интерфейс Serializable, по этому с легкостью обрабатываются в
        ObjectOutputStream.
        */
        List<String> employees = new ArrayList<>();
        employees.add("Малкольм");
        employees.add("Дуглас");
        employees.add("Санара");
        employees.add("Лин");
        /*
        В блоке try-with-resources создаем ObjectOutputStream и записываем необходимую информацию
        в указанные файлы, причем запись идет через FileOutputStream переданный в ObjectOutputStream.
        */
        try(ObjectOutputStream oos_exchange = new ObjectOutputStream(new FileOutputStream(path_file));
            ObjectOutputStream emp_ser_base = new ObjectOutputStream(new FileOutputStream(path_file_emp))){
            /*
            Записываем в поток отдельные объекты (а объекты у нас всегда ссылки на них),
            наш List и нашего работника (с объектом машиной внутри)
            */
            oos_exchange.writeObject(employees);
            emp_ser_base.writeObject(worker_one);

            System.out.println("Данные записаны в файл");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        /*
        Обратный процесс (десериализация) представлен в
        файле Less_27_SerializationReadFile_Step2
        */
        System.out.println("*** Программа завершена ***");
    }
}