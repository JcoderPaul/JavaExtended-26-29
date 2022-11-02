package Less_27_ch_3_SerialVersionUID;

import Less_27_ch_3_SerialVersionUID.SerializedClass.Worker;

import java.io.*;

/*
Имитируем работу первого программиста, который сериализовал
одну версию класса (объекта) и передал второму программисту для
десериализации, у которого есть другая версия этого класса.
*/
public class Less_27_SerialVersionUID_Write_Step1 {
    public static void main(String[] args) {

        System.out.println("*** Программа начата ***");

        // Указываем относительный путь к файлам для записи информации
        String path_file = "src\\Less_27_ch_3_SerialVersionUID\\DirForSerialization\\worker_info.bin";
        // Создаем сериализованный объект
        Worker worker_for_transfer =
                new Worker("Таймус","Роддерик", 123,4537, "MasterDep");

        try(ObjectOutputStream oos_worker = new ObjectOutputStream(new FileOutputStream(path_file))){

            oos_worker.writeObject(worker_for_transfer);

            System.out.println("Данные записаны в файл");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("*** Программа завершена ***");

    }
}

