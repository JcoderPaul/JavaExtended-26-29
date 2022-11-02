package Less_27_ch_3_SerialVersionUID;
/*
Имитируем прием и десериализацию новой версии класса (объекта)
*/
import Less_27_ch_3_SerialVersionUID.SerializedClass.Worker;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Less_27_SerialVersionUID_Read_Step2 {
    public static void main(String[] args) {
        System.out.println("*** Программа начата ***");
        // Указываем относительный путь к файлам для записи информации
        String path_file = "src\\Less_27_ch_3_SerialVersionUID\\DirForSerialization\\worker_info.bin";
        Worker deserializedWorker;

        try(ObjectInputStream ois_worker = new ObjectInputStream(new FileInputStream(path_file))){

            deserializedWorker = (Worker) ois_worker.readObject();
            System.out.println(deserializedWorker);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("*** Программа завершена ***");
    }
}
