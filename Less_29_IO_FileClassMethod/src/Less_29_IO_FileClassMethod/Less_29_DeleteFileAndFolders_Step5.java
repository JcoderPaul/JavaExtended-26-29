package Less_29_IO_FileClassMethod;
/*
Простая проверка методов:
- *.delete()
*/
import java.io.File;

public class Less_29_DeleteFileAndFolders_Step5 {
    public static void main(String[] args) {

        String make_file = "src\\Less_29_IO_FileClassMethod\\MyFolder\\MySecondFile.txt";
        File file = new File(make_file);

        String make_folder = "src\\Less_29_IO_FileClassMethod\\MyFolderThree";
        File folder = new File(make_folder);

        String make_folders = "src\\Less_29_IO_FileClassMethod\\MyFolderFour\\MyFolderFive";
        File folders = new File(make_folders);


        System.out.println(file.delete() ? "Файл/каталог удален." : "Файл/каталог не удален.");
        System.out.println(folder.delete() ? "Файл/каталог удален." : "Файл/каталог не удален.");
        /*
        Удален только самый вложенный каталог т.е. из
        src\Less_29_IO_FileClassMethod\MyFolderFour\MyFolderFive
        остался
        src\Less_29_IO_FileClassMethod\MyFolderFour
        */
        System.out.println(folders.delete() ? "Файл/каталог удален." : "Файл/каталог не удален.");
        System.out.println("------------------------------------------------------------------------");
    }
}
