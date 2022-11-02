package Less_27_ch_2_SerializationTransient;

import Less_27_ch_2_SerializationTransient.MyClasses.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Less_27_TransientReadObj_Step2 {
    public static void main(String[] args) {
        System.out.println("*** Программа начата ***");
        // Указываем относительный путь к файлам для записи информации
        String path_file_hero = "src\\Less_27_ch_2_SerializationTransient\\InOutFile\\hero_info.bin";
        String path_file_weapon = "src\\Less_27_ch_2_SerializationTransient\\InOutFile\\weapon_info.bin";
        Hero deserializedHero;
        Weapon deserializedWeapon;

        try(ObjectInputStream ois_hero = new ObjectInputStream(new FileInputStream(path_file_hero));
            ObjectInputStream ois_weapon = new ObjectInputStream(new FileInputStream(path_file_weapon))){
            /*
            Читаем из потока ввода-вывода наши объекты, часть полей которых помечены transient
            */
            deserializedHero = (Hero) ois_hero.readObject();
            System.out.println(deserializedHero);
            /*
            Результат на экране, поля закрытые для передачи (не сериализованные)
            имеют 'условно пустое' содержимое '0.0' или 'null'
            */
            deserializedWeapon = (Weapon) ois_weapon.readObject();
            System.out.println(deserializedWeapon);

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
