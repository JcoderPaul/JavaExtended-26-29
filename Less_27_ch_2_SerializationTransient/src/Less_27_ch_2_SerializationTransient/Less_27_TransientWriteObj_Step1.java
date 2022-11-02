package Less_27_ch_2_SerializationTransient;

import Less_27_ch_2_SerializationTransient.MyClasses.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Less_27_TransientWriteObj_Step1 {
    public static void main(String[] args) {
        System.out.println("*** Программа начата ***");
        // Указываем относительный путь к файлам для записи информации
        String path_file_hero = "src\\Less_27_ch_2_SerializationTransient\\InOutFile\\hero_info.bin";
        String path_file_weapon = "src\\Less_27_ch_2_SerializationTransient\\InOutFile\\weapon_info.bin";
        // Создаем сериализованные объекты, часть полей помечены transient, т.е. не будут переданы
        Weapon ice_sword = new Weapon("Ледяной меч",123.45);
        Hero my_best_hero = new Hero("Малкольм", 18, 226, ice_sword);
        /*
        В блоке try-with-resources создаем ObjectOutputStream и записываем необходимую информацию
        в указанные файлы, причем запись идет через FileOutputStream переданный в ObjectOutputStream.
        */
        try(ObjectOutputStream oos_hero = new ObjectOutputStream(new FileOutputStream(path_file_hero));
            ObjectOutputStream weapon_oos = new ObjectOutputStream(new FileOutputStream(path_file_weapon))){
            /*
            Записываем в поток ввода-вывода наши объекты, часть полей которых помечены transient
            */
            oos_hero.writeObject(my_best_hero);
            weapon_oos.writeObject(ice_sword);

            System.out.println("Данные записаны в файл");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        /*
        Обратный процесс (десериализация) представлен в
        файле Less_27_TransientReadObj_Step2
        */
        System.out.println("*** Программа завершена ***");
    }
}
